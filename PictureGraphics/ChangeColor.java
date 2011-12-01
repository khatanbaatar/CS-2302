
/**
 * Course: 2301
 * Section: 01
 * Professor: Dr. Shaw
 * Name: Andres Castro
 * Assignment #: HW 6
 */
import java.awt.Color;

public class ChangeColor
{
    public static void main(){
        Picture redeye = new Picture("redeye.jpg"); // loads redeye picture and names it redeye
        redeye.show(); // shows redeye picture
        Color oldColor = new Color(167,37,33); // Sets the color tha tyou are going to watch to change       
        changeColor(redeye,150,82,320,220,oldColor,Color.BLACK); // Calls the changeColor method
        redeye.repaint(); // repaints redeye

    }
    
    // Method replaces the color in a specified set of pixels
    public static void changeColor(Picture source, int startX, int startY, int endX, int endY, Color oldColor, Color newColor){
        Pixel sourcePix;
        int endPoint = source.getWidth()-1;
        
        for(int x = startX; x <= endX; x++){
            for(int y = startY; y <= endY; y++){
                sourcePix = source.getPixel(x,y);
                if(sourcePix.colorDistance(oldColor)< 100)
                    sourcePix.setColor(newColor);
            }
        }
    }
}
