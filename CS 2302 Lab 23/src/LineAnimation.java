import javax.swing.JFrame;
import javax.swing.JPanel;


public class LineAnimation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Line Animation");
		JPanel p = new LinePanel();
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
	}

}
