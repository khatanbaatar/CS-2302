import tester.Testing;
import tester.Validation;


public class TestArrayEquality implements Testing {


	public static void main(String[] args) {
		Validation.run(new TestArrayEquality());
	}

	@Override
	public void doTests() {
		int[] a1 = null;
		int[] a2 = null;
		
		boolean result = ArrayEquality.areEqual(a1, a2);
		Validation.shouldBeEqual(result, true);
		
		a1 = new int[5];
		result = ArrayEquality.areEqual(a1, a2);
		Validation.shouldBeEqual(result, false);
		
		a2 = new int[4];
		result = ArrayEquality.areEqual(a1, a2);
		Validation.shouldBeEqual(result, false);
		
		a2 = new int[5];
		a2[3] = 8;
		
		result = ArrayEquality.areEqual(a1, a2);
		Validation.shouldBeEqual(result, false);
		
		a1[3] = 8;
		result = ArrayEquality.areEqual(a1, a2);
		Validation.shouldBeEqual(result, true);
	}

}
