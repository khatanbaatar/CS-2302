
/**
 * Course: 2301
 * Section: 01
 * Professor: A. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 8 Exercise 2
 */

import java.awt.Color;

public class RemoveRed
{   // Makes a picture object and calls sunset method to edit the picture.
    public static void main(){
        Picture beach = new Picture("beach.jpg");
        beach.show();
        sunset(beach);
        // Applies the sunset to the beach
        beach.repaint();
    }
    public static void sunset(Picture pict){
         Pixel[] pixelArray = pict.getPixels();
         Pixel pixelObj = null;
         int value = 0, index = 0;
         while (index < pixelArray.length){
             pixelObj = pixelArray[index];       // get the current pixel
             value = pixelObj.getRed();           // get the value
             value = (int) (value * 1.4);        // increase value
             pixelObj.setRed(value);            // set the red value 
             index = index + 1;                 // increment the index
            }
         while (index < pixelArray.length){
             pixelObj = pixelArray[index];       // get the current pixel
             value = pixelObj.getRed();           // get the value
             value = (int) (value * .3);             // decrease value
             pixelObj.setBlue(value);               // set the red value 
             index = index + 1;                     // increment the index
            }
         while(index < pixelArray.length){
             pixelObj = pixelArray[index];       // get the current pixel
             value = pixelObj.getRed();          // get the value
             value = (int) (value * .3);            // decrease value
             pixelObj.setGreen(value);              // set the red value 
             index = index + 1;             // increment the index
            }
    }


}
