import javax.swing.JOptionPane;


public class Question3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int answer = 0;
		do {

			int base = getIntegerBase();
			int exponent = getIntegerExponent();
			JOptionPane.showMessageDialog(null, " The answer is " + Math.pow(base, exponent));
			answer = JOptionPane.showConfirmDialog(null,
					"Do you want to try a different numbers?", "Choose one",
					JOptionPane.YES_NO_OPTION);

		} while (answer == JOptionPane.YES_OPTION);
		
	}
	
	private static int getIntegerBase() {
		int num = 0;
		boolean done = false;
		do {
			try {
				String intString = JOptionPane.showInputDialog(null,
						"Enter a Base Number integer:", null,
						JOptionPane.INFORMATION_MESSAGE);
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
			}
		} while (!done);
		return num;
	}
	
	private static int getIntegerExponent() {
		int num = 0;
		boolean done = false;
		do {
			try {
				String intString = JOptionPane.showInputDialog(null,
						"Enter a Exponent integer:", null,
						JOptionPane.INFORMATION_MESSAGE);
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
			}
		} while (!done);
		return num;
	}

}
