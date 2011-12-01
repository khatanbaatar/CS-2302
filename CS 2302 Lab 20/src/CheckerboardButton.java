import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;


public class CheckerboardButton extends JButton{

	public CheckerboardButton()
	{
		setLayout (new GridLayout (8,8));
		addWhiteStartLayer();
		addBlackStartLayer();
		addWhiteStartLayer();
		addBlackStartLayer();
		addWhiteStartLayer();
		addBlackStartLayer();
		addWhiteStartLayer();
		addBlackStartLayer();
		
	
	}
	/**
	 * Makes the horizontal layer of the checkerboard that starts with the color white
	 */
	public void addWhiteStartLayer(){
		add (new JButton()).setBackground(Color.white);
		add (new JButton()).setBackground(Color.black);
		add (new JButton()).setBackground(Color.white);
		add (new JButton()).setBackground(Color.black);
		add (new JButton()).setBackground(Color.white);
		add (new JButton()).setBackground(Color.black);
		add (new JButton()).setBackground(Color.white);
		add (new JButton()).setBackground(Color.black);
	}
	/**
	 * Makes the horizontal layer of the checkerboard that starts with the color black
	 */
	public void addBlackStartLayer(){
		add (new JButton()).setBackground(Color.black);
		add (new JButton()).setBackground(Color.white);
		add (new JButton()).setBackground(Color.black);
		add (new JButton()).setBackground(Color.white);
		add (new JButton()).setBackground(Color.black);
		add (new JButton()).setBackground(Color.white);
		add (new JButton()).setBackground(Color.black);
		add (new JButton()).setBackground(Color.white);
	}
	
}
