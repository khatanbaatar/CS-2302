
import java.awt.*;

/**
 * The Ball Class
 * Implements a ball object that has a position point, a vector determining
 * the x and y components of its motion, a radius, and a color
 * 
 * @author Alan Shaw
 */

public class Ball
{
    private Point position;     // The position of the ball
    private Point vector;       // The movement vector of the ball
    private double radius;      // The radius of the ball
    private Color color;        // The color of the ball
    
    /**
     * Constructor without parameters set the position and movement vector to (0,0)
     * and the radius to 0 and the color to black
     */ 
    public Ball()
    {
        this.position = new Point(0,0);
        this.vector = new Point(0,0);
        this.radius = 0;
        this.color = Color.black;
    }
    
    /** 
     * Constructor with integer parameters
     * @param xInit is the ball's initial x position
     * @param yInit is the ball's initial y position
     * @param xVInit is the ball's initial x vector component
     * @param yVInit is the ball's initial y vector component
     * @param rInit is the ball's initial radius
     * @param rCol is the ball's initial color's r component
     * @param gCol is the ball's initial color's g component
     * @param bCol is the ball's initial color's b component
     */ 
    public Ball(int xInit, int yInit, int xVInit, int yVInit,
                    int rInit, int rCol, int gCol, int bCol)
    {
        this.position = new Point(xInit,yInit);
        this.vector = new Point(xVInit,yVInit);
        this.radius = rInit;
        this.color = new Color(rCol,gCol,bCol);
    }
    
    /** 
     * Constructor with double positioning parameters and integer color parameters
     * @param xInit is the ball's initial x position as a double
     * @param yInit is the ball's initial y position as a double
     * @param xVInit is the ball's initial x vector component as a double
     * @param yVInit is the ball's initial y vector component as a double
     * @param rInit is the ball's initial radius as a double
     * @param rCol is the ball's initial color's r component
     * @param gCol is the ball's initial color's g component
     * @param bCol is the ball's initial color's b component
     */ 
    public Ball(double xInit, double yInit, double xVInit, double yVInit,
                    double rInit, int rCol, int gCol, int bCol)
    {
        this.position = new Point(xInit,yInit);
        this.vector = new Point(xVInit,yVInit);
        this.radius = rInit;
        this.color = new Color(rCol,gCol,bCol);
    }
    
    /**
     * The getter for the X coordinate
     * 
     * @return Returns the X coordinate
     */ 
    public int getX()
    {
        return(this.position.getX());
    }
    
    /** 
     * The getter for the Y coordinate
     * 
     * @return Returns the Y coordinate
     */
    public int getY()
    {
        return(this.position.getY());
    }
    
    /**
     * The getter for the X coordinate as a double
     * 
     * @return Returns the X coordinate as a double
     */ 
    public double getDblX()
    {
        return(this.position.getDblX());
    }
    
    /** 
     * The getter for the Y coordinate as a double
     * 
     * @return Returns the Y coordinate as a double
     */
    public double getDblY()
    {
        return(this.position.getDblY());
    }
    
    /**  
     * The setter for the X coordinate
     * 
     * @param xVal is the new X coordinate
     */
    public void setX(int xVal)
    {
        this.position.setX(xVal);
    }
    
    /** 
     * The setter for the Y coordinate
     * 
     * @param yVal is the new Y coordinate
     */
    public void setY(int yVal)
    {
        this.position.setY(yVal);
    }
    
    /**  
     * The setter for the X coordinate as a double
     * 
     * @param xVal is the new X coordinate as a double
     */
    public void setX(double xVal)
    {
        this.position.setX(xVal);
    }
    
    /** 
     * The setter for the Y coordinate as a double
     * 
     * @param yVal is the new Y coordinate as a double
     */
    public void setY(double yVal)
    {
        this.position.setY(yVal);
    }
    
    /**
     * The getter for the X vector component
     * 
     * @return Returns the X vector component
     */ 
    public int getXVector()
    {
        return(this.vector.getX());
    }
    
    /**
     * The getter for the Y vector component
     * 
     * @return Returns the Y vector component
     */ 
    public int getYVector()
    {
        return(this.vector.getY());
    }
    
    /**
     * The getter for the X vector component as a double
     * 
     * @return Returns the X vector component as a double
     */ 
    public double getDblXVector()
    {
        return(this.vector.getDblX());
    }
    
    /**
     * The getter for the Y vector component as a double
     * 
     * @return Returns the Y vector component as a double
     */ 
    public double getDblYVector()
    {
        return(this.vector.getDblY());
    }
    
    /** 
     * The setter for the X vector component
     * 
     * @param xVal is the new X vector component
     */
    public void setXVector(int xVal)
    {
        this.vector.setX(xVal);
    }
    
    /**  
     * The setter for the Y vector component
     * 
     * @param yVal is the new Y vector component
     */
    public void setYVector(int yVal)
    {
        this.vector.setY(yVal);
    }
    
    /** 
     * The setter for the X vector component as a double
     * 
     * @param xVal is the new X vector component as a double
     */
    public void setXVector(double xVal)
    {
        this.vector.setX(xVal);
    }
    
    /**  
     * The setter for the Y vector component as a double
     * 
     * @param yVal is the new Y vector component as a double
     */
    public void setYVector(double yVal)
    {
        this.vector.setY(yVal);
    }
    
