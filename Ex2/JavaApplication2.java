/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import jdk.nashorn.internal.objects.NativeRegExp;
import java.util.Scanner;

/**
 *
 * @author 4TZIRK74
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i += 1) {
            System.out.println(i);

            // TODO code application logic here
        }
        System.out.println("");

        for (int a = 1; a <= 20; a += 2) {

            System.out.println(a);

        }
        System.out.println("");

        for (int b = 5; b <= 15; b += 1) {

            System.out.println(b);

        }
        System.out.println("");

        for (int c = 10; c >= 1; c -= 1) {

            System.out.println(c);
            
        }
        Scanner scanIn = new Scanner(System.in);
        int state = 1; 
       while(state == 1 ){
            System.out.println("Please enter the letter which corresponds with your choice:\n"
                    + "a - Calculate the area of a rectangle\n "
                    + "b - Display a multiplication table \n"
                    + "c - Add two numbers\n"
                    +"x - Exit Programm");
            

            String input = scanIn.nextLine();

            if ("a".equals(input)) {
                System.out.println("Please enter a width: ");

                try {
                    int inputa = Integer.parseInt(scanIn.nextLine());

                    System.out.println("Please enter a height:  ");

                    int inputb = Integer.parseInt(scanIn.nextLine());
                    int rectangle = inputa * inputb;
                    System.out.println("rectangle area:  " + rectangle);
                } catch (Exception e) {
                    System.out.println("you entered a non integer:  " + e);
                }
            } else if ("b".equals(input)) {
                System.out.println("Please enter a number: ");
                int inputc = Integer.parseInt(scanIn.nextLine());
                for (int table = 1; table <= 12; table += 1) {
                    System.out.println(table + "x" + inputc + "=" + table * inputc);
                }

            } else if ("c".equals(input)) {
                System.out.println("Please enter a number: ");
                int inputd = Integer.parseInt(scanIn.nextLine());
                System.out.println("Please enter a second number");
                int inpute = Integer.parseInt(scanIn.nextLine());
                int addnumbers = inputd * inpute;
                System.out.println("The numbers that you entered are added: " + addnumbers);

            }
            else if(input.equals("x") )
            {
                state = 0;
            }
       }
       for(int row = 1; row <= 3; row +=1)
       {
           for(int x = 1; x<= 5; x+=1)
           {
                if(x == row + 1)
                       System.out.print(" ");
                else
                  System.out.print("*"); 
           }
           System.out.println("");
       }      
            
        
        scanIn.close();
    }

}
