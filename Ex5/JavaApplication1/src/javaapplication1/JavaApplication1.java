/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 4tzirk74
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bus b1 = new Bus();
        
        if(b1.addPassenger(new Passenger("Kostas", 18, 2, 1)))
        {
            System.out.println("Passenger added");
        }
        else
        {
            System.out.println("The bus is full");
        }
        
        b1.addPassenger(new Passenger("George", 18, 2, 2));
        b1.addPassenger(new Passenger("Fanis", 20, 2, 3));
        
        if(b1.removePassenger(3))
        {
            System.out.println("Bye");
        }
        else
        {
            System.out.println("Passenger not found");
        }
        
        Passenger passengerIn = b1.getPassenger(2);
        if(passengerIn != null)
        {
            System.out.println("Name: " + passengerIn.getName());
        System.out.println("Age: " + passengerIn.getAge()); 
        }
        else
        {
            System.out.println("Passenger not found");
        }
    }
    
}
