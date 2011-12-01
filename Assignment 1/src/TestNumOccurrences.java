import tester.Testing;
import tester.Validation;


public class TestNumOccurrences implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestNumOccurrences());
	}

	@Override
	public void doTests()
	{
		int a[] = null;
		int number = NumOccurrences.num(a, 4); // Test 1
		Validation.shouldBeEqual(number, 0);
		a = new int[5];
		number = NumOccurrences.num(a, 0); // test 2
		Validation.shouldBeEqual(number, 5); 
		a[0] = 1;
		a[4] = 7;
		number = NumOccurrences.num(a, 0); // Test 3
		Validation.shouldBeEqual(number, 3);
		number = NumOccurrences.num(a, 1); // Test 4
		Validation.shouldBeEqual(number, 1);
		number = NumOccurrences.num(a, 7); // Test 5
		Validation.shouldBeEqual(number, 1);
	}

}