import java.awt.GridLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CardPanel extends JPanel {
	private Random r;
	
	/**
	 * Makes a Panel with a gridLayout of 1x4
	 */
	public CardPanel(){
		r = new Random();
		setLayout (new GridLayout (1,4));
		for (int i = 0; i < 4; i++)
			add (new JLabel (getRandomCardImage()));
		
	}
	/**
	 * @return returns a random card to add from the CardDeck Folder
	 */
	private ImageIcon getRandomCardImage() {
		ImageIcon icon;
		int num = r.nextInt(54) + 1;
		String[] cards = new String[55];
		for (int i = 1; i < 55; i++) {
			cards[i] = ("CardDeck/"+ i + ".png");
		}
		icon = new ImageIcon (cards[num]);
		return icon;
	}
}
