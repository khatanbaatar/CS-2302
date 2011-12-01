
/**
 * Course: 2301
 * Section: 01
 * Professor: Dr. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 22
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class MoveBrick
{
    static double x, y, radius;
    static final int distance = 10;
    static final int pauseTime = 40;
    static Brick carObj = new Brick(100,350,true);
    static Picture pict = new Picture("bkGround.jpg");
    
    public static void main(String[] args)
    {
        pict.show();
        carObj.drawCar(pict);
        
        pict.getPictureFrame().frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pict.getPictureFrame().frame.addKeyListener(new KeyAdapter()
        {
               public void keyTyped(KeyEvent e) {
                   handleKey(e.getKeyChar());
               }
                
        });
        
        while (true)
        {
           if(carObj.getGoRight()) {
               x = carObj.getX();
               y = carObj.getY();
               x += distance;
               if(x + carObj.getWidth() > pict.getWidth()){
                   x = pict.getWidth() - carObj.getWidth();
                   carObj.setGoRight(false);
                }
               carObj.setLocation(x,y);
               carObj.drawCar(pict);
               pict.repaint();
            }
            else 
            {
               x = carObj.getX();
               y = carObj.getY();
               x -= distance;
               if(x <0)
               {
                   x = 0;
                   carObj.setGoRight(true);
                }
               carObj.setLocation(x,y);
               carObj.drawCar(pict);
               pict.repaint();
            }
            pause(pauseTime);
        }
        
        }
    
    
    public static void handleKey(char ch)
    {
        if (ch == 'r' || ch == 'R')
        {
            carObj.setGoRight(false);
        }
        if (ch == 'l' || ch == 'L')
        {
            carObj.setGoRight(true);
        }
        if (ch == 'q' || ch == 'Q')
            System.exit(0);
    }


    public static void pause(long millisecs)
    {
       try {
          Thread.sleep(millisecs);
       } catch (InterruptedException e) {
       }
    }
}