import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Question4Panel extends JPanel {

	private int x;

	private int y;

	private int moveX;

	// private int moveY;

	private final int DELAY = 100;

	private ImageIcon image;
	private final int WIDTH = 300;

	private final int HEIGHT = 100;
	private Timer timer;
	

	public Question4Panel() {
		image = new ImageIcon("usa.jpg");
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.white);
		x = 0;
		y = HEIGHT;
		moveX = 5;
		// moveY = 3;
		timer = new Timer(DELAY, new TimerListener());
		timer.start();
	}

	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			y -= 5 ;
			repaint();
			if(y == 0){
				timer.stop();
			}
			
		}

	}
	
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		image.paintIcon(this, arg0, x, y);
	}

}
