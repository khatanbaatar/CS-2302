
/**
 * Course: 2301
 * Section: 01
 * Professor: A. Shaw
 * Name: Andres
 * Assignment #: Lab 13
 */

import java.awt.Color; // Imports color Class

// Takes the RedEye out of Jenny-red
public class RedEye
{
    public static void main(){
        Picture redeye = new Picture("jenny-red.jpg"); // Loads jenny-red
        redeye.show(); // shows the picture
        Color oldColor = new Color(160,23,30);     // Makes a new color
        changeColor(redeye,110,95,195,105,oldColor,Color.BLACK); // Calls the ChangeColor Method
        redeye.repaint(); // Repaints the picture after the changeColor moethod
    }
    
    // Changes the Color in a picture
    public static void changeColor(Picture source, int startX, int startY, int endX, int endY, Color oldColor, Color newColor){
        Pixel sourcePix;
        int endPoint = source.getWidth()-1;
        // loops though the picture
        for(int x = startX; x <= endX; x++){
            for(int y = startY; y <= endY; y++){
                sourcePix = source.getPixel(x,y);
                // if oldcolor is less that 100 it changes it to a new color
                if(sourcePix.colorDistance(oldColor)< 100)
                    sourcePix.setColor(newColor);

            }
        }
    }
}


