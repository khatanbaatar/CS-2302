import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class LinePanel extends JPanel {

	private final int DELAY = 24;
	private final int WIDTH = 400;
	private final int HEIGHT = 200;
	private int x0;
	private int y0;
	private int x1;
	private int y1;

	/**
	 * 
	 */
	public LinePanel() {
		x0 = 0;
		y0 = HEIGHT / 2;
		x1 = 100;
		y1 = HEIGHT / 2;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		Timer timer = new Timer(DELAY, new TimerListener());
		timer.start();
	}

	/**
	 * 
	 *
	 */
	private class TimerListener implements ActionListener {

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			x0++;
			x1++;
			if (x0 > WIDTH) {
				x0 = 0;
				y0 = HEIGHT / 2;
				x1 = 100;
				y1 = HEIGHT / 2;
			}
			repaint();
		}

	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawLine(WIDTH / 2, 0, WIDTH / 2, HEIGHT);
		if(x0 < WIDTH/2 && x1 < WIDTH/2){
			g.setColor(Color.blue);
			g.drawLine(x0, y0, x1, y1);
		}
		else if(x0 > WIDTH/2 && x1 > WIDTH/2){
			g.setColor(Color.yellow);
			g.drawLine(x0, y0, x1, y1);
		}
		else{
			g.setColor(Color.blue);
			g.drawLine(x0, y0, 200, y1);
			g.setColor(Color.ORANGE);
			g.drawLine(200, y0, x1, y1);
			
			
		}
		
	}

}
