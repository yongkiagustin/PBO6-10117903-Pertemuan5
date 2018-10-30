/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan55.hp;

/**
 *
 * @author yongki
 */
public class PBO610117903Latihan55HP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android andro;
        BB bb;
        WP wp;
        andro = new Android("Samsung", "Android", "Grand", 3000000);
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();
        System.out.println("");

        bb = new BB("BlackB", "RIM", "Curve", 2000000);
        bb.setPinBB("7828ab23");
        bb.displayProduct();
        System.out.println("");
        
        wp = new WP("Nokia", "Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        
        
    }

}
