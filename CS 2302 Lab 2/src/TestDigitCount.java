import tester.Testing;
import tester.Validation;


public class TestDigitCount implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestDigitCount());
	}
	
	@Override
	public void doTests()
	{
		int[] digits = null;
		int counts[] = DigitCount.countDigits(digits, 2);// Test 1
		Validation.shouldHaveReportedError();
		
		int[] digits1 = {2, 7, 2, 6, 0, 34, -2, 8};
		counts = DigitCount.countDigits(digits1, -3); // Test 2
		Validation.shouldHaveReportedError();
		counts = DigitCount.countDigits(digits1, 13); // Test 3
		Validation.shouldHaveReportedError();

		int[] expected = new int[10];
		
		counts = DigitCount.countDigits(digits1, 0); // Test 4
		Validation.shouldBeEqual(counts, expected);
		
		expected[2]++;
		counts = DigitCount.countDigits(digits1, 1); // Test 5
		Validation.shouldBeEqual(counts, expected);
	

		expected[7]++;
		counts = DigitCount.countDigits(digits1, 2); // Test 6
		Validation.shouldBeEqual(counts, expected);

		expected[2]++;
		counts = DigitCount.countDigits(digits1, 3); // Test 7
		Validation.shouldBeEqual(counts, expected);
		
		counts = DigitCount.countDigits(digits1, 7); // Test 8
		Validation.shouldHaveReportedError();

	}

}