import java.util.ArrayList;

public class Conversion {

	/**
	 * @param s the Array of strings to be converted to an ArrayList
	 * @return an ArrayList of strings representation of the string array
	 */
	public static ArrayList<String> convert(String[] s) {
		ArrayList<String> a = new ArrayList<String>();
		if (s == null) {
			a = null;
		} else {
			for (int i = 0; i < s.length; i++) {
				a.add(s[i]);
			}
		}
		return a;

	}
}
