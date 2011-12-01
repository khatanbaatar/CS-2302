/**
 * Course: ....
 * Section: .....
 * Professor: ......
 * Name: .....
 * Assignment #: ...... 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveBall {
	static double x, y, radius;
	static Ball ball = new Ball(150, 150, 5, 5, 30, 255, 0, 0);
	static Picture pict = new Picture(300, 300);
	static int width = pict.getWidth() - 1, height = pict.getHeight() - 1;

	public static void main(String[] args) {
		pict.show();

		
		
		ball.drawBall(pict);

		pict.getPictureFrame().frame
				.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pict.getPictureFrame().frame.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				handleKey(e.getKeyChar());
			}
		});

		while (true) {
			if (true) {
				ball.move();
				x = ball.getX();
				y = ball.getY();
				radius = ball.getRadius();
				// if the ball hits the left or right wall
				if (x < radius || x + radius > width) {
					ball.setX((x < radius) ? radius : width - radius);
					ball.setXVector(-ball.getXVector()); // Change x direction
				}
				// if the ball hits the top or bottom wall
				if (y < radius || y + radius > height) {
					ball.setY((y < radius) ? radius : height - radius);
					ball.setYVector(-ball.getYVector()); // Change y direction
				}
				clear(pict);
				ball.drawBall(pict);
				pict.repaint();
			}
			pause(40);
		}
	}

	public static void handleKey(char ch) {
		if (ch == 'r' || ch == 'R') {
			// carObj.setGoRight(true);
		}
		if (ch == 'l' || ch == 'L') {
			// carObj.setGoRight(false);
		}
		if (ch == 'q' || ch == 'Q')
			System.exit(0);
	}

	public static void clear(Picture pict) {
		Graphics g = pict.getGraphics();

		g.setColor(Color.white);
		g.fillRect(0, 0, width + 1, height + 1);
	}

	public static void pause(long millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
		}
	}
}