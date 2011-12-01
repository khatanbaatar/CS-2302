import tester.Testing;
import tester.Validation;


public class TestContact implements Testing
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Validation.run(new TestContact());
	}

	@Override
	public void doTests()
	{
		Contact c = new Contact (null, null);
		Validation.shouldHaveReportedError();
		c = new Contact (null, "Smith");
		Validation.shouldHaveReportedError();
		c = new Contact ("", "Smith");
		Validation.shouldHaveReportedError();
		c = new Contact ("John", "Smith");
		Validation.shouldBeEqual(c.getFirstName(), "John");
		Validation.shouldBeEqual(c.getLastName(), "Smith");
		Contact c1 = new Contact ("Bubba", "Dawg");
		int value = c.compareTo(c1);
		Validation.shouldBeEqual(value > 0, true); // 6
		Contact c2 = new Contact ("Jim", "Smith");
		value = c.compareTo(c2);
		Validation.shouldBeEqual(value > 0, true); // 7
		Contact c3 = new Contact ("John", "Smith");
		value = c.compareTo(c3);
		Validation.shouldBeEqual(value, 0);
	}

}
