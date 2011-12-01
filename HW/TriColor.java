
/**
 * Course: 2301
 * Section: 01
 * Professor: A. Shaw
 * Name: Andres Castro
 * Assignment #: HW 3
 */


// Imports the ability to use different colors
import java.awt.Color;

// Class with one method that makes a Tricolor flag out of a picture
public class TriColor
{   // Metod that calls a picture and replaces it with 3 different colors
    public static void main(String[] args) 
    {   // Creates and gets the picture from your project folder
        Picture pillar = new Picture("caterpillar.jpg");
        Pixel[] pixArray = pillar.getPixels();
        Pixel pix;
        // Starts the index at 0 pixels
        int index = 0;
        // Makes the first 1/3 of the picture RED
        while(index < pixArray.length/3)
        {
         pix = pixArray[index];
         pix.setColor(Color.RED);
         index++;
        }
        // Mades the second 1/3 of the picture BLUE
        while(index < (pixArray.length/3)*2)
        {
         pix = pixArray[index];
         pix.setColor(Color.BLUE);
         index++;
        }
        // Makes the last 1/3 of the picture MAGENTA
        while(index < pixArray.length)
        {
            pix = pixArray[index];
            pix.setColor(Color.MAGENTA);
            index++;
        }
        // Shows the picture after it has been modified
        pillar.show();
    }
}
        

