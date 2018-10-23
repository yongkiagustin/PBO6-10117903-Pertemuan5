/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan53.rabbit;

/**
 *
 * @author yongki
 */
public class PBO610117903Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal animal = new Animal(false,"grass",4);
        Rabbit r = new Rabbit("Peter",false,"Grass",4,"grey");
        System.out.println("Hello, His name is "+r.getName());
        System.out.println(r.getName()+" is Vegetarian ? "+r.isVegetarian());
        System.out.println(r.getName()+" Has "+r.getNoOfLegs()+" legs");
        System.out.println(r.getName()+" color is "+r.getColor());
    }
    
}
