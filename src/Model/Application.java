/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Pembeli;
import Model.Stasiun;
import Model.Transaksi;
import java.util.*;
/**
 *
 * @author Titan
 */
public class Application {
    private List<Pembeli> listPembeli;                                          //list semua pembeli
    private List<Masinis> listMasinis;                                          //list semua masinis
    private List<Kereta> listKereta;                                            //list semua kereta
    private List<Stasiun> listStasiun;                                          //list semua stasiun
    private List<Transaksi> listTransaksi;                                      //History pembelian
    private int id = 0;
    private Database db;
    
    public Application() {
        listPembeli = new ArrayList();                                          
        listMasinis = new ArrayList();                                          
        listKereta = new ArrayList();                                           
        listStasiun = new ArrayList();                                          
        listTransaksi = new ArrayList();      
        db = new Database();
    }
    
    public Pembeli createPembeli (String nama, String noKTP) {
        Pembeli p = new Pembeli(nama, noKTP);
        listPembeli.add(p);
        return p;
    }
    
    public Masinis createMasinis (String nama, String noID) {
        Masinis m = new Masinis(nama, noID);
        listMasinis.add(m);
        return m;
    }
    
    public Stasiun createStasiun (String Kota) {
        Stasiun s = new Stasiun(Kota);
        listStasiun.add(s);
        return s;
    }
    
    public void updateStasiun(Stasiun s) {
        s.isiStasiun(listKereta);
        s.setListTujuan();
    }
    
    public Kereta createKereta (String keretaID, int kapasitas, Masinis masinis, Stasiun Parkir, Stasiun Tujuan, long harga) {
        Kereta k = new Kereta(keretaID, kapasitas, masinis, Parkir, Tujuan, harga);
        listKereta.add(k);
        return k;
    }
    
    public Transaksi createTransaksi (Pembeli pembeli, Kereta kereta, int jmlhPesan, String kelas) {
        id++;
        Transaksi t = new Transaksi(id, pembeli, kereta, jmlhPesan, kelas);
        db.addTransaksi(t);
        listTransaksi.add(t);
        return t;
    }

    public List<Pembeli> getListPembeli() {
        return listPembeli;
    }

    public List<Masinis> getListMasinis() {
        return listMasinis;
    }

    public List<Kereta> getListKereta() {
        return listKereta;
    }

    public List<Stasiun> getListStasiun() {
        return listStasiun;
    }

    public List<Transaksi> getListTransaksi() {
        return listTransaksi;
    }
    
    public Stasiun cariStasiun (String s) {
        int i = 0;
        Stasiun temp = null;
        boolean found = false;
        while (i < listStasiun.size() && found == false) {
            if (s == listStasiun.get(i).getKota()) {
                temp = listStasiun.get(i);
                found = true;
            }
            i++;
        }
        return temp;
    }
    
    public Kereta cariKereta (String s) {
        int i = 0;
        Kereta temp = null;
        boolean found = false;
        while (i < listKereta.size() && found == false) {
            if (s == listKereta.get(i).getKeretaID()) {
                temp = listKereta.get(i);
                found = true;
            }
            i++;
        }
        return temp;
    }
    
    public int getId() {
        return id;
    }
    
}
