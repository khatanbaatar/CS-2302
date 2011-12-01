
public class Student extends Person {
	private String major;

	/**
	 * @param name the name of a student
	 * @param emailAddress the students email address
	 * @param address the students main address
	 * @param newMajor the students major
	 */
	public Student(String name, String emailAddress, String address, String newMajor) {
		super(name, emailAddress, address);
		major = newMajor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ ", " + major;
	}
	
	
}
