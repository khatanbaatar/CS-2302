
/**
 * Course: ....
 * Section: .....
 * Professor: ......
 * Name: .....
 * Assignment #: ...... 
 */

import java.util.Scanner;
public class Random
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        String letter;
    
        System.out.print("Please enter a character: ");
        letter = s.nextLine();
        System.out.println("The letter you have entered is: " + letter);
    }
}
