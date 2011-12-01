import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class BallonPanel extends JPanel {

	private int x;
	private int y;
	private int moveX;
	private int moveY;
	private int ballX, ballY;
	private final int ballD = 5;
	private Random startCord;
	private final int diameter = 20;
	private final int DELAY = 24;
	private final int WIDTH = 400;
	private final int HEIGHT = 200;
	private int rectX = 200, rectY = 175;

	public BallonPanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		addKeyListener(new KeyListen());
		startCord = new Random();
		x = startCord.nextInt(WIDTH - diameter);
		y = startCord.nextInt(HEIGHT - diameter);
		moveX = 2;
		moveY = 2;
		

		Timer timer = new Timer(DELAY, new TimerListener());
		timer.start();
	}

	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			x += moveX;
			y += moveY;
			if (x < 0 || x > WIDTH - diameter)
				moveX = moveX * -1;
			if (y < 0 || y > HEIGHT - diameter)
				moveY = moveY * -1;
			if (ballY == 0) {

			} else {
				ballY-= 10;
			}
			repaint();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(x, y, diameter, diameter);
		g.drawOval(ballX, ballY, ballD, ballD);
		g.drawRect(rectX, rectY, 5, 25);
		g.fillRect(rectX, rectY, 5, 25);
		g.drawRect(0, 0, 400, 200);

	}

	private class KeyListen implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int keyCode = e.getKeyCode();
			// left key
			if (keyCode == 37) {
				// System.exit(0);
				rectX -= 10;
			}
			// right key
			if (keyCode == 39) {
				// System.exit(0);
				rectX += 10;
			}
			// up key
			if (keyCode == 38) {
				// System.exit(0);
				ballX = rectX;
				ballY = rectY;
			}

		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent e) {

		}

	}
}
