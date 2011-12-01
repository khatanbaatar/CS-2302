
/**
 * Course: 2301
 * Section: 01
 * Professor: Prof. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 4
 */
public class Shapes
{
    static World earth;
    static Turtle turtle;
     // This is the method that calls rectangle and equilateral
    public static void draw()
    {
        earth = new World();
        turtle = new Turtle(earth);
        rectangle(100, 50);
        equilateral(100);
    }
    // This is the method that draws the rectangle
    public static void rectangle(int width, int height)
    {
        turtle.forward(height);
        turtle.turnRight();
        turtle.forward(width);
        turtle.turnRight();
        turtle.forward(height);
        turtle.turnRight();
        turtle.forward(width);
        turtle.turnRight();
        
    }
    // This is the method that draws the equilateral
    public static void equilateral(int length) 
    {
        turtle.forward(length);
        turtle.turn(120);
        turtle.forward(length);
        turtle.turn(120);
        turtle.forward(length);
        turtle.turn(120);
    }

}
