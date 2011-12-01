import tester.Validation;

/**
 * @author Andres Castro: Assignment 2
 *
 */
public class ArrayReversal {
	/**
	 * @param a Array to be reversed. Array a is not null.
	 * @param numElements (number of integers in the array to be reversed) is non-negative and not greater than the length of a
	 */
	public static void reverse(int[] a, int numElements) {
		if (a == null) { // Report an error if the array is null
			Validation.reportError("ARRAY IS NULL");
		} else if (numElements < 0 || numElements > a.length) { // Test 2 Report and error if the number is less than 0 
			Validation.reportError("numElements is out of range");// or greater than the array 
		} else {
			for (int i = 0; i < numElements / 2; i++) {
	            int last = a[numElements - 1 - i]; // get the last value
	            a[numElements - 1 - i] = a[i]; // set the last value to the first
	            a[i] = last;   
				
			}
		}
	}                                                                                                                                  

}
