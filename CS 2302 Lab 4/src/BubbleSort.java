import tester.Validation;

/**
 * @author Andres Castro 2302
 * 
 */
public class BubbleSort {
	/**
	 * precondition - array is not null
	 * 
	 * @param a - array to be bubble sorted 
	 *             
	 *postcondition - traverses the array swapping 2 adjacent elements if they are out of order
	 *           
	 */
	public static void sort(int[] a) {
		if (a == null) {
			Validation.reportError("array is null"); // if a is null report error
		} else {
			for (int i = 1; i < a.length; i++) {
				for (int j = 0; j < a.length - i; j++) {
					if (a[j] > a[j + 1]) { // If index a[j] is greater than a[j+1] swap the two.
						int currentIndex = a[j];
						a[j] = a[j + 1];
						a[j + 1] = currentIndex;
					}
				}
			}

		}
	}

}
