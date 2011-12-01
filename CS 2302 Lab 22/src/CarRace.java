import javax.swing.JFrame;
import javax.swing.JPanel;


public class CarRace {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame ("Car Race");
		JPanel p = new CarPanel ();
		frame.add (p);
		frame.setSize (350, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible (true);
	}
}
