
/**
 * Course: 2301
 * Section: 01
 * Professor: Dr. Shaw
 * Name: Andres Castro 
 * Assignment #: Lab 06
 */

import java.util.Scanner;

public class Username
{
    
    static void main() 
    {
        Scanner s = new Scanner(System.in);
        // Declares two string variable and one int
        String firstName;
        String lastName;
        int random;
        
        // Prints out line below
        System.out.print("Please enter your first name: ");
        // Lets you enter your first name and saves it 
        firstName = s.nextLine();
        // Prints out line below
        System.out.print("Please enter your second name: ");
        // Lets you enter your second name and saves it
        lastName = s.nextLine();
        // If last name is great that 5 is great that 5 it uses .substring
        if(lastName.length() > 5)
            lastName = lastName.substring(0,5);
        // Random creates a random number
        random = (int)(100*Math.random());
        // Prints out string + first letter of first name + last name + a random number
        System.out.println("Your username will be: " + firstName.charAt(0) + 
                            lastName + random);
    }

}
