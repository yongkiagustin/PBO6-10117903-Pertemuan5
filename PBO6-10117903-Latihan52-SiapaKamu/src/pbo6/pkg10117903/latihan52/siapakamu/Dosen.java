/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan52.siapakamu;

/**
 *
 * @author yongki
 */
public class Dosen extends Manusia {

    private String nip;
    private String matkul;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public void mengajarApa() {
        System.out.println("Saya rizki adam kurniawan\n"
                + "Umur 27 Tahun, Sedang mengajar matakuliah PBO");
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
        

    }

}
