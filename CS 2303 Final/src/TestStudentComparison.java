import tester.Testing;
import tester.Validation;


public class TestStudentComparison implements Testing
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Validation.run(new TestStudentComparison());
	}

	@Override
	public void doTests()
	{
		Student s1 = new Student (0.1, "Bob", "Billy");
		Student s2 = new Student (4.0, "Wreck", "Rambling");
		Student s3 = new Student (0.1, "Dawg", "Harry");
		Student s4 = new Student (4.0, "Bob", "Brilliant");
		Student s5 = new Student (0.1, "Bob", "Bubba");
		int result = s1.compareTo(s2);
		Validation.shouldBeEqual(result < 0, true);
		result = s1.compareTo(s3);
		Validation.shouldBeEqual(result < 0, true);
		result = s2.compareTo(s4);
		Validation.shouldBeEqual(result < 0, false);
		result = s1.compareTo(s5);
		Validation.shouldBeEqual(result < 0, true);
	}

}
