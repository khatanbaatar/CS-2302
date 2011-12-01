import javax.swing.JOptionPane;

public class TestInputMethods {

	public static void main(String[] args) {
		UserInput userInput = InputMethods.getIntegerBoundedAttempts(
				"Enter an integer",
				"Enter an integer - try not to screw up this time", 3);
		if (userInput.isValidInput())
			JOptionPane.showMessageDialog(null, "User entered: "
					+ userInput.getUserInput());
		else
			JOptionPane.showMessageDialog(null,
					"User did not enter valid input");
		int result = InputMethods.getIntegerUnboundedAttempts(
				"Enter an integer",
				"Enter an integer - try not to screw up this time");
		JOptionPane.showMessageDialog(null, "User entered: " + result);
	}

}
