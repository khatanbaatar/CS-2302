import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameDisplayingFourCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Card Game");
		JPanel p = new CardPanel();
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
	}

}
