import tester.Testing;
import tester.Validation;


public class TestFindInArray implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestFindInArray());
	}

	@Override
	public void doTests()
	{
		int[] a = null;
		int result = FindInArray.findFirst(a, 6);
		Validation.shouldHaveReportedError();// Test 1 ErroR
		result = FindInArray.findLast(a, 6);
		Validation.shouldHaveReportedError(); // Test 2 ErroR
		int[] b = {-2, 5, 7, 5, -2, 0, 3, 3};
		result = FindInArray.findFirst(b, 6);
		Validation.shouldBeEqual(result, -1); // Test 3 First
		result = FindInArray.findLast(b, -1);
		Validation.shouldBeEqual(result, -1); // Test 4 Last
		result = FindInArray.findFirst(b, -2);
		Validation.shouldBeEqual(result, 0); // Test 5 First
		result = FindInArray.findLast(b, -2);
		Validation.shouldBeEqual(result, 4); // Test 6 Last
		result = FindInArray.findFirst(b, 3);
		Validation.shouldBeEqual(result, 6); // Test 7 First
		result = FindInArray.findLast(b, 3);
		Validation.shouldBeEqual(result, 7); // Test 8 Last
		result = FindInArray.findFirst(b, 7);
		Validation.shouldBeEqual(result, 2); // Test 9 First
		result = FindInArray.findLast(b, 7);
		Validation.shouldBeEqual(result, 2); // Test 10 Last
	}

}