    /**  
     * Sets the X and Y positions
     * 
     * @param xVal is the new X coordinate
     * @param yVal is the new Y coordinate
     */
    public void setPosition(int xVal, int yVal)
    {
        this.position.setLocation(xVal,yVal);
    }
    
    /**  
     * Sets the X and Y positions as doubles
     * 
     * @param xVal is the new X coordinate as a double
     * @param yVal is the new Y coordinate as a double
     */
    public void setPosition(double xVal, double yVal)
    {
        this.position.setLocation(xVal,yVal);
    }
    
    /**  
     * Moves the ball by the X and Y movement vectors
     */
    public void move()
    {
        this.position.setOffset(this.vector.getDblX(),this.vector.getDblY());
    }
    
    /**  
     * Moves the ball by the xOff and yOff movement vectors
     * 
     * @param xOff is the offset for the X coordinate
     * @param yOff is the offset for the Y coordinate
     */
    public void move(int xOff, int yOff)
    {
        this.position.setOffset(xOff,yOff);
    }
    
    /**  
     * Moves the ball by the xOff and yOff movement vectors as doubles
     * 
     * @param xOff is the offset for the X coordinate as a double
     * @param yOff is the offset for the Y coordinate as a double
     */
    public void move(double xOff, double yOff)
    {
        this.position.setOffset(xOff,yOff);
    }
    
    /**  
     * Sets the X and Y movement vector components
     * 
     * @param xVal is the new X vector components
     * @param yVal is the new Y vector components
     */
    public void setVector(int xVal, int yVal)
    {
        this.vector.setLocation(xVal,yVal);
    }
    
    /**  
     * Sets the X and Y movement vector components as doubles
     * 
     * @param xVal is the new X vector components as a double
     * @param yVal is the new Y vector components as a double
     */
    public void setVector(double xVal, double yVal)
    {
        this.vector.setLocation(xVal,yVal);
    }

    /**
     * The getter for the radius
     * 
     * @return Returns the radius
     */ 
    public int getRadius()
    {
        return((int) this.radius);
    }

    /**
     * The getter for the radius as a double
     * 
     * @return Returns the radius as a double
     */ 
    public double getDblRadius()
    {
        return(this.radius);
    }
    
    /** 
     * The setter for the radius
     * 
     * @param rVal is the new radius
     */
    public void setRadius(int rVal)
    {
        this.radius = rVal;
    }
    
    /** 
     * The setter for the radius as a double
     * 
     * @param rVal is the new radius as a double
     */
    public void setRadius(double rVal)
    {
        this.radius = rVal;
    }

    /** 
     * The getter for the color
     * 
     * @return Returns the color
     */
    public Color getColor()
    {
        return(this.color);
    }

    /** 
     * The setter for the color
     * 
     * @param color is the new color
     */
    public void setColor(Color color)
    {
        this.color = color;
    }

    /** 
     * The setter for the color using integer color components
     * 
     * @param rCol is the new color's Red component
     * @param gCol is the new color's Green component
     * @param bCol is the new color's Blue component
     */
    public void setColor(int rCol, int gCol, int bCol)
    {
        this.color = new Color(rCol,gCol,bCol);
    }
    
    /** 
     * Gets the distance to integer X and Y coordinates
     * 
     * @param xVal is X coordinate as an integer
     * @param yVal is Y coordinate as an integer
     * @return Returns the distance to the X and Y coordinate
     */
    public double distance(int xVal, int yVal)
    {
        return (position.distance(xVal,yVal));
    }
    
    /** 
     * Gets the distance to the X and Y coordinates as doubles
     * 
     * @param xVal is X coordinate as a double
     * @param yVal is Y coordinate as a double
     * @return Returns the distance to the X and Y coordinate
     */
    public double distance(double xVal, double yVal)
    {
        return (position.distance(xVal,yVal));
    }
    
    /** 
     * Gets the distance to given Ball
     * 
     * @param anotherBall is the given Ball
     * @return the distance to given Ball
     */
    public double distance(Ball anotherBall)
    {
        return (position.distance(anotherBall.getX(),anotherBall.getY()));
    }

    /** 
     * Draws the ball in the current position
     * 
     * @param pict is the Picture object to draw the ball in
     */
    public void drawBall(Picture pict)
    {
        Graphics g = pict.getGraphics();

        g.setColor(this.color);
        g.fillOval(this.position.getX()-(int)this.radius,
                    this.position.getY()-(int)this.radius,
                        (int)(2*this.radius),(int)(2*this.radius));
    }

    /** 
     * Draws an outline of the ball in the current position
     * 
     * @param pict is the Picture object to draw the ball outline in
     */
    public void drawBallOutline(Picture pict)
    {
        Graphics g = pict.getGraphics();

        g.setColor(this.color);
        g.drawOval(this.position.getX()-(int)this.radius,
                    this.position.getY()-(int)this.radius,
                        (int)(2*this.radius),(int)(2*this.radius));
    }
    
    /** 
     * The toString method for the Ball class
     * 
     * @return Returns the Ball's position, it's movement vector, it's radius and it's color
     */
    public String toString()
    {
        return("Ball position: (" + this.position.getX() + "," +
                                        this.position.getY() + ")\n" + 
               "Ball Vector: (" + this.vector.getX() + "," +
                                        this.vector.getY() + ")\n" +
               "Ball Radius: " + this.radius + "\n" +
               "Ball Color: (" + this.color.getRed() + "," +
                           this.color.getGreen() + "," + this.color.getBlue() + ")");
    }
}
