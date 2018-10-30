/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan57.vehicle;

import java.util.Scanner;

/**
 *
 * @author yongki
 */
public class PBO610117903Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bi = new Bicycle();
        bi.setMyBrand("Trek Bike");
        bi.setMyModel("7.4 FX");
        bi.setMyGearCount(23);
        
        System.out.println("Bicycle");
        System.out.println("Brand : "+bi.getMyBrand());
        System.out.println("Model : "+bi.getMyModel());
        System.out.println("Jumlah Gear : "+bi.getMyGearCount());
        System.out.println("");
        
        Skateboard sk = new Skateboard();
        sk.setMyBrand("Ally Skate");
        sk.setMyModel("Rocket");
        sk.setMyBoardLenght(54.5);
        
        System.out.println("Skateboard");
        System.out.println("Brand : "+sk.getMyBrand());
        System.out.println("Model : "+sk.getMyModel());
        System.out.println("Panjang Board : "+sk.getMyBoardLenght());
    }
    
}
