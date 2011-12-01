import javax.swing.JFrame;
import javax.swing.JPanel;


public class Question7 {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Card Game");
		JPanel p = new Question7Panel();
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.pack();
		frame.setVisible(true);
		
	}

}
