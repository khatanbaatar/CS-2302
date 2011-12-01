import tester.Validation;

public class Student implements Comparable<Student>
{

	private double gpa;

	private String lastName;

	private String firstName;

	/**
	 * @param gpa
	 *           - must be between 0 & 4 inclusive
	 * @param lastName
	 *           - cannot be null & cannot be empty
	 * @param firstName
	 *           - cannot be null & cannot be empty
	 */
	public Student(double gpa, String lastName, String firstName)
	{
		if (gpa < 0 || gpa > 4)
			Validation.reportError("invalid gpa");
		else if (lastName == null || lastName.length() == 0)
			Validation.reportError("invalidLastName");
		else if (firstName == null || firstName.length() == 0)
			Validation.reportError("invalidLastName");
		else
		{
			this.gpa = gpa;
			this.lastName = lastName;
			this.firstName = firstName;
		}
	}

	/**
	 * @return the gpa
	 */
	public double getGpa()
	{
		return gpa;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	@Override
	public int compareTo(Student o) {
		int result = 0;
		if(getGpa() < o.getGpa()){
			result = -1;
		}
		else if(getGpa() > o.getGpa()){
			result = 1;
		}
		else if(getGpa() == o.getGpa()){
			if(lastName.compareTo(o.lastName) != 0){
				result = lastName.compareTo(o.lastName);
			}
			else{
				result = firstName.compareTo(o.firstName);
			}
		}
		return result;
	}

}
