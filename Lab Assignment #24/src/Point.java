/**
 * The Point Class: Implements a point object where the x and y coordinates can
 * be either integers or doubles. The integer values are what are returned by
 * getX() and getY() while the doubles are returned by getDblX() and getDblY().
 * 
 * @author Alan Shaw
 */
public class Point {
	private double xPos, yPos; // the x and y coordinates

	/**
	 * Constructor without parameters, sets x and y to zero
	 */
	public Point() {
		this.xPos = 0;
		this.yPos = 0;
	}

	/**
	 * Constructor with integer parameters
	 * 
	 * @param xInit
	 *            is the ball's initial x position
	 * @param yInit
	 *            is the ball's initial y position
	 */
	public Point(int xInit, int yInit) {
		this.xPos = xInit;
		this.yPos = yInit;
	}

	/**
	 * Constructor with parameters that are doubles
	 * 
	 * @param xInit
	 *            is the ball's initial x position as a double
	 * @param yInit
	 *            is the ball's initial y position as a double
	 */
	public Point(double xInit, double yInit) {
		this.xPos = xInit;
		this.yPos = yInit;
	}

	/**
	 * The getter for the X coordinate
	 * 
	 * @return returns the X coordinate
	 */
	public int getX() {
		return (int) this.xPos;
	}

	/**
	 * The getter for the Y coordinate
	 * 
	 * @return returns the Y coordinate
	 */
	public int getY() {
		return (int) this.yPos;
	}

	/**
	 * The getter for the X coordinate as a double
	 * 
	 * @return returns the X coordinate as a double
	 */
	public double getDblX() {
		return this.xPos;
	}

	/**
	 * The getter for the Y coordinate as a double
	 * 
	 * @return returns the Y coordinate as a double
	 */
	public double getDblY() {
		return this.yPos;
	}

	/**
	 * The setter for the X coordinate
	 * 
	 * @param xVal
	 *            is the new X coordinate
	 */
	public void setX(int xVal) {
		this.xPos = xVal;
	}

	/**
	 * The setter for the Y coordinate
	 * 
	 * @param yVal
	 *            is the new Y coordinate
	 */
	public void setY(int yVal) {
		this.yPos = yVal;
	}

	/**
	 * The setter for the X coordinate as a double
	 * 
	 * @param xVal
	 *            is the new X coordinate as a double
	 */
	public void setX(double xVal) {
		this.xPos = xVal;
	}

	/**
	 * The setter for the Y coordinate as a double
	 * 
	 * @param yVal
	 *            is the new Y coordinate as a double
	 */
	public void setY(double yVal) {
		this.yPos = yVal;
	}

	/**
	 * The setter for the X and Y coordinates
	 * 
	 * @param XVal
	 *            is the new X coordinate
	 * @param yVal
	 *            is the new Y coordinate
	 */
	public void setLocation(int xVal, int yVal) {
		this.xPos = xVal;
		this.yPos = yVal;
	}

	/**
	 * The setter for the X and Y coordinates as doubles
	 * 
	 * @param XVal
	 *            is the new X coordinate as a double
	 * @param yVal
	 *            is the new Y coordinate as a double
	 */
	public void setLocation(double xVal, double yVal) {
		this.xPos = xVal;
		this.yPos = yVal;
	}

	/**
	 * Moves the X and Y coordinates by the given integer offsets
	 * 
	 * @param xOff
	 *            is the offset for the X coordinate
	 * @param yOff
	 *            is the offset for the Y coordinate
	 */
	public void setOffset(int xOff, int yOff) {
		this.xPos += xOff;
		this.yPos += yOff;
	}

	/**
	 * Moves the X and Y coordinates by the given offsets as doubles
	 * 
	 * @param xOff
	 *            is the offset for the X coordinate
	 * @param yOff
	 *            is the offset for the Y coordinate
	 */
	public void setOffset(double xOff, double yOff) {
		this.xPos += xOff;
		this.yPos += yOff;
	}

	/**
	 * Gets the distance to the X and Y integer coordinate
	 * 
	 * @param xVal
	 *            is the X coordinate
	 * @param xVal
	 *            is the Y coordinate
	 * @return returns the distance to the X and Y coordinate
	 */
	public double distance(int xVal, int yVal) {
		return Math.sqrt(Math.pow(xVal - this.xPos, 2)
				+ Math.pow(yVal - this.yPos, 2));
	}

	/**
	 * Gets the distance to the X and Y coordinate as doubles
	 * 
	 * @param xVal
	 *            is the X coordinate as a double
	 * @param xVal
	 *            is the Y coordinate as a double
	 * @return returns the distance to the X and Y coordinate
	 */
	public double distance(double xVal, double yVal) {
		return Math.sqrt(Math.pow(xVal - this.xPos, 2)
				+ Math.pow(yVal - this.yPos, 2));
	}

	/**
	 * Gets the distance to another given point
	 * 
	 * @param thePoint
	 *            is the point from which to determine the distance
	 * @return returns the distance to the given point
	 */
	public double distance(Point thePoint) {
		return Math.sqrt(Math.pow(thePoint.getDblX() - this.xPos, 2)
				+ Math.pow(thePoint.getDblY() - this.yPos, 2));
	}

	/**
	 * The toString method for the Point Class
	 * 
	 * @return returns the Point's (x,y) position string
	 */
	public String toString() {
		return ("Point: (" + this.xPos + ", " + this.yPos + ")");
	}

}