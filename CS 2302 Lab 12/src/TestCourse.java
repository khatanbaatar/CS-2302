import tester.Testing;
import tester.Validation;


public class TestCourse implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestCourse());
	}
	
	@Override
	public void doTests()
	{
		Course c = new Course (null);
		Validation.shouldHaveReportedError();
		c = new Course("");
		Validation.shouldHaveReportedError();
		c = new Course ("abc");
		Validation.shouldBeEqual(c.getCourseName(), "abc");
		Validation.shouldBeEqual(c.getNumberOfStudents(), 0);
		c.addStudent("bubba");
		Validation.shouldBeEqual(c.getNumberOfStudents(), 1);
		String[] s = {"bubba"};
		Validation.shouldBeEqual(c.getStudents(), s);
		c.addStudent("billy bob");
		c.addStudent("boss hogg");
		Validation.shouldBeEqual(c.getNumberOfStudents(), 3);
		String[] s1 = {"bubba", "billy bob", "boss hogg"};
		Validation.shouldBeEqual(c.getStudents(), s1);
		c.dropStudent("lazy larry");
		Validation.shouldBeEqual(c.getNumberOfStudents(), 3);
		Validation.shouldBeEqual(c.getStudents(), s1);
		c.dropStudent("billy bob");
		Validation.shouldBeEqual(c.getNumberOfStudents(), 2);
		String[] s2 = {"bubba", "boss hogg"};
		Validation.shouldBeEqual(c.getStudents(), s2);
	}

}