/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;
/**
 *
 * @author Titan
 */
public class Stasiun {
    private String Kota;                                                        //Nama stasiun
    private List<Kereta> listDisini = new ArrayList();                          //Kereta yang sedang berada di stasiun ini
    private List<String> listTujuan = new ArrayList();                          //Tujuan tiap kereta yang berada di stasiun ini
    
    public Stasiun (String Kota) {
        this.Kota = Kota;
    }
    
    public void isiStasiun (List<Kereta> listKereta) {
        this.setListDisini(listKereta);
        this.setListTujuan();
    }

    public String getKota() {
        return Kota;
    }
    
    public void setKota(String Kota) {
        this.Kota = Kota;
    }
    
    public void setListDisini(List<Kereta> listKereta) {
        for (Kereta list : listKereta) {
            if (list.getParkir() == this) {
                this.listDisini.add(list);
            }
        }
    }
    
    public void setListTujuan() {
        for (Kereta list : listDisini) {
            if (this.listTujuan.contains(list.getTujuan().getKota()) == false) {
                this.listTujuan.add(list.getTujuan().getKota());
            }
        }
    }
    
    public List<String> getListTujuan() {
        return this.listTujuan;
    }
    
    public List<Kereta> getListDisini() {
        return this.listDisini;
    }
    
}
