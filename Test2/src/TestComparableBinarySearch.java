import tester.Testing;
import tester.Validation;


public class TestComparableBinarySearch implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestComparableBinarySearch());
	}

	@Override
	public void doTests()
	{
		String[] s = {"abc", "def", "ghi", "jkl", "xyz"};
		int result = BinarySearch.binarySearch(s, "jkl");
		Validation.shouldBeEqual(result, 3);
		result = BinarySearch.binarySearch(s, "bad");
		Validation.shouldBeEqual(result, -2);
		Integer[] nums = {-3, 1, 5, 7, 13, 22};
		result = BinarySearch.binarySearch(nums, -3);
		Validation.shouldBeEqual(result, 0);
		result = BinarySearch.binarySearch(nums, 33);
		Validation.shouldBeEqual(result, -7);
	}

}
