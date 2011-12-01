import java.util.ArrayList;
import java.util.Random;

/**
 * The BouncingList Class
 * Implements a list of bouncing ball objects that bounce off of each other when they collide
 * and that bounce off of the edges of the picture screen when they hit that.  The list of balls
 * can be created with a ball that is given or it can be started off as an empty list with a
 * no parameter constructor call.  
 * New automatically generated balls can be added by calling the addBall() method with the width and
 * height of the picture window, or the addBall() method can be passed a given Ball object as
 * it parameter, adding the given Ball to the list.  The balls that are automatically generated
 * are all of the same radius, which is defined by a static constant named RADIUS, and they are
 * placed at a random location within the width and height of the picture give.  Any ball in the
 * list may be removed using the rmvBall() method.  The move() method causes the balls in the
 * list to advance one more step in their movement.
 * 
 * When a number of balls collide at the same time they may cause a ball to go into another ball
 * and when this happens a ball is frozen in place until the other balls move away so it can
 * move again.  Because this can happen to more than one ball at a time, a list of frozen ball 
 * boolean indexes is also maintained.  Note: a frozen ball is not the same as a ball that has
 * no velocity vector, because it starts moving again when the other balls have moved away from it.
 * 
 * @author Alan Shaw
 */

public class BouncingList
{
    public static final int RADIUS = 20;       // radius of self-generated balls 
    private ArrayList ballList;
    private ArrayList frozenList;
    private int rCol = 0, gCol = 0, bCol = 0;  // Default ball color is black
    private boolean inMove = false;

    /**
     * Constructor without parameters: sets the Ball list to the null list
     */ 
    public BouncingList()
    {
        ballList = new ArrayList();
        frozenList = new ArrayList();
    }

    /**
     * Constructor with a parameter: sets the Ball list to have the initial Ball given
     */ 
    public BouncingList(Ball initialBall)
    {
        ballList = new ArrayList();
        ballList.add(initialBall);
        
        frozenList = new ArrayList();
        frozenList.add(new Boolean(false));
    }
    
    /** 
     * Gets the size of the Ball list
     * 
     * @return Returns the size of the Ball list
     */
    public int size()
    {
        return(ballList.size());
    }
    
    /** 
     * Gets the Ball in the Ball list at the given index
     * 
     * @return Returns the Ball at the given index
     */
    public Ball getBall(int index)
    {
        if (index >= ballList.size())
            return null;
        return((Ball) ballList.get(index));
    }
    
    /**  
     * Adds a ball in a random location in a window with the width and height given
     * 
     * @param width is the width of the picture window the balls will bounce within
     * @param height is the height of the picture window the balls will bounce within
     */
    public void addBall(int width, int height)
    {
        Random rand = new Random();
                        
        int xpos = RADIUS + 5 + rand.nextInt(width - 10 - RADIUS - RADIUS);
        int ypos = RADIUS + 5 + rand.nextInt(height - 10 - RADIUS - RADIUS);
        // int xval = 4 + rand.nextInt(5);  // 4 <= x vector component <= 8
        int xval = 1 + rand.nextInt(2);  // 1 <= x vector component <= 2
        xval *= (rand.nextInt(2) == 1) ? -1 : 1;
        // int yval = 4 + rand.nextInt(5);  // 4 <= y vector component <= 8
        int yval = 1 + rand.nextInt(2);  // 1 <= y vector component <= 2
        yval *= (rand.nextInt(2) == 1) ? -1 : 1;
        ballList.add(new Ball(xpos,ypos,xval,yval,RADIUS,rCol,gCol,bCol));
        addFrozenState();
    }
    
    /**  
     * Adds a given ball to the Ball list
     * 
     * @param newBall is the ball to add to the ball list
     */
    public void addBall(Ball newBall)
    {
        ballList.add(newBall);
        addFrozenState();
    }
    
    // Checks to see if the last Ball added to the list is touching any of the
    // other balls, and if so it adds true to the boolean list of frozen balls
    private void addFrozenState()
    {
        Ball lastball, thisball;
        boolean isTouching = false;
        
        if (ballList.size() < 1)        return;
        else if (ballList.size() > 1)
        {
            lastball = (Ball) ballList.get(ballList.size() - 1);
            for (int i = 0; i < ballList.size() - 1; ++i)
            {
                thisball = (Ball) ballList.get(i);
                if (lastball.distance(thisball) <= lastball.getDblRadius() + thisball.getDblRadius() &&
                                                       !((Boolean) frozenList.get(i)))
                    isTouching = true;
            }
        }
        frozenList.add(new Boolean(isTouching));
    }
    
