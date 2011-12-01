import tester.Validation;

/**
 * @author Andres Castro 2302
 * 
 */
public class SortStudentGrades {
	/**
	 * preconditions  both s and g are not null and they have the same length
	 * 
	 * @param a array s of student names
	 *            
	 * @param b an array g of student grades
	 * 
	 * postconditions g is sorted in descending order and s has been modified 
	 * so that the same "parallel" relationship exists between s and g.            
	 */
	public static void sortByGrade(String[] a, int[] b) {
		if (a == null) {
			Validation.reportError("String Array is null");
		} else if (b == null) {
			Validation.reportError("int array is null");
		} 
		else if( a.length != b.length){
			Validation.reportError("Arrays are not the same Length");
		}
		else {
			for (int i = 0; i < a.length; i++) {
				// Find the Current Min
				int currentMin = b[0];
				String currentString = a[0];
				int currentMinIndex = i;

				for (int j = i; j < a.length; j++) {
					if (b[currentMinIndex] < b[j]) {
						currentMin = b[i];
						currentString = a[i];
						currentMinIndex = j;
					}
				}
				// swaps a[i] with the current min and b[i] 
				if (currentMinIndex != i) {
					b[i] = b[currentMinIndex];
					a[i] = a[currentMinIndex];
					b[currentMinIndex] = currentMin;
					a[currentMinIndex] = currentString;

				}
			}

		}
	}

}
