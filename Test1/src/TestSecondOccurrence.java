import tester.Testing;
import tester.Validation;


public class TestSecondOccurrence implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestSecondOccurrence());
	}

	@Override
	public void doTests()
	{
		int[] a = null;
		int num = Occurrences.secondOccurrence(a, 5);
		Validation.shouldHaveReportedError();
		a = new int[0];
		num = Occurrences.secondOccurrence(a, 5);
		Validation.shouldBeEqual(num, -1);
		int[] b = {3, 5, 3, 2, 6, 5, 4, 1, 4};
		num = Occurrences.secondOccurrence(b, 3);
		Validation.shouldBeEqual(num, 2);
		num = Occurrences.secondOccurrence(b, 4);
		Validation.shouldBeEqual(num, 8);
		num = Occurrences.secondOccurrence(b, 6);
		Validation.shouldBeEqual(num, -1);
		num = Occurrences.secondOccurrence(b, 7);
		Validation.shouldBeEqual(num, -1);
	}

}
