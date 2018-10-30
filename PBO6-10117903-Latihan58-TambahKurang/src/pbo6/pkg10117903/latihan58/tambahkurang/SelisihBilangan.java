/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan58.tambahkurang;

/**
 *
 * @author yongki
 */
public class SelisihBilangan extends Bilangan {

    public void tampilSelisih() {
        int z;
        z = getX() - getY();
        System.out.println("Hasil Selisih "+getX()+" - "+getY()+" = "+z);
    }

}
