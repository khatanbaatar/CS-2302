import javax.swing.JFrame;

public class Shooting {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		ShootingPanel p = new ShootingPanel();
		p.setFocusable(true);
		f.add(p);
		f.pack();
		f.setTitle("Shooting Game!");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}