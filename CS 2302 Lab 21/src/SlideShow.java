import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShow {
	public static void main(String[] args) {
		// creates the frame 
		JFrame frame = new JFrame("Java Slides");
		
		// creates the panel
		JPanel p = new JavaSlidesPanel();
		
		// adds the frame to the panel
		frame.add(p);
		
		// sets the size of the frame
		frame.setSize(800, 600);
		
		// sets the frame to exit when the user decides to close out the program
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// sets the frame to be visible
		frame.setVisible(true);
	}
}
