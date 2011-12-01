
/**
 * Course: 2301
 * Section: 01
 * Professor: Prof. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 5
 */
public class Constellation
{
    static World earth;
    static Turtle turtle;
    
    // This is the method that calls the star 
    public static void constellation()
    {
        earth = new World();
        turtle = new Turtle(earth);
        // Makes first star
        star(50);
        turtle.penUp();
        turtle.forward();
        turtle.turn(72);
        turtle.penDown();  
        // Makes second star
        star(50);
        turtle.penUp();
        turtle.forward();
        turtle.turn(72);
        turtle.penDown();
        // Makes third star
        star(50);
        turtle.penUp();
        turtle.forward();
        turtle.turn(72);
        turtle.penDown();
        // Makes fourth star
        star(50);
        turtle.penUp();
        turtle.forward();
        turtle.turn(72);
        turtle.penDown();
        // Makes fith star
        star(50);
        turtle.penUp();
        turtle.forward();
        turtle.turn(72);
        turtle.penDown();
      
    }
    
    // This is the method that draws a star
    public static void star(int length)
    {
        turtle.forward(length);
        turtle.turn(144);
        turtle.forward(length);
        turtle.turn(144);
        turtle.forward(length);
        turtle.turn(144);
        turtle.forward(length);
        turtle.turn(144);
        turtle.forward(length);
        turtle.turn(144);
      
    }


}
