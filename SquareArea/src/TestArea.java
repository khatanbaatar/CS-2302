import tester.Testing;
import tester.Validation;


public class TestArea implements Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validation.run(new TestArea());

	}

	@Override
	public void doTests() {
		// TODO Auto-generated method stub
		double result = FindArea.area(-1,4);
		Validation.shouldHaveReportedError(); // Test 1
		result = FindArea.area(1,4);
		Validation.shouldBeEqual(result, 4.0); // Test 2
	}

}
