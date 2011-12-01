import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class ShootingPanel extends JPanel {

	private final int height = 300;
	private final int width = 250;
	private final int newlocationdelay = 3000; // in terms in seconds
	private final int refreshdelay = 20;
	private final int ball_diameter = 30;
	private final int bullet_diameter = 4;
	private final int center = width / 2; // where bottom of gun goes
	Point line_start = new Point(center, height);
	Point line_end = new Point(center, height - 10);
	private final int gun_speed = 1;
	Random randomY = new Random(height); // Random Y
	// location
	Random randomX = new Random(width); // Random X
	// location
	int max_height = (int) (height - (height * 0.15));
	int max_width = width - ball_diameter;

	int rany = randomY.nextInt(max_height);
	int ranx = randomX.nextInt(max_width);
	int[] gun_xpoints = { center - 2, center - 2, center + 2, center + 2 };
	// 0 = top left, 1 = bottom left, 2 = bottom right, 3 = top right
	int[] gun_ypoints = { height - 20, height, height, height - 20 };
	int bulletx, bullety;
	boolean bullet_on = false;
	boolean bullet_on_screen = false;
	boolean collide = false;
	int prevranx, prevrany, score;

	// bottom right

	public ShootingPanel() {

		setPreferredSize(new Dimension(width, height));
		Timer ball = new Timer(newlocationdelay, new DrawBallListener());
		Timer bullet = new Timer(refreshdelay, new BulletListener());
		ball.start();
		bullet.start();
		if (bullet_on) {
			bullet.start();
		}

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT && gun_xpoints[0] > 108) {
					gun_xpoints[3] -= gun_speed; // top right
					gun_xpoints[0] -= gun_speed; // top left
					/*
					 * System.out.println("Top left - " + gun_xpoints[0] + "," +
					 * gun_ypoints[0] + " Top right - " + gun_xpoints[3] + "," +
					 * gun_ypoints[3] + " Bottom left - " + gun_xpoints[1] + ","
					 * + gun_ypoints[1] + "  Bottom right - " + gun_xpoints[2] +
					 * "," + gun_ypoints[2]);
					 */
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT && gun_xpoints[0] <= 142) {
					gun_xpoints[3] += gun_speed;
					gun_xpoints[0] += gun_speed;
				}
				if (!bullet_on_screen) {
					if (e.getKeyCode() == KeyEvent.VK_UP) {
						bullet_on = true;
						bulletx = ((gun_xpoints[0] + gun_xpoints[3]) / 2) - (bullet_diameter / 2);
						bullety = (gun_ypoints[0]) - bullet_diameter - 1;
						// System.out.println("x - " + bulletx + "  y - " +
						// bullety);
						bullet_on_screen = true;
						// System.out.println("X trajectory: " + (gun_xpoints[0]
						// - gun_xpoints[1]));
						// System.out.println("Y trajectory: " + (gun_ypoints[0]
						// - gun_ypoints[1]) / 20);
						// System.out.println("Center of ball - " + ranx + "," +
						// rany);
					}
				}
				repaint();
			}
		});
	}

	public class DrawBallListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			ranx = randomX.nextInt(max_width);
			rany = randomY.nextInt(max_height);
			collide = false;

			// System.out.println("x - " + ranx + ". y - " + rany);
		}
	}

	public class BulletListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (bullet_on) {
				bullety += (gun_ypoints[0] - gun_ypoints[1]);
				bulletx += (gun_xpoints[0] - gun_xpoints[1]);
			}

			if (bulletx < 0 || bullety < 0 || bulletx > width) {
				bullet_on_screen = false;
				bullet_on = false;
			}
			int centerballx = ranx + (ball_diameter / 2);
			int centerbally = rany + (ball_diameter / 2);
			int centerbulletx = bulletx + (bullet_diameter / 2);
			int centerbullety = bullety + (bullet_diameter / 2);
			double ballbulletdistance = Math.sqrt(Math.pow(centerballx - centerbulletx, 2)
					+ Math.pow(centerbally - centerbullety, 2));
			if (ballbulletdistance <= ball_diameter || ballbulletdistance <= bullet_diameter) {
				collide = true;
				prevranx = ranx;
				prevrany = rany;
				score++;
			}
			// System.out.println(ballbulletdistance);
			repaint();
		}

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(ranx, rany, ball_diameter, ball_diameter);
		g.drawPolygon(gun_xpoints, gun_ypoints, 4);
		g.fillPolygon(gun_xpoints, gun_ypoints, 4);
		if (bullet_on) {
			g.drawOval(bulletx, bullety, bullet_diameter, bullet_diameter);
		}
		if (collide) {
			ranx = -100;
			rany = -100;
			// System.out.println(prevranx);

			int explodediameter = 3;
			g.drawOval(prevranx + 10, prevrany - 10, explodediameter + 1, explodediameter + 1);
			g.drawOval(prevranx - 7, prevrany - 6, explodediameter + 2, explodediameter + 2);
			g.drawOval(prevranx + 13, prevrany + 8, explodediameter + 3, explodediameter + 3);
			g.drawOval(prevranx - 6, prevrany - 19, explodediameter + 2, explodediameter + 2);
			g.drawOval(prevranx + 1, prevrany + 10, explodediameter + 2, explodediameter + 2);
			g.drawOval(prevranx - 3, prevrany - 5, explodediameter + 1, explodediameter + 1);
			g.drawOval(prevranx + 5, prevrany + 3, explodediameter, explodediameter);
			g.drawOval(prevranx - 9, prevrany - 4, explodediameter + 4, explodediameter + 4);

			g.fillOval(prevranx + 10, prevrany - 10, explodediameter + 1, explodediameter + 1);
			g.fillOval(prevranx - 7, prevrany - 6, explodediameter + 2, explodediameter + 2);
			g.fillOval(prevranx + 13, prevrany + 8, explodediameter + 3, explodediameter + 3);
			g.fillOval(prevranx - 6, prevrany - 19, explodediameter + 2, explodediameter + 2);
			g.fillOval(prevranx + 1, prevrany + 10, explodediameter + 2, explodediameter + 2);
			g.fillOval(prevranx - 3, prevrany - 5, explodediameter + 1, explodediameter + 1);
			g.fillOval(prevranx + 5, prevrany + 3, explodediameter, explodediameter);
			g.fillOval(prevranx - 9, prevrany - 4, explodediameter + 4, explodediameter + 4);
			g.fillOval(prevranx - 10, prevrany + 7, explodediameter + 4, explodediameter + 4);

		}
		g.drawString("Score: " + score, 30, height - 50);
	}

}