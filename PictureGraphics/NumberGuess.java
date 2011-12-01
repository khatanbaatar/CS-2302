
/**
 * Course: 2301
 * Section: 01
 * Professor: Dr. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 13
 */

import java.util.Random;
import java.util.Scanner;

public class NumberGuess
{
    public static void main(){
        Random gen = new Random();  // Creates a random  number variable
        Scanner scan = new Scanner(System.in);// Creates new scan
        int randval, guess; // Creates two variables
        boolean ans = false; // Makes ans = false
        
        

        randval = gen.nextInt(100) + 1; // makes a random number fomr 1 - 100
        for(int num = 1; num <= 6 && ans == false; num++) // loops 6 times or untill ans = true
        {
            System.out.print("Pick a number from 1 to 100: ");
            guess = scan.nextInt();
            if (guess == randval)
            {
                System.out.println("You Got it!!!");
                ans = true;
            }
            else if (guess < randval){
                System.out.println("Number is too low!!!");
                ans = false;
            }
            else if (guess > randval){
                System.out.println("Number is too High!!!");
                ans = false;
            }
         }
         if (ans == false){
         // Should print out if you lose but could not figure it out
         System.out.println("You LOSE!!! The number was : " + randval ); 
        }
            else {}
            
    }
}

