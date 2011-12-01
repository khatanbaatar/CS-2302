import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.awt.Graphics;

public class Pong {
	static JFrame pict = new JFrame("TiTle");
	
	static Ball ball; // Makes a ball to bounce around
	static int width = pict.getWidth() - 1, height = pict.getHeight() - 1;
	static boolean pauseSimulation = false;
	static Paddle paddle; // Makes a Paddle Object
	static int score = 0;
	


	public static void main(String[] args) {
		pict.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pict.setSize(300, 200);
		pict.setVisible(true);
		
		
		initialize();

		// Loop forever until the user closes the window or presses 'q'
		while (true) {
			if (!pauseSimulation) {

				ball.move(); // Move the ball

				// set temporary variables
				int x = ball.getX(), y = ball.getY(), radius = ball.getRadius();

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
				if (paddle.collision(ball)) {
					score++;
				}


				clear(pict);
				ball.drawBall(pict); // Draw the ball
				paddle.drawPaddle(pict); // draws the paddel within the picture
				write(pict, "Score: " + score, 0, 200);
				pict.repaint();
				pause(20); // Pause for 20 milliseconds
			}
		}
	}

	public static void initialize() {
		Random rand = new Random();
		int xpos, ypos, xval, yval;
		int rCol, gCol, bCol;
		int radius;

		radius = 10 + rand.nextInt(21); // 10 <= radius <= 30

		// x and y position are at random spots 5+radius places from each edge
		xpos = radius + 5 + rand.nextInt(width - 10 - radius - radius);
		ypos = radius + 5 + rand.nextInt(height - 10 - radius - radius);

		xval = 4 + rand.nextInt(5); // 4 <= x vector component <= 8
		yval = 4 + rand.nextInt(5); // 4 <= y vector component <= 8

		rCol = 50 + rand.nextInt(151); // 50 <= rcol <= 200
		gCol = 50 + rand.nextInt(151); // 50 <= gcol <= 200
		bCol = 50 + rand.nextInt(151); // 50 <= bcol <= 200
		ball = new Ball(xpos, ypos, xval, yval, 20, rCol, gCol, bCol);
		paddle = new Paddle(150, 100, 10, 50, 20, 0, 0, 0); // Creates the
															// characteristics
															// of the paddle
		// Allows the program to end when a user clicks the window close button
	/*	pict.getPictureFrame().frame
				.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// Processes p for 'pause' or q for 'quit' typed by the user
		pict.getPictureFrame().frame.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch = e.getKeyChar();
				if (ch == 'p' || ch == 'P')
					pauseSimulation = (pauseSimulation) ? false : true;
				if (ch == 'q' || ch == 'Q')
					System.exit(0);
				// Processes w for 'up' and s for 'down'
				if (ch == 'u' || ch == 'U')
					paddle.moveUp(pict);
				if (ch == 'd' || ch == 'D')
					paddle.moveDown(pict);
			}
		});*/
	}

		// CLear the picture
	public static void clear(JFrame pict) {
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
	public static void write(JFrame target, String text, int x, int y) {
		Graphics gObj = target.getGraphics();
		Font newFont = new Font("Arial", Font.BOLD, 24);
		gObj.setColor(Color.red);
		gObj.setFont(newFont);
		gObj.drawString(text, x, y);
	}

}