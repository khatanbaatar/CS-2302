import javax.swing.JOptionPane;

public class IntDivision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int answer = 0;
		do {

			int numerator = getIntegerNumerator();
			int denominator = getIntegerDenominator();
			JOptionPane.showMessageDialog(null, " The Quotient is: "
					+ numerator / denominator + "\n The Remainder is: "
					+ numerator % denominator);
			answer = JOptionPane.showConfirmDialog(null,
					"Do you want to try a different numbers?", "Choose one",
					JOptionPane.YES_NO_OPTION);

		} while (answer == JOptionPane.YES_OPTION);

	}

	private static int getIntegerNumerator() {
		int num = 0;
		boolean done = false;
		do {
			try {
				String intString = JOptionPane.showInputDialog(null,
						"Enter a Numerator:", null,
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

	private static int getIntegerDenominator() {
		int num = 0;
		boolean done = false;
		do {
			try {
				String intString = JOptionPane.showInputDialog(null,
						"Enter a Denominator:", null,
						JOptionPane.INFORMATION_MESSAGE);
				if (intString == null) {
					JOptionPane
							.showMessageDialog(null,
									"You choose CANCEL, the program will now be closing");
					System.exit(0);
				}
				num = Integer.parseInt(intString);
				done = true;
				if (num == 0) {
					JOptionPane
							.showMessageDialog(
									null,
									"You can't divide by zero... enter a different Denominator",
									"Black Hole Error",
									JOptionPane.ERROR_MESSAGE);
					done = false;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Invalid Number Please try again",
						"Number Format Error", JOptionPane.ERROR_MESSAGE);
			}
		} while (!done);
		return num;
	}

}
