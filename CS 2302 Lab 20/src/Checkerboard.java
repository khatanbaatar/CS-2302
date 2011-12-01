import javax.swing.JButton;
import javax.swing.JFrame;


public class Checkerboard {
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame ("Checkerboard");
		JButton p = new CheckerboardButton();
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
