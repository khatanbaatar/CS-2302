import javax.swing.JFrame;
import javax.swing.JPanel;

public class HittingBallons {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Game: Hitting Ballons");
		JPanel p = new BallonPanel();
		frame.add(p);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 250);
		frame.setVisible(true);
	}
}
