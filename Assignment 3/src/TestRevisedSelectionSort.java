import tester.Testing;
import tester.Validation;


public class TestRevisedSelectionSort implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestRevisedSelectionSort());
	}

	@Override
	public void doTests()
	{
		double[] a = null;
		SelectionSort.selectionSort(a);
		Validation.shouldHaveReportedError(); // Test 1
		
		double[] b = new double[0];
		double[] c = new double[0];
		
		SelectionSort.selectionSort(b);
		Validation.shouldBeEqual(b, c); // Test 2
		
		double[] d = {2.3, 6, 1.2, 5, 34, -3, 6, 6, 6};
		
		double[] e = {-3, 1.2, 2.3, 5, 6, 6, 6, 6, 34};
		
		SelectionSort.selectionSort(d);
		Validation.shouldBeEqual(d, e); // Test 3
	}


}