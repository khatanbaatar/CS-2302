import tester.Validation;

public class Octal {
	/**
	 * preconditions: s != null, all characters in the string must be valid octal digits
	 * @param s string of digits to be converted to hex
	 * @return hex number representing the string digit
	 */
	public static int parseOctal(String s) {
		int result = 0;
		if (s == null) {
			Validation.reportError("String is null");
		} else if (s.length() < 1 || s.length() > 3) {
			Validation.reportError("String is empty");
		} else {
			int i = 0;
			while (i < s.length()) {
				if (Character.isLetter(s.charAt(i))) {
					Validation
							.reportError("Contains something other than a number");
				}
				else{
					result += (s.charAt(i) - '0') * Math.pow(8, s.length()
							- 1 - i);
				}
				i++;
			}
			
			
		}
		return result;
	}

}
