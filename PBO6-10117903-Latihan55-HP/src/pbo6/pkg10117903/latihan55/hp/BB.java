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
public class BB extends Handphone {

    private String pinBB;

    public BB(String man, String OS, String model, int harga) {
        super(man, OS, model, harga);

    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }

    @Override
    public void displayProduct() {
        System.out.println("Manufacture \t: " + this.manufacture);
        System.out.println("OS \t\t: " + this.OS);
        System.out.println("Model \t\t: " + this.model);
        System.out.println("PIN BB \t\t: "+getPinBB());
    }

}
