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
public class Passenger {

    //Attributes
    public String name;
    public int age;
    public int farepaid;
    public int number;
    

    //Constructor
    public Passenger(String nameIn, int ageIn, int farepaidIn, int numberIn) {
        name = nameIn;
        age = ageIn;
        farepaid = farepaidIn;
        number = numberIn;
    }

    //Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getFairpaid() {
        return farepaid;
    }
    public int getNumber(){
        return number;
    }
}
