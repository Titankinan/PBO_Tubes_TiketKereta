/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import Model.Database;
import View.menuutama;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
        

/**
 *
 * @author Titan
 */
public class Driver {
    
    static public Application a;
    static public Database db;
    
    public Driver() {
        a = new Application();
        a.createMasinis("Putra", "M001");
        a.createMasinis("Wahyu", "M002");
        a.createMasinis("Agus", "M003");
        a.createMasinis("Agung", "M004");
        a.createMasinis("Ahmad", "M005");
        a.createMasinis("Kurniawan", "M006");
        a.createMasinis("Budi", "M007");
        a.createMasinis("Adi", "M008");
        a.createMasinis("Arief", "M009");
        a.createMasinis("Yusuf", "M010");
        a.createMasinis("Fajar", "M011");
        a.createMasinis("Abdul", "M012");
        a.createMasinis("Setiawan", "M013");
        a.createMasinis("Bagus", "M014");
        a.createMasinis("Hidayat", "M015");
        a.createMasinis("Rian", "M016");
        a.createMasinis("Angga", "M017");
        a.createMasinis("Burhan", "M018");
        a.createMasinis("Adam", "M019");
        a.createMasinis("Dobleh", "M020");
        
        a.createStasiun("Gambir");
        a.createStasiun("Surabaya");
        a.createStasiun("Solo");
        a.createStasiun("Semarang");
        a.createStasiun("Cirebon");
        a.createStasiun("Bandung");
        a.createStasiun("Malang");
        a.createStasiun("Yogyakarta");
        a.createStasiun("Cilacap");
        a.createStasiun("Jakarta");
        
        a.createKereta("Argo Bromo", 30, a.getListMasinis().get(0), a.cariStasiun("Gambir"), a.cariStasiun("Surabaya"), 40000);
        a.createKereta("Argo Lawu", 30, a.getListMasinis().get(1), a.cariStasiun("Gambir"), a.cariStasiun("Solo"), 45000);
        a.createKereta("Argo Muria", 30, a.getListMasinis().get(2), a.cariStasiun("Gambir"), a.cariStasiun("Semarang"), 30000);
        a.createKereta("Argo Jati", 30, a.getListMasinis().get(3), a.cariStasiun("Gambir"), a.cariStasiun("Cirebon"), 20000);
        a.createKereta("Argo Wilis", 30, a.getListMasinis().get(4), a.cariStasiun("Bandung"), a.cariStasiun("Surabaya"), 32000);
        a.createKereta("Tarumanegara", 30, a.getListMasinis().get(5), a.cariStasiun("Surabaya"), a.cariStasiun("Gambir"), 35000);
        a.createKereta("Parahiyangan", 30, a.getListMasinis().get(6), a.cariStasiun("Surabaya"), a.cariStasiun("Bandung"), 30000);
        a.createKereta("Singasari", 30, a.getListMasinis().get(7), a.cariStasiun("Cirebon"), a.cariStasiun("Surabaya"), 25000);
        a.createKereta("Bintang Sendja", 30, a.getListMasinis().get(8), a.cariStasiun("Surabaya"), a.cariStasiun("Jakarta"), 40000);
        a.createKereta("Argo Dwipangga", 30, a.getListMasinis().get(9), a.cariStasiun("Solo"), a.cariStasiun("Gambir"), 45000);
        a.createKereta("Argo Sindoro", 30, a.getListMasinis().get(10), a.cariStasiun("Semarang"), a.cariStasiun("Gambir"), 30000);
        a.createKereta("Argo Cheribon", 30, a.getListMasinis().get(11), a.cariStasiun("Cirebon"), a.cariStasiun("Gambir"), 20000);
        a.createKereta("Argo Gajayana", 30, a.getListMasinis().get(12), a.cariStasiun("Malang"), a.cariStasiun("Gambir"), 50000);
        a.createKereta("Argo Gajahmada", 30, a.getListMasinis().get(13), a.cariStasiun("Gambir"), a.cariStasiun("Malang"), 50000);
        a.createKereta("Argo Sembrani", 30, a.getListMasinis().get(14), a.cariStasiun("Cilacap"), a.cariStasiun("Jakarta"), 40000);
        a.createKereta("Argo Semtul", 30, a.getListMasinis().get(15), a.cariStasiun("Jakarta"), a.cariStasiun("Cilacap"), 40000);
        a.createKereta("Malioboro Ekspress", 30, a.getListMasinis().get(16), a.cariStasiun("Yogyakarta"), a.cariStasiun("Bandung"), 45000);
        a.createKereta("Argo Bangunkarta", 30, a.getListMasinis().get(17), a.cariStasiun("Bandung"), a.cariStasiun("Yogyakarta"), 45000);
        a.createKereta("Purwojaya", 30, a.getListMasinis().get(18), a.cariStasiun("Solo"), a.cariStasiun("Bandung"), 35000);
        a.createKereta("Senja utama", 30, a.getListMasinis().get(19), a.cariStasiun("Bandung"), a.cariStasiun("Solo"), 35000);
        
        int i = 0;
        while (i < a.getListStasiun().size()) {
            a.updateStasiun(a.getListStasiun().get(i));
            i++;
        }
        
        

    }
    
    public static void main(String[] args) {
        new Driver();
        new ControllerSplash();
        //db = new Database();
        menuutama menu = new menuutama();
        menu.setVisible(true);
        menu.pack();
        menu.setSize(1180, 660);
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
   
    
    
}
