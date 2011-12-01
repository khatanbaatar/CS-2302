
/**
 * Course: 2301
 * Section: 01
 * Professor: A.Shaw
 * Name: Andres Castro
 * Assignment #: Lab Assignment #9 Exercise #1 - (Inverting using a for-loop)
 */

import java.awt.Color;
// Inverts a picture
public class Invert
{   // Gets beach picture, shows beach picture, calls the invert method, repaints
    public static void main(){
        Picture beach = new Picture("beach.jpg");
        beach.show();
        invert(beach);
        beach.repaint();
        
    }
    
    /* Method to invert a picture */
    public static void invert(Picture pict){
        Pixel[] pixelArray = pict.getPixels();       // the Array of pixels
        Pixel pixelObj;                              // a variable for each pixels
        Color colorObj;                              // a variable for each color
        int redValue, greenValue, blueValue;         // the R, G and B values
                                     
        
        // loop through all the pixels
        for(int index = 0; index < 307200; index++){
            pixelObj = pixelArray[index];            // get the pixel
            redValue = 255 - pixelObj.getRed();      // get modified red value
            greenValue = 255 - pixelObj.getGreen();  // get modified green value
            blueValue = 255 - pixelObj.getBlue();    // get modified blue value
        
            // set the color object to the new color
            colorObj = new Color(redValue,greenValue,blueValue);
            pixelObj.setColor(colorObj);             // set pixel to new color
        }
            
    }

    


}
