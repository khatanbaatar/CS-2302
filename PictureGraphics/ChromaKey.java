
/**
 * Course: 2301
 * Section: 01
 * Professor: DR. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 14 
 */

import java.awt.Color;
public class ChromaKey
{
    public static void main(){
        Picture mark = new Picture("blue-mark.jpg"); // Loads picture
        mark.show(); // shows picture
        Picture moon = new Picture("moon-surface.jpg"); // loads picture of moon
        chromaKey(mark,moon); // Calles the method using mark are source and moon as newBackground
        mark.repaint(); // repaints mark after it has been changed
    }
    
    // Method changes the background of a picture
    public static void chromaKey(Picture sourcePict, Picture newBackground){
        Pixel currPixel = null;
        Pixel newPixel = null;

        // loop through the columns
        for (int x=0; x< sourcePict.getWidth(); x++)
        {
            // loop through the rows
            for (int y=0; y< sourcePict.getHeight(); y++)
            {
                // get the current pixel and old background pixel
                currPixel = sourcePict.getPixel(x,y);
                newPixel = newBackground.getPixel(x,y);
                Color colorToReplace = new Color(4,45,77); // Color of the original background

                /* if the distance between the current pixel color 
                 * and the old background pixel color is less than the 15
                 * then swap in the new background pixel
                 */
                if (currPixel.colorDistance(colorToReplace) < 50.0)
                {
                     newPixel = newBackground.getPixel(x,y);
                     currPixel.setColor(newPixel.getColor());
                }
            }
        }
    }
}
