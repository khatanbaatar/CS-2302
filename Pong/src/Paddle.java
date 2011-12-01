
import java.awt.*;
import java.awt.geom.*;

import javax.swing.JFrame;

/**
 * The Paddle Class
 * Implements a paddle object that has a top left x and y position point,
 * a width, a height, an offset value for how far it moves each time it calls
 * one of the move methods, and it has a color.

 * Paddle inherits (extends) from the Rectangle class.
 * This means that x, y, width and height already exists and are defined/declared
 * in the Rectangle class. setLocation(int x, int y) also already exists in the
 * Rectangle class, as does setBounds(int x, int y, int width, int height).
 * 
 * @author Alan Shaw
 */

public class Paddle extends Rectangle
{
    private int offset;          
    private Color color;     // the paddle's color
    
    /**
     * Constructor without parameters set the all values to zero, except the
     * color which is set to black
     */ 
    public Paddle()
    {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
        this.offset = 0;
        this.color = Color.black;
    }

    /** 
     * Constructor with parameters
     * @param topX is the paddle's initial top-left x position
     * @param topY is the paddle's initial top-left y position
     * @param width is the paddle's initial width
     * @param height is the paddle's initial height
     * @param offset is the paddle's initial movement offset
     * @param rCol is the paddle's initial color's r component
     * @param gCol is the paddle's initial color's g component
     * @param bCol is the paddle's initial color's b component
     */ 
    public Paddle(int topX, int topY, int width, int height,
                      int offset, int rCol, int gCol, int bCol)
    {
        this.x = topX;
        this.y = topY;
        this.width = width;
        this.height = height;
        this.offset = offset;
        this.color = new Color(rCol,gCol,bCol);
    }
    
    /**  
     * The setter for the top left X coordinate
     * 
     * @param xVal is the new top left X coordinate
     */
    public void setX(int xVal)
    {
        this.x = xVal;
    }
    
    /** 
     * The setter for the top left Y coordinate
     * 
     * @param yVal is the new top left Y coordinate
     */
    public void setY(int yVal)
    {
        this.y = yVal;
    }
    
    /**  
     * The setter for the width
     * 
     * @param wVal is the width
     */
    public void setWidth(int wVal)
    {
        this.width = wVal;
    }
    
    /**  
     * The setter for the height
     * 
     * @param hVal is the height
     */
    public void setHeight(int hVal)
    {
        this.height = hVal;
    }

    /**  
     * The getter for the movement offset
     * 
     * @return Returns the new movement offset value
     */
    public int getOffset()
    {
        return this.offset;
    }

    /**  
     * The setter for the movement offset
     * 
     * @param newOffset is the new movement offset value
     */
    public void setOffset(int newOffset)
    {
        this.offset = newOffset;
    }

    /** 
     * The getter for the color
     * 
     * @return Retuns the color
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
     * The setter for the color
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
     * Moves the paddle up by the movement offset field
     */
    public void moveUp()
    {
        this.y -= this.offset;
    }
    
    /**  
     * Moves the paddle up by the movement offset field within the picture
     * window's bounds
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     */
    public void moveUp(JFrame pict)
    {
        this.y -= this.offset;       // Move y up by the offset
        
        // Test to see if the boundary was in the way above
        if (this.y < 0)
           this.y = 0;               // If so, set top of paddle to zero
    }
    
    /**  
     * Moves the paddle up by the movement offset field within the picture
     * window's bounds avoiding the given ball
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     * @param ball is a ball that causes the paddle to move back if it's in the way
     */
    public void moveUp(JFrame pict, Ball ball)
    {
        this.y -= this.offset;       // Move y up by the offset
        
        // Test to see if the paddle moved into the ball
        if (ball.distance(this.x,this.y) < ball.getRadius() ||
              ball.distance(this.x+this.width/2,this.y) < ball.getRadius() ||
                ball.distance(this.x+this.width,this.y) < ball.getRadius())
           this.y += this.offset;    // If so, move it out of the ball
        
        // Test to see if the boundary was in the way above
        if (this.y < 0)
           this.y = 0;               // If so, set top of paddle to zero
    }
    
    /**  
     * Moves the paddle up by the movement offset field within the picture
     * window's bounds avoiding any ball in the given Ball list
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     * @param bList is a the list of balls to test to see if any balls are in the way
     */
   /* public void moveUp(Picture pict, BouncingList bList)
    {
        this.y -= this.offset;       // Move y up by the offset
        
        boolean isTouching = false;  // See if the paddle moved into any ball  
        for (int i = 0; i < bList.size(); ++i)
        {
            Ball ball = bList.getBall(i);
            if (ball.distance(this.x,this.y) < ball.getRadius() ||
                  ball.distance(this.x+this.width/2,this.y) < ball.getRadius() ||
                    ball.distance(this.x+this.width,this.y) < ball.getRadius())
                isTouching = true;
        }
        if (isTouching)
            this.y += this.offset;    // If so, move it out of the ball
        
        // Test to see if the boundary was in the way above
        if (this.y < 0)
           this.y = 0;               // If so, set top of paddle to zero
    }
 */

