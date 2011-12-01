import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Question5Panel extends JPanel {

	/**
	 * creates a JLabel called slide0
	 */
	private JLabel slide0 = new JLabel();
	/**
	 * creates an array of image icons
	 */
	private ImageIcon[] Ia = new ImageIcon[25];

	/**
	 * the point at which the first slide appears in the array
	 */
	private int begin;
	private final int DELAY = 1000;

	public Question5Panel() {

		for (int i = 0; i < 25; i++) {

			ImageIcon slide = new ImageIcon("sides/slide" + i + ".jpg");
			Ia[i] = slide;
		}

		slide0.setIcon(Ia[0]);

		// adds slide0
		add(slide0);

		// adds the MouseListener
		Timer timer = new Timer(DELAY, new TimerListener());
		timer.start();
	}

	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// begins at the first slide and increments by one
			begin++;

			// the begin will only go as far as 25 in the array and then repeats
			begin %= 25;

			// resets the slide0 as being the first slide in the array
			slide0.setIcon(Ia[begin]);

			// re-adds slide0
			add(slide0);
		}

	}

}
