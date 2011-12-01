import tester.Validation;

/**
 * @author Andres Castro
 * 
 */
public class Hex {
	/**
	 * preconditions:  String must not be null, have at least 1 characters, 
	 * and be composed strictly of valid hex digits ('0' .. '9' & 'A' .. 'F'
	 * @param s a String to be converted to digits
	 * @return the integer with the given hex representation
	 */
	public static int parseHex(String s) {
		int result = 0;
		if (s == null) {
			Validation.reportError("String array is null");
		} else if (s.length() < 1) {
			Validation.reportError("Array is empty");
		} else {
			int i = 0;
			while (i < s.length()) { 
				// if it is a Letter and not and A,B,C,D,E,F report an error
				if ((s.charAt(i) - 55 < 10 || s.charAt(i) - 55 > 15)
						&& Character.isLetter(s.charAt(i))) {
					Validation
							.reportError("Contains a character  out side the range between A - F");
					// If it is a Digit and Less than 0 or higher than 9 then report an error
				} else if (Character.isDigit(s.charAt(i))
						&& (s.charAt(i) - 48 < 0 && s.charAt(i) - 48 > 9)) {
					Validation.reportError("Number is not between 0 and 9");
				} else {
					// If 
					if (Character.isDigit(s.charAt(i))) { 
						result += s.charAt(i) - '0'
								* Math.pow(16, s.length() - 1 - i);
					} else {
						result += (s.charAt(i) - 55) * Math.pow(16, s.length()
								- 1 - i);

					}
				}
				i++;
			}
		}
		return result;

	}
}
