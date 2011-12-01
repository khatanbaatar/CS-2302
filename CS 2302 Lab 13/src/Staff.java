
public class Staff extends Employee{
	private String title;

	/**
	 * @param name - name of Staff
	 * @param emailAddress - email of Staff
	 * @param address - address of staff
	 * @param newSalary - salary of staff
	 * @param newTitle - title of staff
	 */
	public Staff(String name, String emailAddress, String address, int newSalary, String newTitle) {
		super(name, emailAddress, address, newSalary);
		// TODO Auto-generated constructor stub
		title = newTitle;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", " + title;
	}
	
	
	
}
