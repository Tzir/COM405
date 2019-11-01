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
public class Table {
    //Atributes
    private int tableNumber;
    private int numberofSeats;
    private int dineOutside;
    Staff s1 = new Staff("Max", "Male", 31);
    Booking b1 = new Booking("Jones", 6, true);
    
    //Methods (getter and setter)
    private void set AssignStaffMember(boolean s1){
        AssignStaffMember = s1;
    }
    
    private String getBookTable()
    {
        return b1;
    }
    
    
    
    
}
