import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Question7Panel extends JPanel {

	private Random r;
	private JPanel cardPanel;

	/**
	 * Makes a Panel with a gridLayout of 1x4
	 */
	public Question7Panel() {
		
		cardPanel = new JPanel();
		r = new Random();
		JPanel buttonPanel = new JPanel();
		JButton button = new JButton("Deal");
		add(cardPanel);
		cardPanel.setLayout(new GridLayout(1, 4));	
		buttonPanel.add(button);
		add(buttonPanel);
		for (int i = 0; i < 4; i++) {
			cardPanel.add(new JLabel(getRandomCardImage()));
		}
		
		button.addActionListener(new ButtontListener());
		

	}

	/**
	 * @return returns a random card to add from the CardDeck Folder
	 */
	private ImageIcon getRandomCardImage() {
		ImageIcon icon;
		int num = r.nextInt(54) + 1;
		String[] cards = new String[55];
		for (int i = 1; i < 55; i++) {
			cards[i] = ("CardDeck/" + i + ".png");
		}
		icon = new ImageIcon(cards[num]);
		return icon;
	}

	private class ButtontListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// for some reason it only shows the cards again if i resize the window
			cardPanel.removeAll();
			cardPanel.repaint();
			cardPanel.setBackground(Color.red);
			for (int i = 0; i < 4; i++) {
				cardPanel.add(new JLabel(getRandomCardImage()));
			}
			cardPanel.repaint();

		}
	}

	@Override
	protected void paintComponent(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paintComponent(arg0);
	}
}