    /**  
     * Removes the last ball added to the Ball list
     */
    public void rmvBall()
    {
        if (ballList.size() > 0 && !inMove)
            ballList.remove(ballList.size() - 1);
    }
    
    /**  
     * Removes the ball at the given index
     */
    public void rmvBall(int index)
    {
        if (index > -1 && ballList.size() > index && !inMove)
            ballList.remove(index);
    }
    
    /**  
     * Changes the RGB value of the default color for automatically generated balls
     * 
     * @param newRCol is the new color's Red component
     * @param newGCol is the new color's Green component
     * @param newBCol is the new color's Blue component
     */
    public void setRGB(int newRCol, int newGCol, int newBCol)
    {
        rCol = newRCol;
        gCol = newGCol;
        bCol = newBCol;
    }

    /**  
     * Draws all the balls in the Ball list in the given picture window
     * 
     * @param pict is the Picture object to draw the balls in
     */
    public void drawBalls(Picture pict)
    {
        for (int i = 0; i < ballList.size(); ++i)
            ((Ball)ballList.get(i)).drawBall(pict);
    }

    /**  
     * Draws the ball at a given index in the Ball list in the given picture window
     * 
     * @param pict is the Picture object to draw the ball in
     * @param ballIndex is the index for the ball to draw in the Ball list 
     */
    public void drawBall(Picture pict, int ballIndex)
    {
        ((Ball)ballList.get(ballIndex)).drawBall(pict);
    }

    /** 
     * Determines if a ball at the given index is touching any of the other balls
     * in the Ball list
     * 
     * @param ballIndex is the index for the ball to check for a collision
     * @return true if the given ball is touching any other unfrozen ball in Ball list
     */
    public boolean collision(int ballIndex)
    {
        Ball ball, nextball;
        boolean isTouching = false;
        
        if (ballIndex < 0 || ballIndex >= ballList.size())    return false;
        ball = (Ball) ballList.get(ballIndex);
        for (int i = 0; i < ballList.size(); ++i)
            if (i != ballIndex && !((Boolean) frozenList.get(i)))
            {
                nextball = (Ball) ballList.get(i);
                if (ball.distance(nextball) <= ball.getDblRadius() + nextball.getDblRadius())
                    isTouching = true;
            }
        return(isTouching);
    }

    /** 
     * Determines if any of the balls in the Ball list are touching an object at
     * the given (x,y) location and the given radius
     * 
     * @param xVal is the x coordinate to check for a collision
     * @param yVal is the y coordinate to check for a collision
     * @param radius is the radius of the object to check for a collision
     * @return true if the any unfrozen ball in Ball list is within the radius around xVal, yVal
     */
    public boolean collision(int xVal, int yVal, int radius)
    {
        Ball ball;
        boolean isTouching = false;
        
        for (int i = 0; i < ballList.size(); ++i)
            if (!((Boolean) frozenList.get(i)))
            {
                ball = (Ball) ballList.get(i);
                if (ball.distance(xVal,yVal) <= radius + ball.getDblRadius())
                    isTouching = true;
            }
        return(isTouching);
    }

