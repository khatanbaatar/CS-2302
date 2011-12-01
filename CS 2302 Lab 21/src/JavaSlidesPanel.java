import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel; 

public class JavaSlidesPanel extends JPanel {
	
	/**
	 * creates a JLabel called slide0
	 */
	private JLabel slide0 = new JLabel();
	
	/**
	 * creates an array of image icons
	 */
	private ImageIcon[] Ia = new ImageIcon[25];
	
	/**
	 * the point at which the first slide appears in the array 
	 */
	private int begin;
	
	public JavaSlidesPanel(){
		
		// loops through the array of image icons and the counter goes up by one, 
		// replacing each slide with the next slide in the array
		for(int i = 0; i < 25; i++){
			
			ImageIcon slide = new ImageIcon("slide"+i + ".jpg");
			Ia[i] = slide;
		}
		
		slide0.setIcon(Ia[0]);
		
		// adds slide0
		add(slide0);
		
		// adds the MouseListener
		addMouseListener(new JavaSlides());
	}
	
	private class JavaSlides implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			// begins at the first slide and increments by one
			begin++;
			
			// the begin will only go as far as 25 in the array and then repeats
			begin %= 25;
			
			// resets the slide0 as being the first slide in the array
			slide0.setIcon(Ia[begin]);
			
			// re-adds slide0
			add(slide0);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}
}