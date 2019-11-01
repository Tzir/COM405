package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4tzirk74
 */
public class Bus {

    private Passenger[] seats = new Passenger[15];

    public boolean addPassenger(Passenger passengerIn) {
        for (int i = 0; i < seats.length; i += 1) {
            if (seats[i] == null) 
            {
                seats[i] = passengerIn;
                return true;
            }
        }
        return false;
    }
   
    public boolean removePassenger(int numberIn)
    {
        for (int i = 0; i < seats.length; i+=1)
        {
            if(seats[i] != null)
            {
                int seatsNumber = seats[i].getNumber();
                
                if(seatsNumber == numberIn)
                {
                    seats[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    public Passenger getPassenger(int number)
    {
         for (int i = 0; i < seats.length; i+=1)
        {
            if(seats[i] != null)
            {
                if(seats[i].getNumber() == number )
                {
                    return seats[i];
                }
            }
        }
         return null;
    }
}
