import javax.swing.JFrame;
import javax.swing.JPanel;


public class AlternatingTwoMessages {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Message Rotate");
		JPanel p = new RotatePanel();
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
}
