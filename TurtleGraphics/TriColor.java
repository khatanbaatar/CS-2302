
/**
 * Course: ....
 * Section: .....
 * Professor: ......
 * Name: .....
 * Assignment #: ...... 
 */

import java.awt.Color;

public class TriColor
{
    public static void main (String args[])
    {
        Picture cat = new Picture("caterpillar.jpg");
        Pixel[] pixelArray = cat.getPixels();
        Pixel pixel;
        
        int index = 0;
        while(index < pixelArray.length/3)
        {
            pixel = pixelArray[index];
            pixel.setColor(Color.RED);
            index++;
        }
        
        while(index < (pixelArray.length/3)*2)
        {
            pixel = pixelArray[index];
            pixel.setColor(Color.BLUE);
            index++;
        }
        
        while(index < pixelArray.length)
        {
            pixel = pixelArray[index];
            pixel.setColor(Color.MAGENTA);
            index++;
        }
        
        cat.show();
    }
}
