/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 4TZIRK74
 */
public class Booking {

    //Atributes
    private String name;
    private int numberofGuests;
    private boolean dineOutside;

    //Getter methods
    private String getName() {
        return name;
    }

    private int getNumberofGuests() {
        return numberofGuests;
    }

    private boolean getDineOutside() {
        return dineOutside;
    }

    //Constructor
    public Booking(String nameIn, int numberofGuestsIn, boolean dineOutsideIn) {
        name = nameIn;
        numberofGuests = numberofGuestsIn;
        dineOutside = dineOutsideIn;

    }
}
