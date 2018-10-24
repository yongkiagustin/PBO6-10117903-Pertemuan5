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
public class BB extends HP{

    public BB( String man, String OS, String model, int harga) {
        super(man, OS, model, harga);
        
    }

    @Override
    public void displayProduct() {
        System.out.println("Manufacture : " + this.manufacture);
        System.out.println("OS : " + this.OS);
        System.out.println("Model : " + this.model); //To change body of generated methods, choose Tools | Templates.
    }

   
}
