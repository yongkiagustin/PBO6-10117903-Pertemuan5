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
        HP andro;
        HP hp;
        hp = new HP("1", "2", "3", 0);
        hp.displayProduct();
        System.out.println("");
        
        andro = new Android("3213", "And", "Grand", 30000);
        andro.displayProduct();
        System.out.println(""+((Android)andro).getKeyStore());
        
    }
    
}
