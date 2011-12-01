import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.awt.Graphics;

public class BreakOut {
	static Picture pict = new Picture(300, 600);
	static Picture bkGround = new Picture("space.jpg");
	static Ball ball; // Makes a ball to bounce around
	static int width = pict.getWidth() - 1, height = pict.getHeight() - 1;
	static boolean pauseSimulation = false;
	static int score = 0;
	static Paddle paddle; // Makes a Paddle Object
	static Picture[] b = new Picture[31]; // Makes Picture Array

	/*
	 * Variables O Make Brick Picture move around IN TESTING static Brick
	 * carObj; static double x, y, radius; static final int distance = 10;
	 * static final int pauseTime = 20;
	 */

	static Graphics gObj1;

	static Paddle[] brick = new Paddle[30]; // Makes a paddle Array

	static int lives = 3; // Initial amount of lives

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

				// MoveBrick(); // Makes a brick move from one side to another

				ball.drawBall(pict); // Draw the ball
				brickDraw();

				paddle.drawPaddle(pict); // draws the paddel within the picture

				if (lives < 0) {
					write(pict, "Final Score: " + score * 5, 0, 350);
					pauseSimulation = (pauseSimulation) ? false : true;
				}

				if (score == 30) {
					write(pict, "Awesome you win", 75, 300);
					write(pict, "Final Score: " + score * 5, 0, 350);
					pauseSimulation = (pauseSimulation) ? false : true;
				}

				write(pict, "Score: " + score, 0, 520);
				write(pict, "LIVES: " + lives, 0, 500);
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

		// Method Makes all the paddle, brick, and Brick Picture Objects
		bricks();

		// Creates the
		// characteristics
		// of the paddle
		// Allows the program to end when a user clicks the window close button
		pict.getPictureFrame().frame
				.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Processes MouseClick to control Paddle
		pict.getPictureFrame().frame
				.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						paddle.setX(e.getX() - (paddle.width / 2));
					}
				});

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

		g.drawImage(bkGround.getImage(), 0, 0, null);

	}

	public static void pause(long millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
		}
	}

	public static void write(Picture target, String text, int x, int y) {
		Graphics gObj = target.getGraphics();
		Font newFont = new Font("Arial", Font.BOLD, 16);
		gObj.setColor(Color.white);
		gObj.setFont(newFont);
		gObj.drawString(text, x, y);
	}

	public static void copy(Picture source, Picture target, int x, int y) {
		Graphics gObj = target.getGraphics();

		gObj.drawImage(source.getImage(), x, y, null);
	}

	// Makes all the paddle, brick, and Brick Picture Objects
	public static void bricks() {
		paddle = new Paddle(150, 580, 50, 10, 20, 255, 255, 255);

		for (int i = 0; i < b.length; i++) {
			b[i] = new Picture("bricks.jpg");
		}

		gObj1 = pict.getGraphics();

		int topya = 0;
		int topyb = 0;
		int topyc = 0;

		// Makes all the Brick Objects
		for (int i = 0; i < brick.length; i++) {
			if (i < 10) {
				brick[i] = new Paddle(0, topya, 50, 10, 20, 0, 0, 0);
				topya += 50;
			} else if (i < 20) {
				brick[i] = new Paddle(250, topyb, 50, 10, 20, 0, 0, 0);
				topyb += 50;
			} else {
				brick[i] = new Paddle(150, topyc, 50, 10, 20, 0, 0, 0);
				topyc += 50;
			}

		}
		/*
		 * carObj = new Brick(100, 350, true); // Makes brick move in testing
		 * brick[20] = new Paddle(100, 350, 50, 10, 20, 0, 0, 0);
		 */

	}

	// Draws the Paddle objects and Bricks pictures on in the picture.
	public static void brickDraw() {

		int goA = 0;
		int goB = 0;
		int goC = 0;
		for (int i = 0; i < 30; i++) {
			if (i < 10) {
				brick[i].drawPaddle(pict);
				gObj1.drawImage(b[i].getImage(), 0, goA, null);

				goA += 50;
			} else if (i < 20) {

				brick[i].drawPaddle(pict);
				gObj1.drawImage(b[i].getImage(), 250, goB, null);
				goB += 50;
			} else {
				brick[i].drawPaddle(pict);
				gObj1.drawImage(b[i].getImage(), 150, goC, null);
				goC += 50;
			}

		}

	}

	// Draws the Paddle and Brick picture somewhere off screen if
	// the ball hits any of the pre-made Paddles
	public static void brickLoop() {

		for (int i = 0; i < 30; i++) {
			if (brick[i].collision(ball)) {
				b[i] = new Picture(1, 1);
				brick[i] = new Paddle(300, 600, 50, 10, 20, 255, 255, 250);
				score++;
			}
		}
	}
	/*
	 * IN TESTING public static void MoveBrick() { // while (true) // { if
	 * (carObj.getGoRight()) { x = carObj.getX(); y = carObj.getY(); x +=
	 * distance; if (x + carObj.getWidth() > pict.getWidth()) { x =
	 * pict.getWidth() - carObj.getWidth(); carObj.setGoRight(false); }
	 * carObj.setLocation(x, y); carObj.drawCar(pict); pict.repaint(); } else {
	 * x = carObj.getX(); y = carObj.getY(); x -= distance; if (x < 0) { x = 0;
	 * carObj.setGoRight(true); } carObj.setLocation(x, y);
	 * carObj.drawCar(pict); pict.repaint(); } // pause(pauseTime); // }
	 * 
	 * }
	 */

}