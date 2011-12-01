/*
 * Course #: CS 2301
 * Section: 1
 * Name: ......
 * Professor: Prof. Shaw
 * Assignment #: Homework 2
 */

import java.awt.Color;
// Creates the variable earth and three turtles
public class Neighborhood
{
    static World earth;
    static Turtle turtle1;
    static Turtle turtle2;
    static Turtle turtle3;
// Calls the House method to build 3 seperate houses
    static void neighborhood()
    {    
        // Puts the earth in a world and the three different color turtles in that world
        earth = new World();
        turtle1 = new Turtle(earth);
        turtle1.setColor(Color.BLUE);
        turtle2 = new Turtle(earth);
        turtle2.setColor(Color.RED);
        turtle3 = new Turtle(earth);
        turtle3.setColor(Color.GREEN);
        house(100, 100, turtle1);
        house(250, 100, turtle2);
        house(400, 100, turtle3);

    }
    // Calls the equilateral, rectangle and window method to build a house
    static void house(int xcor, int ycor, Turtle turtle)
   {
      turtle.penUp();
      turtle.moveTo(xcor, ycor);
      turtle.penDown();
      equilateral(100, turtle);
      rectangle(100, 50, turtle);
      // Moves to make first window
      turtle.penUp();
      turtle.turnRight();
      turtle.forward(25);
      turtle.turnRight();
      turtle.forward(30);
      turtle.penDown();
      window(20, turtle); 
      // Moves to make second window
      turtle.penUp();
      turtle.turn(180);
      turtle.forward(20);
      turtle.turnRight();
      turtle.forward(60);
      turtle.penDown();
      window(20, turtle);  
      // Moves to make the door
      turtle.penUp();
      turtle.turnRight();
      turtle.forward(40);
      turtle.turnRight();
      turtle.forward(50);
      turtle.penDown();
      window(15, turtle);
    }
    // Method that makes a rectangle for house base
    static void rectangle(int width, int height, Turtle turtle)
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
    // Method that makes a triangle for house roof
    static void equilateral(int length, Turtle turtle) 
   {
        turtle.turn(30);
        turtle.forward(length);
        turtle.turn(120);
        turtle.forward(length);
        turtle.turn(120);
        turtle.forward(length);
        turtle.turnRight();
    }
    // Method creates a window to go inside the home
    static void window(int length, Turtle turtle)
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
