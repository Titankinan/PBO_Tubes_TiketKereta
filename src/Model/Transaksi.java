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
public class Transaksi {
    private String idPemesanan;
    private Pembeli pembeli;                                                    //Data pembeli
    private Kereta kereta;                                                      //Data kereta yang ditumpangi
    private int jmlhPesan;                                                      //Jumlah tiket yang dipesan
    private List noKursi = new ArrayList();                                     //Jika memilih kelas ekonomi noKursi berawalan A, jika eksekutif B
    private long total;                                                         //Total harga yang harus dibayar
    private String kursi;
    private String kelas;

    public Transaksi (int id, Pembeli pembeli, Kereta kereta, int jmlhPesan, String kelas) {
        this.pembeli = pembeli;
        this.kereta = kereta;
        this.jmlhPesan = jmlhPesan;
        this.kereta.dipesan(this.kereta.getKelasKereta(), jmlhPesan);
        this.kelas = kelas;
        idPemesanan = "T00" + String.valueOf(id);                               //Kode kombinasi dari apa, nanti ditambahin
        this.setNoKursi();
        this.setTotal();
    }
    
    public Transaksi (String id, Pembeli pembeli, Kereta kereta, int jmlhPesan, String kelas) {
        this.pembeli = pembeli;
        this.kereta = kereta;
        this.jmlhPesan = jmlhPesan;
        this.kereta.dipesan(this.kereta.getKelasKereta(), jmlhPesan);
        this.kelas = kelas;
        idPemesanan = id;                               //Kode kombinasi dari apa, nanti ditambahin
        this.setNoKursi();
        this.setTotal();
    }
    
    public String getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal() {
        total = kereta.getHarga() * jmlhPesan;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }
    
    public Kereta getKereta() {
        return this.kereta;
    }
    
    public void setKereta(Kereta kereta) {
        this.kereta = kereta;
    }

    public int getJmlhPesan() {
        return jmlhPesan;
    }

    public void setJmlhPesan(int jmlhPesan) {
        this.jmlhPesan = jmlhPesan;
    }
    
    public List getNoKursi() {
        return this.noKursi;
    }
    
    public void setNoKursi() {
        int i = 0;
        int nomor;
        if (kereta.getKelasKereta()) {
            nomor = kereta.getEksekutif() + 1 - jmlhPesan;
            while (i < this.getJmlhPesan()) {
                noKursi.add("B" + String.valueOf(nomor));
                nomor++;
                i++;
            }
        } else {
            nomor = kereta.getEkonomi() + 1 - jmlhPesan;
            while (i < this.getJmlhPesan()) {
                noKursi.add("A" + String.valueOf(nomor));
                nomor++;
                i++;
            }
        }
    }

    public String getKursi() {
        String temp = "";
        for (Object k : noKursi) {
            temp = temp + k + ", ";
        }
        return temp;
    }

    public String getKelas() {
        return kelas;
    }
    
}
