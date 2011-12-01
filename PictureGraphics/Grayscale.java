
/**
 * Course: 2301
 * Section: 01
 * Professor: A. Shaw
 * Name: Andres Castro
 * Assignment #: Lab Assignment #9 Exercise #2 - (Grayscale with Luminance using a for-loop)
 */

import java.awt.Color;
// Makes a picture gray
public class Grayscale
{   // Gets beach picture shows it, Turns it gray, Repaints
    public static void main(){
        Picture beach = new Picture("beach.jpg");
        beach.show();
        grayscaleWithLuminance(beach);
        beach.repaint();
    }
    // Method for turning picture gray
    public static void grayscaleWithLuminance(Picture pict){
        Pixel[] pixelArray = pict.getPixels();	// the Array of pixels
        Pixel pixelObj;	// a pixel variable for individual pixels
        Color colorObj;	// a color variable for converted colors
        double redValue, greenValue, blueValue;	// the red, green and blue values
        int lumValue;	// the luminance value 
        
        // loop through all the pixels
        for(int index = 0; index < 307200; index++){
            pixelObj = pixelArray[index];	// get the pixel
            redValue = pixelObj.getRed() * 0.299;	// get modified red value
            greenValue = pixelObj.getGreen() * 0.587;	// get modified green value
            blueValue = pixelObj.getBlue() * 0.114;	// get modified blue value
            lumValue = (int) (redValue + greenValue + blueValue);      // get luminance value
        
            colorObj = new Color(lumValue,lumValue,lumValue);     // get the new color
            pixelObj.setColor(colorObj);	// set pixel to new color 
        }
    }


}
