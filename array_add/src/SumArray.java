import tester.Validation;

// Andres Castro 2302
public class SumArray {

	/**
	 * @param a Is the Array your are going to add
	 * @param b Is the index of the array you want it to add up to
	 * @return gives you the array added up to the Indext of B
	 */
	public static int sum(int[] a, int b) {
		int result = 0;
		if (b <= 0)
			Validation.reportError("Number must be above 0");
		else if (b > a.length)
			Validation.reportError("Number is longer than Array");
		else {
			int i = 0;
			while (i < b ) {
				result += a[i];
				i++;
			}

		}
		return result;

	}

}