    /**  
     * Moves the balls in the Ball list one more step in their movement.
     * 
     * @param width is the width of the picture window the balls will bounce within
     * @param height is the height of the picture window the balls will bounce within
     */
    public void move(int width, int height)
    {
        int ballamt = ballList.size();
        ArrayList ballListCopy;
        ArrayList ballListTemp;
        Ball ball, ballTemp;
        double bdis[][];
        
        if (ballamt > 0)
        {
            inMove = true;
            
            // Make a copy of each ball for later combining Ball vectors
            ballListCopy = new ArrayList();
            ballListTemp = new ArrayList();
            bdis = new double[ballamt][ballamt];
            for (int i = 0; i < ballamt; ++i)
            {
                ballTemp = (Ball) ballList.get(i);
                ballListCopy.add(new Ball(ballTemp.getX(),ballTemp.getY(),
                     ballTemp.getXVector(),ballTemp.getYVector(),ballTemp.getDblRadius(),0,0,0));
                            
                for (int j = 0; j < ballamt; ++j)   bdis[i][j] = 0.0;
            }
            
            // If the balls collide, change motion vectors with collisionWithBall()
            for (int i = 0; i < ballamt; ++i)
                if (!((Boolean) frozenList.get(i)))
                {
                    ball = (Ball) ballList.get(i);
                    for (int j = 0; j < ballamt; ++j)
                    {
                        ballTemp = (Ball) ballListCopy.get(j);
                        ballListTemp.add(new Ball(ballTemp.getX(),ballTemp.getY(),
                                               ballTemp.getXVector(),ballTemp.getYVector(),
                                                             ballTemp.getDblRadius(),0,0,0));
                    }
                    for (int j = 0; j < ballamt; ++j)
                        if (i != j)
                        {
                            ballTemp = (Ball) ballListTemp.get(j);
                            if ((ball.distance(ballTemp) <= ball.getDblRadius() + ballTemp.getDblRadius()) &&
                                                    !((Boolean) frozenList.get(j)))
                                collisionWithBall(ball,ballTemp);
                        }
                    ballListTemp.clear();
                }
            ballListCopy.clear();
            
            // Record distances between balls to see if any get stuck together
            for (int i = 0; i < ballamt; ++i)
                if (!((Boolean) frozenList.get(i)))
                {
                    ball = (Ball) ballList.get(i);
                    for (int j = 0; j < ballamt; ++j)
                        if (i != j && !((Boolean) frozenList.get(j)))
                            bdis[i][j] = ball.distance((Ball)ballList.get(j));
                }
            
            // Move all of the unfrozen Balls
            for (int i = 0; i < ballamt; ++i)
                if (!((Boolean) frozenList.get(i)))
                    ((Ball)ballList.get(i)).move();
            
            // If any of the balls did get stuck together, bump them apart
            for (int i = 0; i < ballamt; ++i)
                if (!((Boolean) frozenList.get(i)))
                {
                    ball = (Ball) ballList.get(i);
                    for (int j = 0; j < ballamt; ++j)
                    {
                        ballTemp = (Ball) ballList.get(j);
                        if (i != j && !((Boolean) frozenList.get(j)) && bdis[i][j] != 0.0 &&
                                ((Math.abs(bdis[i][j]-ball.distance(ballTemp)) < 1 &&
                                                 bdis[i][j] <= ball.getDblRadius() + ballTemp.getDblRadius() + 2) ||
                                (bdis[i][j] <= ball.getDblRadius() + ballTemp.getDblRadius() &&
                                      ball.distance(ballTemp) <= ball.getDblRadius() + ballTemp.getDblRadius())))
                        {
                            bump(ball,ballTemp);
                            bdis[i][j] = 0.0;
                            bdis[j][i] = 0.0;
                        }
                    }
                }
            
            // If a ball collides with the wall, change its motion with collisionWithWall()
            for (int i = 0; i < ballamt; ++i)
                if (!((Boolean) frozenList.get(i)))
                {
                    ball = (Ball) ballList.get(i);
                    if (!insideWall(ball,width,height))
                        collisionWithWall(ball,width,height);
                }

            // Unfreeze any frozen ball that is no longer touching anything
            for (int i = 0; i < ballamt; ++i)
                if ((Boolean) frozenList.get(i))
                {
                    boolean isTouching = false;
                    ball = (Ball) ballList.get(i);
                    for (int j = 0; j < ballamt; ++j)
                    {
                        ballTemp = (Ball) ballList.get(j);
                        if ((i != j && ball.distance(ballTemp) <=
                                            ball.getDblRadius() + ballTemp.getDblRadius()) &&
                                                                        !((Boolean) frozenList.get(j)))
                            isTouching = true;
                    }
                    if (!isTouching)
                    {
                        frozenList.remove(i);
                        frozenList.add(i,new Boolean(false));
                    }
                }
            inMove = false;
        }
    }
    
    // Checks to see if the given ball is inside the borders of the given width and height
    private boolean insideWall(Ball ball, int width, int height)
    {
        return(ball.getX() >= ball.getDblRadius() && ball.getX() + ball.getDblRadius() < width &&
                ball.getY() >= ball.getDblRadius() && ball.getY() + ball.getDblRadius() < height);
    }
    
    // Checks to see if the given ball has collided with the borders of the given width
    // and height of the picture window, and if there is a collision, the ball's movement
    // vectors are updated to represent the new direction of the ball after it bounces
    private void collisionWithWall(Ball ball, int width, int height)
    {
        int x = ball.getX(), y = ball.getY();
        
        if ((x < ball.getDblRadius()) || (x + ball.getDblRadius() > width))
        {
            ball.setX((x < ball.getDblRadius()) ? ball.getDblRadius() : width - ball.getDblRadius());
            ball.setXVector(-ball.getXVector());   // Change x direction
        }
        if ((y < ball.getDblRadius()) || (y + ball.getDblRadius() > height))
        {
            ball.setY((y < ball.getDblRadius()) ? ball.getDblRadius() : height - ball.getDblRadius());
            ball.setYVector(-ball.getYVector());   // Change y direction
        }
    }

