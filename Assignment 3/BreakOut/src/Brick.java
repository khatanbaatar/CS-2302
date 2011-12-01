
/**
 * Course: 2301
 * Section: 01
 * Professor: Dr. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 22
 */
import java.awt.*;

public class Brick
{
    private double xPos, yPos;   // the x,y position
    private boolean goRight;  // the direction
    private Picture carRight = new Picture("bricks.jpg");
    private Picture carLeft = new Picture("bricks.jpg");
    private Picture bkGround = new Picture("bkGround.jpg");
    
    // Constructor without parameters
    public Brick()
    {
        this.xPos = 0;
        this.yPos = 0;
        this.goRight = true;
    }
    
    // Constructor with parameters
    public Brick(double xInit, double yInit, boolean goRightInit)
    {
        this.xPos = xInit;
        this.yPos = yInit;
        this.goRight = goRightInit;
    }
    
    public int getWidth(){
        return carRight.getWidth();
    }
    
    public double getX()
    {
        return this.xPos;
    }
    
    public double getY()
    {
        return this.yPos;
    }
    
    public boolean getGoRight()
    {
        return this.goRight;
    }
    
    public void setLocation(double x, double y)
    {
        this.xPos = x;
        this.yPos = y;
    }
    
    public void setGoRight(boolean newGoRight)
    {
        this.goRight = newGoRight;
    }
    

    // Method for drawing a spot
    public void drawCar(Picture target)
    {
        copy(bkGround,target,0,0);
        if (goRight)
            copy(carRight,target,(int)this.xPos,(int)this.yPos);
        else
            copy(carLeft,target,(int)this.xPos,(int)this.yPos);
    }
    
    public void eraseScreen(Picture target)
    {
        Graphics g = target.getGraphics();
        int width, height;
        
        width = target.getWidth();
        height = target.getHeight();
        g.setColor(Color.white);
        g.fillRect(0,0,width,height);
    }
    
    public static void copy(Picture source, Picture target, int x, int y)
    {
       Graphics gObj = target.getGraphics();
    
       gObj.drawImage(source.getImage(),x,y,null);
    }
    
    public String toString()
    {
        return "The car's x coordinate is: " + this.xPos + 
                "\nThe car's y coordinate is: " + this.yPos;
    }
}