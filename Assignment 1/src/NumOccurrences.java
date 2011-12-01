import tester.Validation;

public class NumOccurrences {

	/**
	 * @param a = array you want to test
	 * @param b = number you are looking for in the array
	 * @return = how many times  the number occurs 
	 */
	public static int num(int[] a, int b) {

		int count = 0;
		// if the array is null return 0
		if (a == null) {
		} else {
			for (int i = 0; i < a.length; i++) { // if b = the index add 1 to count
				if (b == a[i]) {
					count++;
				}
			}

		}

		return count;

	}

}
