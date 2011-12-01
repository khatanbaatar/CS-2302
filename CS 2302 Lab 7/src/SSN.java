import tester.Validation;

/**
 * @author AndresMobile
 * 
 */
public class SSN {
	/**
	 * preconditions: string is not null
	 * 
	 * @param s
	 *            social security number to be checked
	 * @return whether a string is a valid social security number
	 */
	public static boolean isValidSSN(String s) {
		char dash = '-';
		if (s == null) {
			Validation.reportError("SSN is null");
		} else if (s.length() != 11) {
			return false;
		} else if (s.charAt(3) != dash && s.charAt(6) != dash) {
			return false;
		} else {
			int i = 0;
			while (i < 3) {
				if (Character.isDigit(s.charAt(i)) == false) {
					return false;
				}
				i++;
			}
			i = 4;
			while (i < 6) {
				if (Character.isDigit(s.charAt(i)) == false) {
					return false;
				}
				i++;
			}

			i = 7;
			while (i < 11) {
				if (Character.isDigit(s.charAt(i)) == false) {
					return false;
				}
				i++;
			}

		}
		return true;
	}
}
