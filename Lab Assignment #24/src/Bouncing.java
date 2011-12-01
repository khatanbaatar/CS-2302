import java.awt.*;
/**
 * Course: 2301
 * Section: 01
 * Professor: Dr. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 24
 */
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;

public class Bouncing {
	static Picture pict = new Picture(300, 300);
	static int width = pict.getWidth() - 1, height = pict.getHeight() - 1;
	static boolean pauseSimulation = false;
	static Ball ball;
	static BouncingList bList = new BouncingList();
	static Random r = new Random();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		pict.show();
		initialize();

		// Loop forever until the user closes the window or presses 'q'
		while (true) {
			if (!pauseSimulation) {

				bList.move(width, height); // Move the ball

				clear(pict);
				bList.drawBalls(pict); // Draw the ball

				pict.repaint();
				pause(20); // Pause for 20 milliseconds
			}
		}
	}

	public static void initialize() {

		// Allows the program to end when a user clicks the window close button
		pict.getPictureFrame().frame
				.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Processes p for 'pause' or q for 'quit' typed by the user
		pict.getPictureFrame().frame.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch = e.getKeyChar();
				if (ch == 'p' || ch == 'P')
					pauseSimulation = (pauseSimulation) ? false : true;
				if (ch == 'q' || ch == 'Q')
					System.exit(0);
				// Processes N to make a new ball
				if (ch == 'n' || ch == 'N') {
					int radius = 10 + r.nextInt(11); // 10 <= radius <= 20
					int ranx = radius + 5
							+ r.nextInt(width - 10 - radius - radius); // random
																		// location
					int rany = radius + 5
							+ r.nextInt(height - 10 - radius - radius); // random
																		// location
					int xval = 1 + r.nextInt(4);
					int yval = 1 + r.nextInt(4);
					int rCol = r.nextInt(150); // 50 <= rcol <= 200
					int gCol = r.nextInt(150); // 50 <= gcol <= 200
					int bCol = r.nextInt(150); // 50 <= bcol <= 200
					Ball b = new Ball(ranx, rany, xval, yval, radius, rCol,
							gCol, bCol);
					bList.addBall(b);
				}

			}
		});
	}

	// CLear the picture
	public static void clear(Picture pict) {
		Graphics g = pict.getGraphics();

		g.setColor(Color.white);
		g.fillRect(0, 0, width + 1, height + 1);
	}

	// Allows you to pause the program
	public static void pause(long millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
		}
	}

	// Allows you to write on a picture
	public static void write(Picture target, String text, int x, int y) {
		Graphics gObj = target.getGraphics();
		Font newFont = new Font("Arial", Font.BOLD, 24);
		gObj.setColor(Color.red);
		gObj.setFont(newFont);
		gObj.drawString(text, x, y);
	}

}
