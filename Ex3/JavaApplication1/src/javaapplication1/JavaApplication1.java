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

        Car c1 = new Car();
        Car c2 = new Car();
        c1.setCurrentSpeed(25);
        int speed1 = c1.getCurrentSpeed();
        System.out.println(speed1);

        c1.setMaxSpeed(200);
        int maxSpeed1 = c1.getMaxSpeed();
        System.out.println(maxSpeed1);

        c1.setColor("Red");
        String color1 = c1.getColor();
        System.out.println(color1);

        c1.setFuelLevel(100);
        int fuelLevel1 = c1.getFuelLevel();
        System.out.println(fuelLevel1);

        System.out.println("");

        c2.setCurrentSpeed(30);
        int speed2 = c2.getCurrentSpeed();
        System.out.println(speed2);

        c2.setMaxSpeed(250);
        int maxSpeed2 = c2.getMaxSpeed();
        System.out.println(maxSpeed2);

        c2.setColor("Blue");
        String color2 = c2.getColor();
        System.out.println(color2);

        c2.setFuelLevel(25);
        int fuelLevel2 = c2.getFuelLevel();
        System.out.println(fuelLevel2);
        
        System.out.println("");

        c1.accelerate();
        c2.refuel();
        c1.brake();
        
       
    }

}
