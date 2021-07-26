/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
        
import Model.Database;
import Model.Transaksi;
import View.historyframe;
import View.menuutama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Titan
 */
public class ControllerHistory implements ActionListener {

    private historyframe view;
    private Database db;
    Connection conn;
    Statement stmt;
    ResultSet rs;
    
//    public ControllerHistory() {
//        view = new historyframe();
//        db = new Database();
//        view.addActionListener(this);
//        view.setVisible(true);
//        loadTable();
//    }
    
    public void loadTable() {
        DefaultTableModel model = new DefaultTableModel(
                new String[]{"Transaksi ID", "No KTP", "Nama Kereta", 
                    "Nama Masinis", "Keberangkatan", "Tujuan", "Jumlah Tiket",
                    "No Kursi", "Harga Total"}, 0);
        
        List<Transaksi> transaksi = Controller.Driver.a.getListTransaksi();
        for (Transaksi t : transaksi) {
            model.addRow(new Object[]{t.getIdPemesanan(), t.getPembeli().getNoKTP(),
            t.getKereta().getMasinis().getNama(), t.getKereta().getParkir().getKota(),
            t.getKereta().getTujuan().getKota(), t.getJmlhPesan(), t.getKursi(),
            t.getTotal()});
        }
        view.getTransaksi().setModel(model);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnCari())) {
            btnCariActionPerformed();
        } /*else if (source.equals(view.getKembalimenuawal())) {
            kembalimenuawalActionPerformed();
        }*/
    }
    
    public void btnCariActionPerformed() {
        String cari = view.getCari();
        DefaultTableModel model = new DefaultTableModel(
                new String[]{"Transaksi ID", "No KTP", "Nama Kereta", 
                    "Nama Masinis", "Keberangkatan", "Tujuan", "Jumlah Tiket",
                    "No Kursi", "Harga Total"}, 0);
        List<Transaksi> transaksi = Controller.Driver.a.getListTransaksi();
        for (Transaksi t : transaksi) {
            if (t.getPembeli().getNoKTP() == cari) {
                model.addRow(new Object[]{t.getIdPemesanan(), t.getPembeli().getNoKTP(),
                t.getKereta().getMasinis().getNama(), t.getKereta().getParkir().getKota(),
                t.getKereta().getTujuan().getKota(), t.getJmlhPesan(), t.getKursi(),
                t.getTotal()});
            }
        }
        view.getTransaksi().setModel(model);
    }
    
    public void cariTransaksi(String cari) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Transaksi ID", "No KTP", "Nama Kereta", 
                    "Nama Masinis", "Keberangkatan", "Tujuan", "Jumlah Tiket",
                    "No Kursi", "Harga Total"});
        Object[] row = new Object[9];
        
        Database db = new Database();
        connect();
        String query = "SELECT * FROM transaksi WHERE noKTP = '" + cari + "';";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("transaksiID"));
                row[0] = rs.getString("transaksiID");
                //row[1] = rs.getString("nama");
                row[1] = rs.getString("noKTP");
                row[2] = rs.getString("keretaID");
                row[3] = rs.getString("keberangkatan");
                row[4] = rs.getString("tujuan");
                row[5] = rs.getString("kelas");
                row[6] = rs.getInt("jmlhPesan");
                row[7] = rs.getString("noKursi");
                row[8] = rs.getDouble("total");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("wah");
        }
        view.getTransaksi().setModel(model);
        disconnect();
    }
    
    public void cariTrans(String s) {
        ArrayList<Transaksi> list = db.cariTransaksi(s);
        
    }
    
    public void kembalimenuawalActionPerformed() {
//        menuutama A = new menuutama();
//        A.setVisible(true);
//        A.pack();
//        A.setSize(1180, 660);
//        A.setLocationRelativeTo(null);
//        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        historyframe.dispose();
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
    
}
