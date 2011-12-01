import javax.swing.JFrame;
import javax.swing.JPanel;


public class Question4 {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame ("Problem 4");
		JPanel p = new Question4Panel ();
		frame.add (p);
		frame.setSize (350, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible (true);
	}
}
