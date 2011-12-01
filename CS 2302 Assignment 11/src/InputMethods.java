import javax.swing.JOptionPane;

public class InputMethods {

	public static int getIntegerUnboundedAttempts(String prompt1, String prompt2) {
		boolean done = true;
		int num = 0;
		try {
			String intString = JOptionPane.showInputDialog(null, prompt1, null,
					JOptionPane.INFORMATION_MESSAGE);
			if (intString == null) {
				JOptionPane.showMessageDialog(null,
						"You choose CANCEL, the program will now be closing");
				System.exit(0);
			}
			num = Integer.parseInt(intString);
			done = true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Invalid Number Please try again", "Number Format Error",
					JOptionPane.ERROR_MESSAGE);
			done = false;
		}
		while (!done) {
			done = true;
			try {
				String intString = JOptionPane.showInputDialog(null, prompt2,
						null, JOptionPane.INFORMATION_MESSAGE);
				if (intString == null) {
					JOptionPane
							.showMessageDialog(null,
									"You choose CANCEL, the program will now be closing");
					System.exit(0);
				}
				num = Integer.parseInt(intString);
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Invalid Number Please try again",
						"Number Format Error", JOptionPane.ERROR_MESSAGE);
				done = false;
			}
		}
		return num;
	}

	public static UserInput getIntegerBoundedAttempts(String prompt1,
			String prompt2, int maxAttempts) {
		int numAttempts = 0;
		int num = 0;
		boolean done = true;
		try {
			String intString = JOptionPane.showInputDialog(null, prompt1, null,
					JOptionPane.INFORMATION_MESSAGE);
			if (intString == null) {
				JOptionPane.showMessageDialog(null,
						"You choose CANCEL, the program will now be closing");
				System.exit(0);
			}
			num = Integer.parseInt(intString);
			done = true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Invalid Number Please try again", "Number Format Error",
					JOptionPane.ERROR_MESSAGE);
			done = false;
			numAttempts++;
		}
		while (!done && numAttempts < maxAttempts) {
			done = true;
			try {
				String intString = JOptionPane.showInputDialog(null, prompt2,
						null, JOptionPane.INFORMATION_MESSAGE);
				if (intString == null) {
					JOptionPane
							.showMessageDialog(null,
									"You choose CANCEL, the program will now be closing");
					System.exit(0);
				}
				num = Integer.parseInt(intString);
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Invalid Number Please try again",
						"Number Format Error", JOptionPane.ERROR_MESSAGE);
				done = false;
				numAttempts++;
			}
		}
		UserInput input;
		if (done)
			input = new UserInput(true, num);
		else
			input = new UserInput(false, 0);
		return input;
	}

}