    /***************************************************************************************
     *  Determines when two given balls have collided and computes their new trajectories.
     *  To calculate the new vector trajectories after a collision, you need to do the
     *  following four steps:
     *  
     *  Step 1. Calculate the angle (a) of the imaginary axis through the centers of the
     *          balls with the horizontal axis:  tan a = dx/dy  ==>  a = arctan(dx/dy)
     *  Step 2. Rotate the motion vectors of both balls by the inverse angle (-a).  This
     *          has the effect of aligning the collision to the horizontal axis.  To
     *          rotate vector v by angle a to make vector v' you translate x & y as follows:
     *                   x' = x * cos(a) - y * sin(a)
     *                   y' = x * sin(a) + y * cos(a)
     *  Step 3. Swap the horizontal components of the vectors - as would happen in a one
     *          dimensional collision (the vertical components remain unchanged.)
     *  Step 4. Rotate the motion vectors back through the original angle (+a)
     */
    private void collisionWithBall(Ball ball1, Ball ball2)
    {
        double angle, xsav;   // The collision angle and a temporary x variable
        
        // Calculating the angle: Step 1
        if (ball2.getX() == ball1.getX())
            angle = (ball2.getY() > ball1.getY()) ? Math.PI / 2 : -Math.PI / 2;
        else
            angle = Math.atan((ball2.getY()-ball1.getY()) / (ball2.getX()-ball1.getX()));
        
        // Rotatiing the motion for Ball1 and Ball2 by -angle
        ball1.setVector((int)(ball1.getXVector() * Math.cos(-angle) - ball1.getYVector() * Math.sin(-angle)),
                        (int)(ball1.getXVector() * Math.sin(-angle) + ball1.getYVector() * Math.cos(-angle)));
        ball2.setVector((int)(ball2.getXVector() * Math.cos(-angle) - ball2.getYVector() * Math.sin(-angle)),
                        (int)(ball2.getXVector() * Math.sin(-angle) + ball2.getYVector() * Math.cos(-angle)));
        
        // Swapping the horizontal components of the two vectors
        xsav = ball1.getXVector();
        ball1.setVector(ball2.getXVector(),ball1.getYVector());
        ball2.setVector((int)(xsav),ball2.getYVector());
        
        // Rotatiing back the motion for Ball1 and Ball2 by +angle
        ball1.setVector((int)(ball1.getXVector() * Math.cos(angle) - ball1.getYVector() * Math.sin(angle)),
                        (int)(ball1.getXVector() * Math.sin(angle) + ball1.getYVector() * Math.cos(angle)));
        ball2.setVector((int)(ball2.getXVector() * Math.cos(angle) - ball2.getYVector() * Math.sin(angle)),
                        (int)(ball2.getXVector() * Math.sin(angle) + ball2.getYVector() * Math.cos(angle)));
    }
    
    // Bumps two balls away from each other when they are still touching even after bouncing
    // off of each other during a collision
    private void bump(Ball ball1, Ball ball2)
    {
        double angle, xadd, yadd;
        
        // Calculating the angle
        if (ball2.getX() == ball1.getX())
            angle = (ball2.getY() > ball1.getY()) ? Math.PI / 2 : -Math.PI / 2;
        else
            angle = Math.atan((ball2.getY()-ball1.getY()) / (ball2.getX()-ball1.getX()));
        
        // Calculating the first ball's bump
        xadd = Math.abs(ball1.getDblRadius() * Math.cos(angle))/2;
        yadd = Math.abs(ball1.getDblRadius() * Math.sin(angle))/2;
        if (ball1.getX() < ball2.getX())
            xadd = -xadd;
        if (ball1.getY() < ball2.getY())
            yadd = -yadd;
        ball1.setVector((int)(ball1.getXVector()+xadd),(int)(ball1.getYVector()+yadd));
        
        // Calculating the second ball's bump
        xadd = Math.abs(ball2.getDblRadius() * Math.cos(angle))/2;
        yadd = Math.abs(ball2.getDblRadius() * Math.sin(angle))/2;
        if (ball2.getX() < ball1.getX())
            xadd = -xadd;
        if (ball2.getY() < ball1.getY())
            yadd = -yadd;
        ball1.setVector((int)(ball2.getXVector()+xadd),(int)(ball2.getYVector()+yadd));
    }
}