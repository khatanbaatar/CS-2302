import java.util.Date;

public class Employee extends Person{
	private int salary;
	private Date date;
	
	/**
	 * @param name - name of employee
	 * @param emailAddress - email of employee
	 * @param address  - address of employee
	 * @param newSalary - salary of employee
	 */
	public Employee(String name, String emailAddress, String address, int newSalary) {
		super(name, emailAddress, address);
		salary = newSalary;
		date = new Date();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", " +  salary + ", " + date;
	}
	
	
	
	
}
