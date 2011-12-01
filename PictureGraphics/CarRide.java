
/**
 * Course: 2301
 * Section: 01
 * Professor: Dr. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 15
 */
import java.awt.Graphics;
import java.awt.Color;


public class CarRide
{
    public static void main (){
        int xPos, yPos = 400;
        
        // The picture, the background, and the Car variables
        Picture pict = new Picture("beach.jpg");
        Picture background = new Picture("beach.jpg");
        Picture carR = new Picture("carright.gif ");
        Picture carL = new Picture("carleft.gif ");

        pict.show();         // Show the picture initially

        // Moving the turtle through the picture from position 30
        // to position 600, redrawing the background and then the
        // turtle at its new x-position each time.
        for (xPos = 30; xPos < 600; xPos += 5)
        {
            copy(background,pict,0,0);
            copy(carR,pict,xPos,yPos);
            pict.repaint();
            pause(40);
        }
        
        
        // Moves the car from right to left
        for (xPos = 600; xPos > 30; xPos -= 5)
        {
            copy(background,pict,0,0);
            copy(carL,pict,xPos,yPos);
            pict.repaint();
            pause(40);
        }

    }
    
    //  Method Copys a picture in a new spot and clears the remains of the old picture
    public static void copy (Picture source, Picture target, int x, int y){
        Graphics gObj = target.getGraphics();
    
       gObj.drawImage(source.getImage(),x,y,null);

    }
    
    // Method pauses the program for x number of milliseconds
    public static void pause (long millisecs){
        try {
          Thread.sleep(millisecs);
       } catch (InterruptedException e) {
       }

    }




}