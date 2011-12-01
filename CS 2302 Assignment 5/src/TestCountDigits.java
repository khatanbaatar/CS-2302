import tester.Testing;
import tester.Validation;


public class TestCountDigits implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestCountDigits());
	}

	/* (non-Javadoc)
	 * @see tester.Testing#doTests()
	 */
	@Override
	public void doTests()
	{
		String s = null;
		int[] result = CountDigits.digitCount(s);
		Validation.shouldHaveReportedError(); // test 1
		s = "";
		int[] temp = new int[10];
		result = CountDigits.digitCount(s);
		Validation.shouldBeEqual(result, temp); // Test 2
		s = "222";
		temp[2] = 3;
		result = CountDigits.digitCount(s);
		Validation.shouldBeEqual(result, temp); // Test 3
		s = "abcdef";
		temp[2] = 0;
		result = CountDigits.digitCount(s);
		Validation.shouldBeEqual(result, temp); // Test 4
		s = "1231231";
		temp[1] = 3;
		temp[2] = 2;
		temp[3] = 2;
		result = CountDigits.digitCount(s);
		Validation.shouldBeEqual(result, temp); // Test 5
		s = "123abc2";
		temp[1] = 1;
		temp[3] = 1;
		result = CountDigits.digitCount(s);
		Validation.shouldBeEqual(result, temp); // Test 6
	}

}