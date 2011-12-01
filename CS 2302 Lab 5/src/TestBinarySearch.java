import tester.Testing;
import tester.Validation;


public class TestBinarySearch implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestBinarySearch ());
	}

	@Override
	public void doTests()
	{
		int[] a = null;
		int result = BinarySearch.binarySearch(a, 8);
		Validation.shouldHaveReportedError();
		int[] b = {4, 6, 3, 8, 1};
		result = BinarySearch.binarySearch(b, 6);
		Validation.shouldHaveReportedError();
		int[] c = {9,8,7,6,5,4,5};
		result = BinarySearch.binarySearch(c, 6);
		Validation.shouldHaveReportedError();
		int[] d = {23, 20, 15, 11, 8, 6, 3, 0, -1, -4};
		result = BinarySearch.binarySearch(d, 0);
		Validation.shouldBeEqual(result, 7);
		result = BinarySearch.binarySearch(d, 23);
		Validation.shouldBeEqual(result, 0);
		result = BinarySearch.binarySearch(d, -4);
		Validation.shouldBeEqual(result, 9);
		result = BinarySearch.binarySearch(d, 12);
		Validation.shouldBeEqual(result, -4);
		result = BinarySearch.binarySearch(d, 45);
		Validation.shouldBeEqual(result, -1);
		result = BinarySearch.binarySearch(d, -7);
		Validation.shouldBeEqual(result, -11);

	}

}