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
public class Staff {

    //Atributes
    private String name;
    private String sex;
    private int age;

    //Getter methods
    private String getName() {
        return name;
    }

    private String getSex() {
        return sex;
    }

    private int getAge() {
        return age;
    }

    //Constructor
    public Staff(String nameIn, String sexIn, int ageIn) {
        name = nameIn;
        sex = sexIn;
        age = ageIn;

    }
    

}
