import tester.Validation;

/**
 * @author AndresMobile
 * 
 */
public class CountDigits {
	/**
	 * preconditions: must not be null,
	 * 
	 * @param s
	 *            a String to convert to digits
	 * @return an array of integers containing the 10 counts of the number of
	 *         occurrences
	 */
	public static int[] digitCount(String s) {
		int[] a = new int[10];

		if (s == null) {
			Validation.reportError("Array is null");
		} else if (s.length() < 1) {
			return a;
		} else {
			int i = 0;
			while (i < s.length()) {
				if (Character.isDigit(s.charAt(i)) == false) {
					// do nothing
				} else {
					// puts the string int its corresponding array position
					a[s.charAt(i) - '0']++;
				}
				i++;
			}
		}
		return a;
	}
}
