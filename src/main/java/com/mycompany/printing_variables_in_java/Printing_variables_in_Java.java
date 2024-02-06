/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.printing_variables_in_java;

/**
 *
 * @author Ribaration
 */
public class Printing_variables_in_Java {

    public static void main(String[] args) {
        String name = "Lerato";
        
        System.out.println("Helooo " + name);
        
        String firstName = "Lerato";
        String lastName = "Riba";
        String fullName = firstName + lastName;
        String FullName = ("My name is " + firstName+ " " +  lastName );
        System.out.println(fullName);
        System.out.println(FullName);
        
        //For numeric values, the + character works as a mathematical operator 
        
        int x = 5;
        int y = 10;
        System.out.println(x + y); //we printing the value of x + y
        
        //To declare more than one variable of the same type, you can use a comma-separated list
        int p = 7, q = 8, z = 21;
        System.out.println(p+q+z);
        
        
    }
}
