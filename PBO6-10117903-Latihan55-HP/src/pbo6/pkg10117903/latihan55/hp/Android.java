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
public class Android extends HP {

    private String keyStore;

    public Android(String man, String OS, String model, int harga) {
        super(man, OS, model, harga);

    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }

//    public void displayProduct(){
//        this.setKeyStore(keyStore);
//    }
    @Override
    public void displayProduct() {

        System.out.println("Manufacture \t\t: " + this.manufacture);
        System.out.println("OS \t\t\t: " + this.OS);
        System.out.println("Model \t\t\t: " + this.model);
        System.out.print("Android Key Store \t: "+getKeyStore());
        
    }
}
