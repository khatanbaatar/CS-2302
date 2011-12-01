import tester.Testing;
import tester.Validation;


public class TestMultiples implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestMultiples());
	}
	@Override
	public void doTests()
	{
		int[] a = null;
		int num = Multiples.numMultiples(a, 5);
		Validation.shouldHaveReportedError(); // 1
		a = new int[0];
		num = Multiples.numMultiples(a, 5);
		Validation.shouldBeEqual(num, 0); // 2
		int[] b = {4, 5, 2, 6, 8, 7, 9, 18, 12};
		num = Multiples.numMultiples(b, 0);
		Validation.shouldHaveReportedError(); //3
		num = Multiples.numMultiples(b, -3);
		Validation.shouldHaveReportedError(); //4
		num = Multiples.numMultiples(b, 2);
		Validation.shouldBeEqual(num, 6);//5
		num = Multiples.numMultiples(b, 3);
		Validation.shouldBeEqual(num, 4);
		num = Multiples.numMultiples(b, 1);
		Validation.shouldBeEqual(num, 9);
		num = Multiples.numMultiples(b, 11);
		Validation.shouldBeEqual(num, 0);
	}


}