    /**  
     * Moves the paddle down by the movement offset field
     */
    public void moveDown()
    {
        this.y += this.offset;
    }
    
    /**  
     * Moves the paddle down by the movement offset field within the picture
     * window's bounds
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     */
    public void moveDown(JFrame pict)
    {
        this.y += this.offset;       // Move y down by the offset
        
        // Test to see if the boundary was in the way below
        if (this.y + this.height > pict.getHeight())
            this.y = pict.getHeight() - this.height;    // If so, set bottom to picture bottom
    }
    
    /**  
     * Moves the paddle down by the movement offset field within the picture
     * window's bounds avoiding the given ball
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     * @param ball is a ball that causes the paddle to move back if it's in the way
     */
    public void moveDown(JFrame pict, Ball ball)
    {
        this.y += this.offset;       // Move y down by the offset
        
        // Test to see if the paddle moved into the ball
        if (ball.distance(this.x,this.y+this.height) < ball.getRadius() ||
              ball.distance(this.x+this.width/2,this.y+this.height) < ball.getRadius() ||
                ball.distance(this.x+this.width,this.y+this.height) < ball.getRadius())
           this.y -= this.offset;    // If so, move it out of the ball
        
        // Test to see if the boundary was in the way below
        if (this.y + this.height > pict.getHeight())
            this.y = pict.getHeight() - this.height;    // If so, set bottom to picture bottom
    }
    
    /**  
     * Moves the paddle down by the movement offset field within the picture
     * window's bounds avoiding any ball in the given Ball list
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     * @param bList is a the list of balls to test to see if any balls are in the way
     */
    /*public void moveDown(Picture pict, BouncingList bList)
    {
        this.y += this.offset;       // Move y down by the offset
        
        boolean isTouching = false;  // See if the paddle moved into any ball  
        for (int i = 0; i < bList.size(); ++i)
        {
            Ball ball = bList.getBall(i);
            if (ball.distance(this.x,this.y+this.height) < ball.getRadius() ||
                  ball.distance(this.x+this.width/2,this.y+this.height) < ball.getRadius() ||
                    ball.distance(this.x+this.width,this.y+this.height) < ball.getRadius())
                isTouching = true;
        }
        if (isTouching)
           this.y -= this.offset;    // If so, move it out of the ball
        
        // Test to see if the boundary was in the way below
        if (this.y + this.height > pict.getHeight())
            this.y = pict.getHeight() - this.height;    // If so, set bottom to picture bottom
    }
    */
   
    /**  
     * Moves the paddle left by the movement offset field
     */
    public void moveLeft()
    {
        this.x -= this.offset;
    }
    
    /**  
     * Moves the paddle left by the movement offset field within the picture
     * window's bounds
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     */
    public void moveLeft(JFrame pict)
    {
        this.x -= this.offset;       // Move x left by the offset
        
        // Test to see if the boundary was in the way to the left
        if (this.x < 0)
           this.x = 0;               // If so, set left of paddle to zero
    }
    
    /**  
     * Moves the paddle left by the movement offset field within the picture
     * window's bounds avoiding the given ball
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     * @param ball is a ball that causes the paddle to move back if it's in the way
     */
    public void moveLeft(JFrame pict, Ball ball)
    {
        this.x -= this.offset;       // Move x left by the offset
        
        // Test to see if the paddle moved into the ball
        if (ball.distance(this.x,this.y) < ball.getRadius() ||
              ball.distance(this.x,this.y+this.height/2) < ball.getRadius() ||
                ball.distance(this.x,this.y+this.height) < ball.getRadius())
           this.x += this.offset;    // If so, move it out of the ball
        
        // Test to see if the boundary was in the way to the left
        if (this.x < 0)
           this.x = 0;               // If so, set left of paddle to zero
    }
    
