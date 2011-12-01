import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Question6Panel extends JPanel {
	private int count;
	private JLabel label;

	private String message = "I love CS 2302 TEST! WOOT " + count;

	private final int DELAY = 100;
	private Timer timer;

	public Question6Panel() {
		count = 0;
		label = new JLabel(message);
		add(label);
		addMouseListener(new Mouser());
		timer = new Timer(DELAY, new TimerListener());
		timer.start();
	}

	private class TimerListener implements ActionListener {

		private boolean flag = true;

		@Override
		public void actionPerformed(ActionEvent arg0) {
			label.setText("" + count++);
			if(count == 5){
				count = 0;
			}
			/*if (flag)
				label.setText("");
			else
				label.setText(message);
			flag = !flag;*/
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
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			timer.stop();

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			timer.start();

		}

	}

}
