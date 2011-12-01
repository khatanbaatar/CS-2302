import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.awt.Graphics;

public class BreakOut {
	static Picture pict = new Picture(300, 600);
	static Ball ball; // Makes a ball to bounce around
	static int width = pict.getWidth() - 1, height = pict.getHeight() - 1;
	static boolean pauseSimulation = false;
	static int score = 0;
	static Paddle paddle; // Makes a Paddle Object
	static Paddle brick1;
	static Paddle brick2;
	static Paddle brick3;
	static Paddle brick4;
	static Paddle brick5;
	static Paddle brick6;
	static Paddle brick7;
	static Paddle brick8;
	static Paddle brick9;
	static Paddle brick10;
	static Paddle brick11;
	static Paddle brick12;
	static Paddle brick13;
	static Paddle brick14;
	static Paddle brick15;
	static Paddle brick16;
	static Paddle brick17;
	static Paddle brick18;
	static Paddle brick19;
	static Paddle brick20;
	static int lives = 3;

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
				if (y + radius > height) {
					lives--;
				}

				brickLoop();

				paddle.collision(ball);
				clear(pict);
				ball.drawBall(pict); // Draw the ball
				brickDraw();
				paddle.drawPaddle(pict); // draws the paddel within the picture

				if (lives < 0) {
					write(pict, "Final Score: " +  score*lives , 0, 300);
					//write(pict, "Final Score: " + score + "Times: " + lives , 0, 350);
					pauseSimulation = (pauseSimulation) ? false : true;
				}

				if (score == 20) {
					write(pict, "Awesome you win", 50, 300);
					write(pict, "Final Score: " +  score*lives , 0, 300);
					pauseSimulation = (pauseSimulation) ? false : true;
				}

				write(pict, "Score: " + score, 0, 500);
				write(pict, "LIVES: " + lives, 0, 200);
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
		//paddle = new Paddle(150, 580, 50, 10, 20, 0, 0, 0);
		bricks();

		// Creates the
		// characteristics
		// of the paddle
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
				// Processes w for 'up' and s for 'down'
				if (ch == 'a' || ch == 'A')
					paddle.moveLeft(pict);
				if (ch == 'd' || ch == 'D')
					paddle.moveRight(pict);
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

	public static void bricks() {
		paddle = new Paddle(150, 580, 50, 10, 20, 0, 0, 0);
		brick1 = new Paddle(0, 0, 50, 10, 20, 0, 0, 0);
		brick2 = new Paddle(0, 50, 50, 10, 20, 0, 0, 0);
		brick3 = new Paddle(0, 100, 50, 10, 20, 0, 0, 0);
		brick4 = new Paddle(0, 150, 50, 10, 20, 0, 0, 0);
		brick5 = new Paddle(0, 200, 50, 10, 20, 0, 0, 0);
		brick6 = new Paddle(0, 250, 50, 10, 20, 0, 0, 0);
		brick7 = new Paddle(0, 300, 50, 10, 20, 0, 0, 0);
		brick8 = new Paddle(0, 350, 50, 10, 20, 0, 0, 0);
		brick9 = new Paddle(0, 400, 50, 10, 20, 0, 0, 0);
		brick10 = new Paddle(0, 450, 50, 10, 20, 0, 0, 0);
		brick11 = new Paddle(250, 0, 50, 10, 20, 0, 0, 0);
		brick12 = new Paddle(250, 50, 50, 10, 20, 0, 0, 0);
		brick13 = new Paddle(250, 100, 50, 10, 20, 0, 0, 0);
		brick14 = new Paddle(250, 150, 50, 10, 20, 0, 0, 0);
		brick15 = new Paddle(250, 200, 50, 10, 20, 0, 0, 0);
		brick16 = new Paddle(250, 250, 50, 10, 20, 0, 0, 0);
		brick17 = new Paddle(250, 300, 50, 10, 20, 0, 0, 0);
		brick18 = new Paddle(250, 350, 50, 10, 20, 0, 0, 0);
		brick19 = new Paddle(250, 400, 50, 10, 20, 0, 0, 0);
		brick20 = new Paddle(250, 450, 50, 10, 20, 0, 0, 0);

	}

	public static void brickDraw() {
		brick1.drawPaddle(pict);
		brick2.drawPaddle(pict);
		brick3.drawPaddle(pict);
		brick4.drawPaddle(pict);
		brick5.drawPaddle(pict);
		brick6.drawPaddle(pict);
		brick7.drawPaddle(pict);
		brick8.drawPaddle(pict);
		brick9.drawPaddle(pict);
		brick10.drawPaddle(pict);
		brick11.drawPaddle(pict);
		brick12.drawPaddle(pict);
		brick13.drawPaddle(pict);
		brick14.drawPaddle(pict);
		brick15.drawPaddle(pict);
		brick16.drawPaddle(pict);
		brick17.drawPaddle(pict);
		brick18.drawPaddle(pict);
		brick19.drawPaddle(pict);
		brick20.drawPaddle(pict);
	}

	public static void brickLoop() {
		if (brick1.collision(ball)) {
			brick1 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}

		if (brick2.collision(ball)) {
			brick2 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick3.collision(ball)) {
			brick3 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick4.collision(ball)) {
			brick4 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick5.collision(ball)) {
			brick5 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick6.collision(ball)) {
			brick6 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick7.collision(ball)) {
			brick7 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick8.collision(ball)) {
			brick8 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick9.collision(ball)) {
			brick9 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick10.collision(ball)) {
			brick10 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}

		if (brick11.collision(ball)) {
			brick11 = new Paddle(300, 580, 50, 10, 20, 255, 255, 255);
			score++;
		}

		if (brick12.collision(ball)) {
			brick12 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick13.collision(ball)) {
			brick13 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick14.collision(ball)) {
			brick14 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick15.collision(ball)) {
			brick15 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick16.collision(ball)) {
			brick16 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick17.collision(ball)) {
			brick17 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick18.collision(ball)) {
			brick18 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick19.collision(ball)) {
			brick19 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
		if (brick20.collision(ball)) {
			brick20 = new Paddle(300, 600, 50, 10, 20, 255, 255, 255);
			score++;
		}
	}

}