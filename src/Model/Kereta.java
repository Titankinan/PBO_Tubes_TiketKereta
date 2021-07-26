/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Stasiun;
import Model.Transportasi;

/**
 *
 * @author Titan
 */
public class Kereta implements Transportasi{
    private String keretaID;                                                    //Nama kereta dan ID keretanya
    private int kapasitas;                                                      //Kapasitas kereta
    private boolean kelasKereta;                                                //Bernilai false jika ekonomi, dan true jika eksekutif
    private Masinis masinis;                                                    //Masinis yang bertugas
    private Stasiun Parkir;                                                     //Stasiun kereta berada (keberangkatan)
    private Stasiun Tujuan;                                                     //Stasiun tujuan
    private long harga;                                                         //Harga standar kereta, harga bertambah 10% jika kelas eksekutif
    private int terpesan;                                                       //Total kursi yang sudah terpesan
    private int ekonomi;                                                        //Jumlah kursi ekonomi yang terpesan
    private int eksekutif;                                                      //Jumlah kursi eksekutif yang terpesan
    
    public Kereta (String keretaID, int kapasitas, Masinis masinis, Stasiun Parkir, Stasiun Tujuan, long harga) {
        terpesan = 0;
        ekonomi = 0;
        eksekutif = 0;
        this.keretaID = keretaID;
        this.kapasitas = kapasitas;
        this.masinis = masinis;
        this.Parkir = Parkir;
        this.Tujuan = Tujuan;
        this.harga = harga;
    }
    
    public long getHarga() {
        if (kelasKereta) {
            return harga + (harga * 10/100);
        } else {
            return harga;
        }
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public String getKeretaID() {
        return keretaID;
    }

    public void setKeretaID(String keretaID) {
        this.keretaID = keretaID;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int Kapasitas) {
        this.kapasitas = kapasitas;
    }

    public boolean getKelasKereta() {
        return kelasKereta;
    }

    public void setKelasKereta(boolean kelasKereta) {
        this.kelasKereta = kelasKereta;
    }

    public Masinis getMasinis() {
        return masinis;
    }

    public void setMasinis(Masinis masinis) {
        this.masinis = masinis;
    }

    public Stasiun getParkir() {
        return Parkir;
    }

    public Stasiun getTujuan() {
        return Tujuan;
    }
    
    public void dipesan(boolean kelas, int jumlah) {
        if (kelas) {
            this.eksekutif = this.eksekutif + jumlah;
        } else {
            this.ekonomi = this.ekonomi + jumlah;
        }
        this.terpesan = this.ekonomi + this.eksekutif;
    }
    
    public int getTerpesan() {
        return this.terpesan;
    }

    public int getEkonomi() {
        return ekonomi;
    }

    public void setEkonomi(int ekonomi) {
        this.ekonomi = ekonomi;
    }

    public int getEksekutif() {
        return eksekutif;
    }

    public void setEksekutif(int eksekutif) {
        this.eksekutif = eksekutif;
    }

    @Override
    public void Keberangkatan(Stasiun keberangkatan) {
        this.Parkir = keberangkatan;
    }

    @Override
    public void Tujuan(Stasiun tujuan) {
        this.Tujuan = tujuan;
    }
    
    
    
}