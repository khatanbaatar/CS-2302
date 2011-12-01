
/**
 * Course: CS 2301
 * Section: 01
 * Professor: Shaw
 * Name: Andres Castro
 * Assignment #: ...... 
 */

import java.util.Scanner;
public class HelloWorld
{
    public static void main()
    {   
        Scanner s = new Scanner (System.in);
        String name;
        int age;
        
        System.out.print("Please enter your name: ");
        name = s.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.print("What is your age: ");
        age = s.nextInt();
        System.out.println("Wow, " + age + " years old!");
    }


}
