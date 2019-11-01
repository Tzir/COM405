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
public class Car {

    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;
    private String color;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
//additional classes
    public void accelerate() {
        currentSpeed += 5;
        fuelLevel -= 5;
        System.out.println("Your current speed is: " + currentSpeed + " and your fuel level is: " + fuelLevel);
    }

    public void brake() {
        currentSpeed -= 5;
        System.out.println("Now you broke and your current speed is: " + currentSpeed);;
    }

    public void refuel() {
        if (fuelLevel <= 25) {
            fuelLevel += 75;
        } else {
            fuelLevel += 25;
        }
        System.out.println("Now that you have refueled, your fuel is: " + fuelLevel);
    }
    
    // constructors
    public Car()
    {
        currentSpeed = 20;
        maxSpeed = 150;
        color = "Black";
        fuelLevel = 50;         
    }
    
    public Car(int currentSpeed, int maxSpeed)
    {
        currentSpeed = 0;
        maxSpeed = 180;
        color = "White";
        fuelLevel = 0;
        
                
    }

}

