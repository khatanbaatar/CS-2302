import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.awt.Graphics;

public class Pong2Player {
	static Picture pict = new Picture(300, 200);
	static Ball ball;
	static int width = pict.getWidth() - 1, height = pict.getHeight() - 1;
	static boolean pauseSimulation = false;
	static Paddle paddle;
	static Paddle paddle2;
	static int score = 0;
	static int score2 = 0;

	public static void main(String[] args) {
		pict.show();
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
				// If ball hits left wall then P2 gets a point
				if (x < radius) {
					score2++;
				}
				// If ball hits right wall then P1 gets a point
				if (x + radius > width) {
					score++;
				}


				paddle.collision(ball);
				paddle2.collision(ball);
				clear(pict);
				ball.drawBall(pict); // Draw the ball
				paddle.drawPaddle(pict);
				paddle2.drawPaddle(pict);
				if (score >= 5) {
					write(pict, "Player 1 Wins!! ", 75, 100);
					pauseSimulation = (pauseSimulation) ? false : true;

				}
				if (score2 >= 5) {
					write(pict, "Player 2 Wins!!", 75, 100);
					pauseSimulation = (pauseSimulation) ? false : true;

				}
				write(pict, "P1: " + score, 0, 200);
				write(pict, "P2: " + score2, 225, 200);
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

		xval = 4 + rand.nextInt(3); // 4 <= x vector component <= 8
		yval = 4 + rand.nextInt(3); // 4 <= y vector component <= 8

		rCol = 50 + rand.nextInt(151); // 50 <= rcol <= 200
		gCol = 50 + rand.nextInt(151); // 50 <= gcol <= 200
		bCol = 50 + rand.nextInt(151); // 50 <= bcol <= 200

		ball = new Ball(xpos, ypos, xval, yval, 20, rCol, gCol, bCol);
		paddle2 = new Paddle(275, 100, 10, 50, 20, 0, 0, 0);
		paddle = new Paddle(25, 100, 10, 50, 20, 0, 0, 0);
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

				if (ch == 'w' || ch == 'W')
					paddle.moveUp(pict);
				if (ch == 's' || ch == 'S')
					paddle.moveDown(pict);
				if (ch == 'o' || ch == 'O')
					paddle2.moveUp(pict);
				if (ch == 'l' || ch == 'L')
					paddle2.moveDown(pict);
			}
		});
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

	public static void write(Picture target, String text, int x, int y) {
		Graphics gObj = target.getGraphics();
		Font newFont = new Font("Arial", Font.BOLD, 24);
		gObj.setColor(Color.red);
		gObj.setFont(newFont);
		gObj.drawString(text, x, y);
	}

}