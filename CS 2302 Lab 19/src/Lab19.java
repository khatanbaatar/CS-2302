import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

			int num = getInteger();
			if (isEven(num)) {
				JOptionPane.showMessageDialog(null, num + " is even");
			} else {
				JOptionPane.showMessageDialog(null, num + " is odd");

			}
	}

	private static int getInteger() {
		int num = 0;
		boolean done = false;
		do {
			try {
				String intString = JOptionPane.showInputDialog(null,
						"Enter an integer:", null,
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
						"That was not an integer you idiot!",
						"Stupidity error", JOptionPane.ERROR_MESSAGE);
			}
		} while (!done);
		return num;
	}

	private static boolean isEven(int num) {
		return num % 2 == 0;
	}

}
