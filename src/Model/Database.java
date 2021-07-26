/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import View.*;

/**
 *
 * @author Titan
 */
public class Database {
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    private Pembeli p;
//    private List<Pembeli> pembeli = new ArrayList();
//    private List<Masinis> masinis = new ArrayList();
//    private List<Stasiun> stasiun = new ArrayList();
//    private List<Kereta> kereta = new ArrayList();
//    private List<Transaksi> transaksi = new ArrayList();
    
    
    public Database(){
        //loadTransaksi();
    }
    
    public void connect() {
        String url = "jdbc:mysql://localhost/pemesanan_tiket";
        String user = "root";
        String pass = "";
        try {
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect() {
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Pembeli cariPembeli (String p) {
        int i = 0;
        boolean found = false;
        Pembeli temp = null;
        while (i < Controller.Driver.a.getListPembeli().size() && found == false) {
            if (Controller.Driver.a.getListPembeli().get(i).getNoKTP() == p) {
                temp = Controller.Driver.a.getListPembeli().get(i);
                found = true;
            }
            i++;
        }
        return temp;
    }
    
    public Kereta cariKereta (String k) {
        int i = 0;
        boolean found = false;
        Kereta temp = null;
        while (i < Controller.Driver.a.getListKereta().size() && found == false) {
            if (Controller.Driver.a.getListKereta().get(i).getKeretaID() == k) {
                temp = Controller.Driver.a.getListKereta().get(i);
                System.out.println("aya");
                found = true;
            }
            i++;
        }
        return temp;
    }
    
    public void loadTransaksi() {
        
        connect();
        String query = "SELECT * FROM transaksi";
        try {
            rs = stmt.executeQuery(query);
            p = new Pembeli(rs.getString("nama"),rs.getString("noKTP"));
            while (rs.next()){
                Controller.Driver.a.createTransaksi(p,
                        cariKereta(rs.getString("keretaID")), 
                        Integer.valueOf(rs.getString("jmlhPesan")),
                        rs.getString("kelas"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void addTransaksi(Transaksi t) {
        connect();
        String query = "INSERT INTO transaksi VALUES (";
        query += "'" + t.getIdPemesanan() + "', ";
        query += "'" + t.getPembeli().getNama()+ "', ";
        query += "'" + t.getPembeli().getNoKTP() + "', ";
        query += "'" + t.getKereta().getKeretaID() + "', ";
        query += "'" + t.getKereta().getParkir().getKota() + "', ";
        query += "'" + t.getKereta().getTujuan().getKota() + "', ";
        query += "'" + t.getKelas() + "', ";
        query += t.getJmlhPesan() + ", ";
        query += "'" + t.getKursi() + "', ";
        query += t.getTotal() + ")";
        try {
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public ArrayList<Transaksi> cariTransaksi (String cari) {
        ArrayList<Transaksi> list = new ArrayList();
        connect();
        String query = "SELECT * FROM transaksi WHERE noKTP = '" + cari + "'";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                Pembeli pem = new Pembeli(rs.getString("nama"),rs.getString("noKTP"));
                Transaksi t = new Transaksi (rs.getString("transaksiID"), pem, 
                        cariKereta(rs.getString("KeretaID")), rs.getInt("jmlhPesan"),
                        rs.getString("kelas"));
                list.add(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
