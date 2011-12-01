
/**
 * Course: 2301
 * Section: 01
 * Professor: Dr. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 15
 */
import java.awt.Graphics;
import java.awt.Color;


public class BarbaraGrid
{
    public static void main(String[] args)
    { 
        Picture barb = new Picture("barbara.jpg");
        drawGrid(barb); 
        barb.show(); 
    } 
    
    public static void drawGrid(Picture pict)
    {
        Graphics gObj = pict.getGraphics(); 
        gObj.setColor(Color.BLACK);
        
        for(int x = 20; x < pict.getWidth(); x += 20) 
        { 
            gObj.drawLine(x,0,x,pict.getHeight()); 
        } 
        for(int y = 20; y < pict.getHeight(); y+=20) 
        { 
            gObj.drawLine(0,y,pict.getHeight(),y);
        }
    }
}
