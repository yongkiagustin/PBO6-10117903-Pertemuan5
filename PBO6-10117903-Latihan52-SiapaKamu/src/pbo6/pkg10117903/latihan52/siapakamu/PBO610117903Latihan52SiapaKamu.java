/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan52.siapakamu;
/**
 * @author Yongki
 * NAMA         : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menampilkan fungsi 
 * yang di overriding
 */
public class PBO610117903Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Manusia mahasiswa;
        Manusia dosen;
        
        dosen = new Dosen();
        ((Dosen)dosen).setNip("41227829930");
        System.out.println("NIP DOSEN : "+((Dosen)dosen).getNip());
        dosen.siapaKamu();
        ((Dosen)dosen).mengajarApa(); 
        
        mahasiswa = new Mahasiswa();
        ((Mahasiswa)mahasiswa).setNim("10117903");
        System.out.println("NIM MAHASISWA : "+((Mahasiswa)mahasiswa).getNim());
        ((Mahasiswa)mahasiswa).kelasApa();
        mahasiswa.siapaKamu();
        
  
    }
    
}
