import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		image = new ImageIcon("Car.gif");
		x = 0;
		y = 40;
		moveX = 5;
		//moveY = 3;
		Timer timer = new Timer(DELAY, new TimerListener());
		timer.start();
	}

	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			x += moveX;
			//y += moveY;
			if ( x > WIDTH + image.getIconWidth())
				x = -50;
				y = 40;
				
			/*if (y < 0 || y > HEIGHT - image.getIconHeight())
				moveY = 40;*/
			repaint();
		}

	}

	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		image.paintIcon(this, arg0, x, y);
	}
}
