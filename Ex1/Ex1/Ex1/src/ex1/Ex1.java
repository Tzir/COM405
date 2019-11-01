/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author 4TZIRK74
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, world");
        String name = "Kostas";
        int age = 18;
        System.out.println("My name is " + name + " and I am " + age + " years old");
        System.out.println("________");
        System.out.println("| o  o |");
        System.out.println("| ---- |    <  Hello");
        System.out.println("--------");
        Boolean isBirthday = true;
       
        if (isBirthday = true) 
        {
            age = age + 1;
        System.out.println("Yay! It's your birthday! Now you are " + age + " years old");
        } else{
             System.out.println("You are " + age + " years old");
        }
       if (age >= 18)
       {    
           System.out.println("That meand you're old enough to drink!");
                   }
       if (age >= 20 && age <40)
       {
           System.out.println("You are in the 20s and 30s club");
                   } else{
           System.out.println("You aren't in the 20s and 30s club");
       }
       int speed = 45;
       int speedlimit = 30;
       if (speed > speedlimit + 10)
       {
           System.out.println("Your speed is " + speed + ", the speed limit is " + speedlimit+". You're speeding! Ticket for you and a possible court!" );
       } else if(speed >  speedlimit)
       {
           System.out.println("Your speed is " + speed + " and the speed limit is " + speedlimit + " you will now get a speeding ticket!");
       } else{
           System.out.println("Please continue to drive safely");

       }
       int price = 4;
       boolean isStudent = true;
       if(age < 3 || age >=65)
       {
            System.out.println("Free");
       } else if(isStudent && age < 19){
           System.out.println("You pay :" + price/2);
       } else{
           System.out.println("You pay :" + price);
       }
       int miles = 15;
       double value = 20;
       if (miles <= 10 && value > 100)
       {
           System.out.println("You pay 0");           
        // TODO code application logic here
        } else if(miles < 10){     
        System.out.println("You pay 5");
        } else if(miles  < 20){
        System.out.println("You pay 10");
        } else if(miles < 30){
            System.out.println("You pay 20");
        } else{
            double cost = (miles - 30)* 0.5 + 15;
            System.out.println("You pay:");
        }
}
       
