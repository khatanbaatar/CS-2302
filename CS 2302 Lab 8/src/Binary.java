import tester.Validation;

public class Binary {
	/**
	 * preconditions: S can not be null, length of string must be greater than 0
	 * 
	 * @param s
	 *            string of numbers to convert to binary
	 * @return string converted to binary
	 */
	public static int parseBinary(String s) {

		int result = 0;
		if (s == null) {
			Validation.reportError("String is null");
		} else if (s.length() < 1) {
			Validation.reportError("String is empty");
		} else {
			int i = 0;
			while (i < s.length()) {
				if (Character.isDigit(s.charAt(i)) == false) {
					Validation
							.reportError("Contains something other than a number");
				} else if (s.charAt(i) - 48 < 0 || s.charAt(i) - 48 > 1) {

					Validation.reportError("Number is not a 0 or a 1");
				} else {
					if (s.charAt(i) - 48 == 1) {
						result += Math.pow(2, s.length() - 1 - i);
					}
				}
				i++;
			}
		}
		return result;
	}
}