import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.net.URL;
import java.util.Random;

import javax.swing.JPanel;

public class FlashCardPanel extends JPanel
{

	


	private JButton playButton;
	private JLabel questionLabel;
	private JTextField answer;
	private int correctAnswer;
	private AudioClip clip1, clip2;
	private JPanel feedbackPanel;
	private JLabel feedbackLabel;
	private final int DELAY = 1000;
	

	public FlashCardPanel()
	{
		setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
		playButton = new JButton ("play");
		JPanel playPanel = new JPanel();
		playPanel.add(playButton);
		add (playPanel);
		questionLabel = new JLabel("       ");
		answer = new JTextField (4);
		JPanel questionPanel = new JPanel();
		questionPanel.add (questionLabel);
		questionPanel.add (answer);
		add(questionPanel);
		playButton.addActionListener(new ButtonListener());
		answer.addActionListener(new TextListener());
		setPreferredSize (new Dimension(200, 100));
		Timer timer = new Timer(DELAY, new TimerListener());
		timer.start();
	
		try
		{
			URL u1 = new URL("file", "localhost", "go-bulldogs.wav");
			clip1 = JApplet.newAudioClip(u1);
			URL u2 = new URL ("file", "localhost", "nthng.wav");
			clip2 = JApplet.newAudioClip(u2);
		}
		catch (java.net.MalformedURLException e)
		{
		}
		feedbackPanel = new JPanel();
		feedbackLabel = new JLabel();
		feedbackPanel.add(feedbackLabel);
		add (feedbackPanel);
	}

	private class ButtonListener implements ActionListener
	{

		private Random r = new Random();
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			clip1.stop();
			clip2.stop();
			int first = r.nextInt(10);
			int second = r.nextInt(10);
			correctAnswer = first + second;
			questionLabel.setText(first + " + " + second + " = ");
		}

	}


	private class TextListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			boolean correct = true;;
			try
			{
				String s = answer.getText();
				int response = Integer.parseInt(s);
				correct = response == correctAnswer;
			}
			catch (NumberFormatException ex)
			{
				correct = false;
			}
			if (correct)
			{
				clip1.play();
				feedbackLabel.setText("dawg scholar");
			}
			else
			{
				clip2.play();
				feedbackLabel.setText("not up to even dawg standards");
				
			}
		}

	}
	private class TimerListener implements ActionListener {
		private boolean flag = true;
		@Override
		public void actionPerformed(ActionEvent e) {
			if (flag){
			feedbackLabel.setForeground(Color.black);
			}
			else{
			feedbackLabel.setForeground(Color.red);
			}
			flag = !flag;
		}

	}

}
