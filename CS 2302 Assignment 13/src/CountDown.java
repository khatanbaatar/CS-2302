import javax.swing.JFrame;
import javax.swing.JPanel;


public class CountDown {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Count Down");
		JPanel p = new CounterPanel();
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
}
