import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class CounterPanel extends JPanel {

	private int userTime;
	private final int DELAY = 1000;
	private JTextField inputField;
	private Timer timer;
	private JLabel outputLabel;

	public CounterPanel() {
		JPanel inputPanel = new JPanel();
		JLabel inputLabel = new JLabel("Enter a Positive Number");
		inputField = new JTextField(5);
		inputPanel.add(inputLabel);
		inputPanel.add(inputField);
		add(inputPanel);
		JButton button = new JButton("Start Count Down");
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(button);
		add(buttonPanel);
		JPanel outputPanel = new JPanel();
		outputLabel = new JLabel("?");
		outputPanel.add(outputLabel);
		add(outputPanel);
		button.addActionListener(new ButtontListener());
		timer = new Timer(DELAY, new TimerListener());

	}

	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			outputLabel.setText(userTime + "");
			userTime -= 1;
			if (userTime < 0) {
				outputLabel.setText("BOOOOOM");
				outputLabel.setForeground(Color.RED);
				outputLabel.setFont(new Font("Serif", Font.BOLD, 70));
				timer.stop();
			}
		}

	}

	private class ButtontListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String input = null;
			try {
				input = inputField.getText();
				userTime = Integer.parseInt(input);
				if (userTime < 1) {

					throw new NumberFormatException();
				}
				timer.start();

			} catch (NumberFormatException a) {
				String message = input + " is not a valid positive integer";
				JOptionPane.showMessageDialog(null, message);
				inputField.setText("");
			}
		}

	}

}
