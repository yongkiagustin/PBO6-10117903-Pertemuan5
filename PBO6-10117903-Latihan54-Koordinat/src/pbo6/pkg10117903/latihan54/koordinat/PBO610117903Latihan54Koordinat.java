/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan54.koordinat;
/**
 * @author Yongki
 * NAMA         : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menampilkan fungsi
 * yang di overidding method dari parent class koordinat
 */
public class PBO610117903Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Warnakoordinat w = new Warnakoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : "+w.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+w.getX()+" y : "+w.getY());
    }
    
}
