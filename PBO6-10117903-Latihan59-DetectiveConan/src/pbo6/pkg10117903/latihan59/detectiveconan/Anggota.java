/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan59.detectiveconan;

/**
 *
 * @author yongki
 */
public class Anggota {
    protected String nama;

    public Anggota(String nama) {
        this.nama = nama;
       
    }

    public String getNama() {
        return nama;
    }

    public void TampilAnggota(){
        System.out.println("Berikut nama-nama anggota film Detective Conan");
    }
    
    
}
