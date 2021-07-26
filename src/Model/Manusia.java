/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author asus
 */
public class Manusia {
    private String Nama;
    private String noKTP;

    public String getNama() {
        return Nama;
    };

    public void setNama(String Nama) {
        this.Nama = Nama;
    };

    public String getNoKTP() {
        return noKTP;
    };

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    };
    
    public Manusia (String Nama, String noID) {
        this.setNama(Nama);
        this.setNoKTP(noID);
    }
    
}
