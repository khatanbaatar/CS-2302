import tester.Validation;

public class Multiples {
	/**
	 * @param a array of int's
	 * @param n Number to compare against int's in array
	 * @return n number of multiples of n in a given array of integers
	 */
	public static int numMultiples(int[] a, int n) {

		int count = 0;
		if (a == null) {
			Validation.reportError("Array is null");
		} else if (n < 1) {
			Validation.reportError("specified integer is negative");
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i]% n == 0) {
					count++;
				}
			}
		}
		return count;

	}
}