    /**  
     * Moves the paddle left by the movement offset field within the picture
     * window's bounds avoiding any ball in the given Ball list
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     * @param bList is a the list of balls to test to see if any balls are in the way
     */
    /* public void moveLeft(Picture pict, BouncingList bList)
    {
        this.x -= this.offset;       // Move x left by the offset
        
        boolean isTouching = false;  // See if the paddle moved into any ball  
        for (int i = 0; i < bList.size(); ++i)
        {
            Ball ball = bList.getBall(i);
            if (ball.distance(this.x,this.y) < ball.getRadius() ||
                  ball.distance(this.x,this.y+this.height/2) < ball.getRadius() ||
                    ball.distance(this.x,this.y+this.height) < ball.getRadius())
                isTouching = true;
        }
        if (isTouching)
           this.x += this.offset;    // If so, move it out of the ball
        
        // Test to see if the boundary was in the way to the left
        if (this.x < 0)
           this.x = 0;               // If so, set left of paddle to zero
    }
    
    /**  
     * Moves the paddle right by the movement offset field
     */
    
    
   
    public void moveRight()
    {
        this.x += this.offset;
    }
    
    /**  
     * Moves the paddle right by the movement offset field within the picture
     * window's bounds
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     */
    public void moveRight(JFrame pict)
    {
        this.x += this.offset;       // Move x right by the offset
        
        // Test to see if the boundary was in the way on the right
        if (this.x + this.width > pict.getWidth())
            this.x = pict.getWidth() - this.width;    // If so, set right to right edge
    }
    
    /**  
     * Moves the paddle right by the movement offset field within the picture
     * window's bounds avoiding the given ball
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     * @param ball is a ball that causes the paddle to move back if it's in the way
     */
    public void moveRight(JFrame pict, Ball ball)
    {
        this.x += this.offset;       // Move x right by the offset
        
        // Test to see if the paddle moved into the ball
        if (ball.distance(this.x+this.width,this.y) < ball.getRadius() ||
              ball.distance(this.x+this.width,this.y+this.height/2) < ball.getRadius() ||
                ball.distance(this.x+this.width,this.y+this.height) < ball.getRadius())
           this.x -= this.offset;    // If so, move it out of the ball
        
        // Test to see if the boundary was in the way on the right
        if (this.x + this.width > pict.getWidth())
            this.x = pict.getWidth() - this.width;    // If so, set right to right edge
    }
    
    /**  
     * Moves the paddle right by the movement offset field within the picture
     * window's bounds avoiding any ball in the given Ball list
     * 
     * @param pict is the Picture object with the boundary to keep the paddle within
     * @param bList is a the list of balls to test to see if any balls are in the way
     */
   /* public void moveRight(Picture pict, BouncingList bList)
    {
        this.x += this.offset;       // Move x right by the offset
        
        boolean isTouching = false;  // See if the paddle moved into any ball  
        for (int i = 0; i < bList.size(); ++i)
        {
            Ball ball = bList.getBall(i);
            if (ball.distance(this.x+this.width,this.y) < ball.getRadius() ||
                  ball.distance(this.x+this.width,this.y+this.height/2) < ball.getRadius() ||
                    ball.distance(this.x+this.width,this.y+this.height) < ball.getRadius())
                isTouching = true;
        }
        if (isTouching)
           this.x -= this.offset;    // If so, move it out of the ball
        
        // Test to see if the boundary was in the way on the right
        if (this.x + this.width > pict.getWidth())
            this.x = pict.getWidth() - this.width;    // If so, set right to right edge
    }
    
    

    /** 
     * Draws the paddle in the current position
     * 
     * @param pict is Picture object to draw the paddle in
     */
    public void drawPaddle(JFrame pict)
    {
        Graphics g = pict.getGraphics();

        g.setColor(this.color);
        g.fillRect(this.x,this.y,this.width,this.height);
    }

    /** 
     * Draws an outline of the paddle in the current position
     * 
     * @param pict is Picture object to draw the paddle outline in
     */
    public void drawPaddleOutline(JFrame pict)
    {
        Graphics g = pict.getGraphics();

        g.setColor(this.color);
        g.drawRect(this.x,this.y,this.width,this.height);
    }

    /** 
     * Draws an filled paddle with an extra outline around it in the current position
     * 
     * @param pict is Picture object to draw the paddle outline in
     */
    public void drawPaddleXtr(JFrame pict)
    {
        Graphics g = pict.getGraphics();

        g.setColor(this.color);
        g.fillRect(this.x,this.y,this.width,this.height);
        g.setColor(Color.black);
        g.drawRect(this.x,this.y,this.width,this.height);
    }
    
