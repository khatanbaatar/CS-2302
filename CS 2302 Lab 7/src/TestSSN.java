import tester.Testing;
import tester.Validation;


public class TestSSN implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestSSN());
	}
	
	@Override
	public void doTests()
	{
		String s = null;
		boolean result = SSN.isValidSSN(s);
		Validation.shouldHaveReportedError(); // Test 1
		s = "";
		result = SSN.isValidSSN(s);
		Validation.shouldBeEqual(result, false); // Test 2
		s = "123456789";
		result = SSN.isValidSSN(s);
		Validation.shouldBeEqual(result, false); // Test 3
		s = "33333333333";
		result = SSN.isValidSSN(s);
		Validation.shouldBeEqual(result, false); // Test 4
		s = "33333333333333333333333333333333333333333";
		result = SSN.isValidSSN(s);
		Validation.shouldBeEqual(result, false); // Test 5
		s = "123-34-5-55";
		result = SSN.isValidSSN(s);
		Validation.shouldBeEqual(result, false); // Test 6
		s = "123-456-789";
		result = SSN.isValidSSN(s);
		Validation.shouldBeEqual(result, false); // Test 7
		s = "123-45-6789";
		result = SSN.isValidSSN(s);
		Validation.shouldBeEqual(result, true); // Test 8
	}

}