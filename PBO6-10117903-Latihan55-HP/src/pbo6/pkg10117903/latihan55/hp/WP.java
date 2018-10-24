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
public class WP extends HP{
    private String wpKeyStore;
    public WP(String man, String OS, String model, int harga) {
        super(man, OS, model, harga);

    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    public void displayProduct() {
        System.out.println("Manufacture \t: " + this.manufacture);
        System.out.println("OS \t\t: " + this.OS);
        System.out.println("Model \t\t: " + this.model);
        System.out.println("PIN BB \t\t: "+getWpKeyStore());
    }
}
