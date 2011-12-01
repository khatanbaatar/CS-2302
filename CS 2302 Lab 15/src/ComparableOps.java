import tester.Validation;

public class ComparableOps {

	
	/**
	 * @param a And array of comparable objects
	 * @return the position of the largest object in the array
	 */
	public static int max(Comparable[] a) {
		int big = 0;
		if (a == null || a.length < 2) {
			Validation.reportError("Nothing in the array");
		} else {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[big].compareTo(a[i + 1]) < 0) {
					big = i + 1;
				}
			}
		}

		return big;

	}
	/**
	 * @param a an array of comparable objects
	 * @return the position of the smallest object in the array
	 */
	public static int min(Comparable[] a) {
		int small = 0;
		if (a == null || a.length < 2) {
			Validation.reportError("Nothing in the array");
		} else {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[small].compareTo(a[i + 1]) > 0) {
					small = i + 1 ;
				}
			}
		}

		return small;

	}

}
