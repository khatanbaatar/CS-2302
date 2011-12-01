import tester.Testing;
import tester.Validation;


public class TestNumDistinct implements Testing
{

	public static void main(String[] args)
	{
		Validation.run (new TestNumDistinct());
	}

	@Override
	public void doTests()
	{
		int[] a = null;
		int num = NumDistinctElements.numDistinct(a); 
		Validation.shouldBeEqual (num, 0);// Test 1
		a = new int[7];
		num = NumDistinctElements.numDistinct(a);
		Validation.shouldBeEqual(num, 1);// Test 2
		a[0] = 4;
		a[6] = 4;
		num = NumDistinctElements.numDistinct(a);
		Validation.shouldBeEqual(num, 2);// Test 3
		a[0] = 1;
		num = NumDistinctElements.numDistinct(a);
		Validation.shouldBeEqual(num, 3); // Test 4
		a[1] = 78;
		a[2] = 98;
		a[3] = 55;
		a[4] = 3;
		a[5] = 22;
		num = NumDistinctElements.numDistinct(a);
		Validation.shouldBeEqual(num, 7); // Test 5

	}

}