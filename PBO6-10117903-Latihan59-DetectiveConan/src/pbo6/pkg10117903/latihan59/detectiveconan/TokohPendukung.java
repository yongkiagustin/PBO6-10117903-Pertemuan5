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
public class TokohPendukung extends Anggota{
    
    public TokohPendukung(String nama) {
        super(nama);
    }

    @Override
    public void TampilAnggota() {
        System.out.println("Tokoh Pendukung : "+getNama());
    
    }
    
}
