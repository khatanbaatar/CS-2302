import javax.swing.JFrame;
import javax.swing.JPanel;


public class Question5 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Slides");
		JPanel p = new Question5Panel();
		frame.add(p);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
