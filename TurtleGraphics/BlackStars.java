
/**
 * Course: 2301
 * Section: 01
 * Professor: Prof. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 07
 */
// Imports Colors
import java.awt.Color;
// Calls the main and stars method
public class BlackStars
{   // Creats a world and turtle
    static Turtle turtle;
    static World earth;
    // Calls the star method
    static void main()
    {
        earth = new World();
        turtle = new Turtle(earth);
        // Sets color to black
        turtle.setColor(Color.BLACK);
        // Sets pen width to 3 pixles
        turtle.setPenWidth(3);
        // Sets earth background to threestars picture
        earth.setPicture(new Picture("ThreeStars.jpg")); 
        // Moves turtle to first star and draws
        turtle.penUp();
        turtle.moveTo(40,80);
        turtle.penDown();
        stars(5,70);
        // Moves turtle to second star and draws
        turtle.penUp();
        turtle.moveTo(240,230);
        turtle.penDown();
        stars(7,100);
    }
    
    // Creates a star with variable sides and length
    public static void stars(double sides, int length)
    {
        int count = 0;
        double angle;

        angle = 180 - 180 / sides; 
        while (count < sides)
        {
            turtle.forward(length);
            turtle.turn((int)angle);
            count = count + 1;
        }
        
    }

}
