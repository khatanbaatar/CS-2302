/**
 * Course: .....
 * Section: .....
 * Professor: .....
 * Name: .....
 * Assignment #: .....
 */

import java.awt.*;

public class Spot {
	private double xPos, yPos, radius; // the x,y position and radius
	private Color color; // the color

	// Constructor without parameters
	public Spot() {
		this.xPos = 0;
		this.yPos = 0;
		this.radius = 0;
		this.color = Color.black;
	}

	// Constructor with parameters
	public Spot(double xInit, double yInit, double rInit, Color cInit) {
		this.xPos = xInit;
		this.yPos = yInit;
		this.radius = rInit;
		this.color = cInit;
	}

	// Method for drawing a spot
	public void drawSpot(Picture target) {
		Graphics g = target.getGraphics();

		g.setColor(this.color);
		g.fillOval((int) (this.xPos - this.radius),
				(int) (this.yPos - this.radius), (int) (2 * this.radius),
				(int) (2 * this.radius));
	}
}
