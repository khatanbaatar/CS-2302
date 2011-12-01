
public class Faculty extends Employee{
	private String rank;

	/**
	 * @param name - name of Faculty
	 * @param emailAddress - email of Faculty
	 * @param address - address of faculty
	 * @param newSalary - Salary of faculty
	 * @param newRank - rank of Faculty
	 */
	public Faculty(String name, String emailAddress, String address,
			int newSalary, String newRank) {
		super(name, emailAddress, address, newSalary);
		// TODO Auto-generated constructor stub
		rank = newRank;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", " + rank;
	}
	
	
	
	
}
