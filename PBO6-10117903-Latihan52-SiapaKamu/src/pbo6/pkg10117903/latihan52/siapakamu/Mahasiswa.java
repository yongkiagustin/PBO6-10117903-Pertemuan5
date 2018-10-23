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
public class Mahasiswa extends Manusia{
    private String nim, nama;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void kelasApa(){
        System.out.println("Saya Yongki umur 17 tahun\n"
                + "Sedang belajar di kelas PBO6");
    }
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}
