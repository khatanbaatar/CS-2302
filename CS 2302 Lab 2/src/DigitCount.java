import tester.Validation;

/**
 * @author Andres Castro Created: January 21, 2010 CS 2302/01
 */
public class DigitCount { // Counts the occurrence of digits in an array and
							// stores them in a new array from 0 to 9;
	/**
	 * @param a
	 *            = The array to count
	 * @param b
	 *            = The length to count up to in A
	 * @return = The new array
	 */
	public static int[] countDigits(int[] a, int b) {
		int[] count = new int[10];

		if (a == null) { // Test 1
			Validation.reportError("ARRAY IS NULL");
		} else if (b < 0 || b > a.length) { // Test 2
			Validation.reportError("B is out of range");
		} else if (whatIs(a, b) == false) {// Test 3
			Validation
					.reportError("a number in the array is negative and or is greater than 9");
		} else {
			for (int i = 0; i < b; i++) {
				count[a[i]]++;
			}
		}

		return count;
	}

	/**
	 * @param a
	 *            = the array to test
	 * @param b
	 *            = what to check up to in the array
	 * @return = return false if there is a negative number or a number greater
	 *         than 9
	 */
	public static boolean whatIs(int[] a, int b) {
		boolean cat = true;
		for (int i = 0; i < b; i++) {
			if (a[i] < 0 || a[i] > 9) {
				cat = false;
			}

		}
		return cat;
	}

}