    /** 
     * Determines if the given ball has collided with the paddle and returns
     * true if it has and false if it has not.  If the ball has collided with
     * the paddle the balls movement vectors are modified so the ball will
     * bounce back at the proper angle.
     * 
     * @param ball is the ball to examine to see if it has collided with the paddle
     * @return Returns true if ball collides with paddle and if so updates vectors
     */
    public boolean collision(Ball ball)
    {
        // Temp variables for paddle corner coordinates;
        int pX1 = this.x;
        int pX2 = pX1 + this.width - 1;
        int pY1 = this.y;
        int pY2 = pY1 + this.height - 1;
        
        // Temp variables  for ball coordinates, movement vectors, and radius
        int bX = ball.getX();
        int bY = ball.getY();
        int vX = ball.getXVector();
        int vY = ball.getYVector();
        int bRad = ball.getRadius();
        
        // Testing for collisions with the paddle edges and the Ball
        if (bX < pX1 && bY >= pY1 && bY <= pY2 && vX > 0)  // left edge
        {
            if (bX + bRad > pX1)   // will collide with edge
            {
                ball.setX(pX1 - bRad);
                ball.setXVector(-Math.abs(vX));      // Change x direction
                return true;
            }
        }
        else if (bX > pX2 && bY >= pY1 && bY <= pY2 && vX < 0)  // right edge
        {
            if (bX - bRad < pX2)   // will collide with edge
            {
                ball.setX(pX2 + bRad);
                ball.setXVector(Math.abs(vX));      // Change x direction
                return true;
            }
        }
        else if (bY < pY1 && bX >= pX1 && bX <= pX2 && vY > 0)  // top edge
        {
            if (bY + bRad > pY1)   // will collide with edge
            {
                ball.setY(pY1 - bRad);
                ball.setYVector(-Math.abs(vY));      // Change y direction
                return true;
            }
        }
        else if (bY > pY2 && bX >= pX1 && bX <= pX2 && vY < 0)   // bottom edge
        {
            if (bY - bRad < pY2)   // will collide with edge
            {
                ball.setY(pY2 + bRad);
                ball.setYVector(Math.abs(vY));      // Change y direction
                return true;
            }
        }
        else   // Otherwise test to see if the ball hits a corner of the paddle
        {
            if (ball.distance(pX1,pY1) <= bRad &&
                            ball.distance(pX1,pY1) <= ball.distance(pX2,pY1))
            { // top-left corner collision
                if (Math.abs(pX1-bX) >= Math.abs(pY1-bY))
                    if (vX > 0)
                        ball.setXVector(-vX);
                if (Math.abs(pX1-bX) <= Math.abs(pY1-bY))
                    if (vY > 0)
                        ball.setYVector(-vY);
                return true;
            }
            else if (ball.distance(pX2,pY1) <= bRad)
            { // top-right corner collision
                if (Math.abs(pX2-bX) >= Math.abs(pY1-bY))
                    if (vX < 0)
                        ball.setXVector(-vX);
                if (Math.abs(pX2-bX) <= Math.abs(pY1-bY))
                    if (vY > 0)
                        ball.setYVector(-vY);
                return true;
            }
            else if (ball.distance(pX2,pY2) <= bRad &&
                            ball.distance(pX2,pY2) <= ball.distance(pX1,pY2))
            { // bottom-right corner collision
                if (Math.abs(pX2-bX) >= Math.abs(pY2-bY))
                    if (vX < 0)
                        ball.setXVector(-vX);
                if (Math.abs(pX2-bX) <= Math.abs(pY2-bY))
                    if (vY < 0)
                        ball.setYVector(-vY);
                return true;
            }
            else if (ball.distance(pX1,pY2) <= bRad)
            { // bottom-left corner collision
                if (Math.abs(pX1-bX) >= Math.abs(pY2-bY))
                    if (vX > 0)
                        ball.setXVector(-vX);
                if (Math.abs(pX1-bX) <= Math.abs(pY2-bY))
                    if (vY < 0)
                        ball.setYVector(-vY);
                return true;
            }
        }
        return false;
    }
    
    /** 
     * Determines if any ball in the given list of balls has collided with the
     * paddle and returns true if any has and false if they all have not.  If
     * a ball has collided with the paddle that balls movement vectors are
     * modified so the ball will bounce back at the proper angle.
     * 
     * @param bList is the list of balls in the picture window with the paddle
     * @return Returns true if any ball collides with paddle and if so updates vectors
     */
   /* public boolean collision(BouncingList bList)
    {
        boolean isHit = false;
        
        for (int i = 0; i < bList.size() && !isHit; ++i)
            if (collision(bList.getBall(i)))
                isHit = true;
        return isHit;
    }
    */
   
    /** 
     * The toString method for the Padddle class
     * 
     * @return Returns the Padddle's position, it's movement offset and it's color components
     */
    public String toString()
    {
        return("Paddle position: (" + this.x + "," + this.y + ")\n" + 
               "Paddle offset amout: " + this.offset + "\n" +
               "Ball Color: (" + this.color.getRed() + "," +
                           this.color.getGreen() + "," + this.color.getBlue() + ")");
    }
}
