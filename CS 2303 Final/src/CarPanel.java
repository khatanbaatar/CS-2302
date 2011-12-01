import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class CarPanel extends JPanel {

	

	private int x;

	private int y;

	private int moveX;

	//private int moveY;

	private final int DELAY = 100;

	private ImageIcon image;

	private final int WIDTH = 300;

	private final int HEIGHT = 100;

	public CarPanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.white);
		addMouseListener(new Mouser());
		image = new ImageIcon("car.png");
		x = 0;
		y = 40;
		moveX = 5;
		Timer timer = new Timer(DELAY, new TimerListener());
		timer.start();
	}

	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			x += moveX;
			if ( x > WIDTH + image.getIconWidth())
				x = -50;
			repaint();
		}

	}
	private class Mouser implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}
	}

	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		image.paintIcon(this, arg0, x, y);
	}
}
