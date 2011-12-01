import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

public class CarRace
{
    public static void main (){
        Random gen = new Random();
        int randL = gen.nextInt(6) +1;
        int randL2 = gen.nextInt(6) +1;
        int xPos, xPos2,yPos = 100, yPos2 = 200;
        
        // The picture, the background, and the Car variables
        Picture pict = new Picture(600,300);
        Picture background = new Picture(600,300);
        Picture car1 = new Picture("carright.gif ");
        Picture car2 = new Picture("carright.gif ");
        
        Graphics gObj = background.getGraphics(); 
        gObj.setColor(Color.BLACK);
        gObj.drawLine(0,50,600,50);
        gObj.drawLine(0,150,600,150);
        gObj.drawLine(0,250,600,250);
        

        pict.show();         // Show the picture initially

        // Moving the turtle through the picture from position 30
        // to position 600, redrawing the background and then the
        // Car at its new x-position each time.
        for (xPos = 30,xPos2 = 30; xPos < 600 && xPos2 < 600; xPos += randL, xPos2 += randL2)
        {

            copy(background,pict,0,0);
            copy(car1,pict,xPos,yPos);
            copy(car2,pict,xPos2,yPos2);
            pict.repaint();
            pause(26);
        }
        
        if( xPos <600)
            {
                write(pict,"Car 2 Wins",0,250);;
            }
            else if ( xPos2 < 600){
                write(pict,"Car 1 Win",0,250);;
            }
            
            
        

        pict.repaint();

    }
    
    //  Method Copys a picture in a new spot and clears the remains of the old picture
    public static void copy (Picture source, Picture target, int x, int y){
        Graphics gObj = target.getGraphics();
    
       gObj.drawImage(source.getImage(),x,y,null);

    }
    
    // Method pauses the program for x number of milliseconds
    public static void pause (long millisecs){
        try {
          Thread.sleep(millisecs);
       } catch (InterruptedException e) {
       }

    }
    
    public static void write(Picture target, String text, int x, int y)
    {
       Graphics gObj = target.getGraphics();
       Font newFont = new Font("Arial",Font.BOLD,24);
       gObj.setColor(Color.red);
       gObj.setFont(newFont);
       gObj.drawString(text,x,y);
    }


}