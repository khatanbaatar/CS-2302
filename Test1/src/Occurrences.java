import tester.Validation;

public class Occurrences {

	/**
	 * preconditions: array can't be null
	 * @param a array to be tested
	 * @param n specific number to look for in array
	 * @return the position of the second occurrence of n
	 */
	public static int secondOccurrence(int[] a, int n) {
		int count = 0;
		
		if (a == null) {
			Validation.reportError("Array is null");
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == n) {
					count++;
				}
				if (count == 2) {
					return i;
				}

			}
		}
		if (count < 2) {
			return -1;
		} else {
			return count;
		}
	}
}
