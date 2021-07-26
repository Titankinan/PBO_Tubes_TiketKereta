/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Titan
 */
public class Tiket {
    private String noTiket;
//    private String kelas;
//    private String jurusan;
    private Kereta keretaApi;
//    private int pembeli;

    public String getNoTiket() {
        return noTiket;
    }

    public void setNoTiket(String noTiket) {
        this.noTiket = noTiket;
    }
    
    public void setKeretaApi (Kereta keretaApi) {
        this.keretaApi = keretaApi;
    }

    public Kereta getKeretaApi() {
        return keretaApi;
    }
    
}
