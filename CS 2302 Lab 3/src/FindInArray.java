import tester.Validation;

/**
 * @author Andres Castro CS 2302 Lab 3
 * 
 */
public class FindInArray {
	/**
	 * precondition - array is not null
	 * 
	 * @param a
	 *            - array of integers
	 * @param b
	 *            - target of the search
	 * @return - index of first occurrence of the target in the array of
	 *         integers, -1 if target is not in the array
	 */
	public static int findFirst(int[] a, int b) {
		int count = 0;
		if (a == null) {
			Validation.reportError("array is null");
		} else {
			int i = 0;
			while (a[i] != b && i < a.length - 1) {
				count++;
				i++;
			}
			if (count == a.length - 1) { // If count is equal to the length of the array -1
				count = -1;
				return count; // return 1
			} else {
				return count; // Else return count which is equal to the index of the array.
			}
		}

		return count;
	}

	/**
	 * precondition - array is not null
	 * 
	 * @param a
	 *            - array of integers
	 * @param b
	 *            - target of the search
	 * @return - index of last occurrence of the target in the array of
	 *         integers, -1 if target is not in the array
	 */
	public static int findLast(int[] a, int b) {
		int count = 1;
		if (a == null) {
			Validation.reportError("array is null");
		} else {
			int i = a.length - 1;
			while (a[i] != b && i > 0) {
				count++;
				i--;
			}
			if (count == a.length) { // If count is equal to the length of a
				count = -1;
				return count; // return -1
			} else {
				count = a.length - count; // count is the length of the array minus the count
				return count;
			}
		}

		return count;
	}
}
