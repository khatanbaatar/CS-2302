import tester.Testing;
import tester.Validation;


public class TestArrayReversal implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestArrayReversal());
	}
	@Override
	public void doTests()
	{
		int[] a = null;
		
		ArrayReversal.reverse(a, 4);
		Validation.shouldHaveReportedError(); // Test 1
		
		int[] b = {1,2,3,4,5,6,7,8};
		ArrayReversal.reverse(b, -3);
		Validation.shouldHaveReportedError(); // Test 2
		ArrayReversal.reverse(b, 17);
		Validation.shouldHaveReportedError(); // Test 3
		
		ArrayReversal.reverse(b, 0);
		
		int[] c = {1,2,3,4,5,6,7,8};
		Validation.shouldBeEqual(b, c); // Test 4
		
		int[] d = {1,2,3,4,5,6,7,8};
		
		ArrayReversal.reverse(d, 5);
		
		int[] e = {5, 4, 3, 2, 1, 6, 7, 8};
		Validation.shouldBeEqual(d, e); // Test 5
		
		int[] f = {1,2,3,4,5,6,7,8};
		ArrayReversal.reverse(f, 8);
		int[] g = {8,7,6,5,4,3,2,1};
		Validation.shouldBeEqual(f, g); // Test 6
	}

}