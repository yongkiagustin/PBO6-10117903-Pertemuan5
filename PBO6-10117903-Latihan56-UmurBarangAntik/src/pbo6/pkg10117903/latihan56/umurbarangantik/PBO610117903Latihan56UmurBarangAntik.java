/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan56.umurbarangantik;

/**
 *
 * @author yongki
 */
public class PBO610117903Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio;
        radio = new Radio(0);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : "+radio.getName()+" Tahun"); 
        
        BarangAntik b;
        b = new BarangAntik(234);
        b.tampilUmur();
        
        
    }
    
}
