import javax.swing.JFrame;
import javax.swing.JPanel;

public class Question6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Flashing Label");
		JPanel p = new Question6Panel();
		frame.add(p);
		frame.setSize(250, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
