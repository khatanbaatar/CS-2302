import javax.swing.JOptionPane;


public class Task {
	private String taskName;
	
	public Task(String taskName, int priority){

		if (taskName == null || taskName.length() == 0)
			JOptionPane.showMessageDialog(null, "That is not a vail Task Name");
		else
			this.taskName = taskName;
	}

	
}
