import tester.Testing;
import tester.Validation;


public class TestBubbleSort implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestBubbleSort());
	}
	
	@Override
	public void doTests()
	{
		int[] a = null;
		BubbleSort.sort(a);
		Validation.shouldHaveReportedError();// Test 1
		
		a = new int[0];
		
		int[] b = new int[0];
		BubbleSort.sort(a);
		Validation.shouldBeEqual(a, b); // Test 2
		
		int[] c = {1, 2, 3, 4, 5, 6, 6};
		
		int[] d = {1, 2, 3, 4, 5, 6, 6};
		BubbleSort.sort(d);
		Validation.shouldBeEqual(d, c); // Test 3
		
		int[] e = {6, 6, 5, 4, 3, 2, 1};
		BubbleSort.sort(e);
		Validation.shouldBeEqual(e, c); // Test 4
		
		int[] f = {6, 3, 2, 4, 1, 5, 6};
		BubbleSort.sort(f);
		Validation.shouldBeEqual(f, c); // Test 5
	}

}