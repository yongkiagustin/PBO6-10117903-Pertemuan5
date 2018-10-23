/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan51.gajikaryawan;

import java.util.Scanner;
/**
 * @author Yongki
 * NAMA         : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menhitung 
 * gaji karyawan.
 */
public class PBO610117903Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Manager man = new Manager();

        Scanner innik = new Scanner(System.in);
        Scanner innama = new Scanner(System.in);
        Scanner ingol = new Scanner(System.in);
        Scanner injab = new Scanner(System.in);
        Scanner inhadir = new Scanner(System.in);

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK :");
        man.setNik(innik.nextLine());
        System.out.print("Masukkan Nama :");
        man.setNama(innama.nextLine());
        System.out.print("Masukkan golongan (1/2/3) : ");
        man.setGolongan(ingol.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag : ");
        man.setJabatan(injab.nextLine());
        System.out.print("masukkan Jumlah Kehadiran : ");
        man.setKehadiran(inhadir.nextInt());
        System.out.println("");
        System.out.println("NIK : " + man.getNik());
        System.out.println("Nama : " + man.getNama());
        System.out.println("Golongan : " + man.getGolongan());
        System.out.println("Jabatan : " + man.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN \t: " + man.tunjanganGolongan(man.golongan));
        System.out.println("TUNJANGAN JABATAN \t: " + man.tunjanganJabatan(man.jabatan));
        System.out.println("TUNJANGAN KEHADIRAN \t: " + man.tunjanganKehadiran(man.getKehadiran()));
        System.out.println("");
        System.out.println("Gaji Total : " + man.gajiTotal());
    }

}
