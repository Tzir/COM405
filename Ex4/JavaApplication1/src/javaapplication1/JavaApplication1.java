/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 4TZIRK74
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
// Create dog objects
        Dog d1 = new Dog("Fido", 16);
        Dog d2 = new Dog("Puddles", 30);

        d1.walk();
        d1.sleep();
        d1.chasePostman();
        d2.walk();
        d2.eat();
// Printing d1's information
        System.out.println("---------- Displaying Dog 1 -----------");
        System.out.println("Name: " + d1.getName());
        System.out.println("Weight: " + d1.getWeight());
        System.out.println("Energy: " + d1.getEnergy());
        System.out.println("Hunger: " + d1.getHunger());
        System.out.println("Been a good dog? " + d1.hasBeenGood());
// Printing d2's information
        System.out.println("---------- Displaying Dog 2 -----------");
        System.out.println("Name: " + d2.getName());
        System.out.println("Weight: " + d2.getWeight());
        System.out.println("Energy: " + d2.getEnergy());
        System.out.println("Hunger: " + d2.getHunger());
        System.out.println("Been a good dog? " + d2.hasBeenGood());
    }
}



