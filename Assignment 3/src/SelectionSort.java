import tester.Validation;


/**
 * @author Andres Castro 2302
 *
 */
public class SelectionSort {
	/**
	 * preconditions a is not null
	 * postconditions a is sorted in increasing order
	 * @param a array a to be sorted
	 * 
	 * 
	 */
	public static void selectionSort(double[] a){
		
		if(a == null){
			Validation.reportError("Array is null");
		}
		else{
			for (int i = 0; i < a.length - 1; i++) {

				// Find the Current Min
				double currentMin = a[0];
				int currentMinIndex = i;

				for (int j = i; j < a.length; j++) {
					if (a[currentMinIndex] > a[j]) {
						currentMin = a[i];
						currentMinIndex = j;
					}
				}
				// swaps a[i] with the current min;
				if (currentMinIndex != i) {
					a[i] = a[currentMinIndex];
					a[currentMinIndex] = currentMin;

				}
			}
		}
	}

}
