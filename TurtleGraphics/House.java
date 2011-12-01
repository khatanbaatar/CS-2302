
/**
 * Course: 2301
 * Section: 01
 * Professor: Prof. Shaw
 * Name: Andres Castro
 * Assignment #: HW 1
 */

import java.awt.Color;
public class House
{
    static World earth;
    static Turtle turtle;
     // This is the method that calls rectangle and equilateral and window
    public static void house() 
    {
        earth = new World();
        turtle = new Turtle(earth);
        // Sets the Color to Black
        turtle.setColor(Color.BLUE);
        // Sets the Pen width to 5 pixles
        turtle.setPenWidth(5);
        // Sets the turtle Shell to Pink
        turtle.setShellColor(Color.GREEN);
        equilateral(200);
        rectangle(200, 100);
        // Moves the Trutle to make the first window
        turtle.penUp();
        turtle.moveTo(350,250);
        turtle.penDown();
        window(25);
        // Moves the Trutle to make the second Window
        turtle.penUp();
        turtle.moveTo(450,250);
        turtle.penDown();
        window(25);
        // Moves the Turtle to make the Door
        turtle.penUp();
        turtle.moveTo(400,315);
        turtle.penDown();
        window(25);
        
    }
    // This is the method that draws the rectangle
    public static void rectangle(int width, int height)
    {
        
        turtle.turnRight();
        turtle.forward(width);
        turtle.turnRight();
        turtle.forward(height);
        turtle.turnRight();
        turtle.forward(width);
        turtle.turnRight();
        turtle.forward(height);
        
    }
    // This is the method that draws the equilateral
    public static void equilateral(int length) 
    {
        
        turtle.turn(30);
        turtle.forward(length);
        turtle.turn(120);
        turtle.forward(length);
        turtle.turn(120);
        turtle.forward(length);
        turtle.turnRight();
    }
    // This is the method that draws the windows
    public static void window(int length)
    {
        turtle.turnRight();
        turtle.forward(length);
        turtle.turnRight();
        turtle.forward(length);
        turtle.turnRight();
        turtle.forward(length);
        turtle.turnRight();
        turtle.forward(length);
    }

}