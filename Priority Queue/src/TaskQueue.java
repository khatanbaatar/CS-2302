import javax.swing.JOptionPane;


public class TaskQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int answer = 0;
		do {

			int taskName = getTaskName();
			int taskNumber = getTaskNumer();
			JOptionPane.showMessageDialog(null, " Task has been added to the Queue");
			answer = JOptionPane.showConfirmDialog(null,
					"Do you want to add another Task?", "Choose one",
					JOptionPane.YES_NO_OPTION);

		} while (answer == JOptionPane.YES_OPTION);
		
	}

}
