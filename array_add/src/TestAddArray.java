import tester.Testing;
import tester.Validation;


public class TestAddArray implements Testing{


	public static void main(String[] args) {
		Validation.run(new TestAddArray());
	}

	@Override
	public void doTests() {
		int[] a = {2, 3, 4, 5, 6, 1};
		int result = SumArray.sum(a, -6);
		Validation.shouldHaveReportedError();
		 result = SumArray.sum(a, 0);
		Validation.shouldHaveReportedError();
		result = SumArray.sum(a, 10);
		Validation.shouldHaveReportedError();
		result = SumArray.sum(a, 1);
		Validation.shouldBeEqual(result, 2);
		result = SumArray.sum(a, 6);
		Validation.shouldBeEqual(result, 21);
		result = SumArray.sum(a, 3);
		Validation.shouldBeEqual(result, 9); 
		
		
		
		
	}

}
