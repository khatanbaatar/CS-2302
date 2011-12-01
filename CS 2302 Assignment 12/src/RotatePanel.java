import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class RotatePanel extends JPanel {
	private JLabel a = new JLabel ("Java is fun");
	
	/**
	 * Makes a Panel that changes what it says
	 */
	public RotatePanel(){
		add (a);
		a.setFont(new Font("Serif", Font.ITALIC, 78));
		addMouseListener(new PanelRotater());
	}
	
	public class PanelRotater implements MouseListener {
		

		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
		 * When clicked it changes the text of the label.
		 */
		@Override
		public void mouseClicked(MouseEvent arg0) {
			if(a.getText() == "Java is fun"){
				a.setText("Java is powerful RAWR");
				a.setFont(new Font("Serif", Font.BOLD, 32));
			}
			else{
				a.setText("Java is fun");
				a.setFont(new Font("Serif", Font.ITALIC, 78));
			}
			
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
					
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
