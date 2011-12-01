import tester.Validation;
import java.util.Arrays;

/**
 * @author AndresMobile
 * THIS WAS HARD!
 */
public class Anagrams {
	
	/**
	 * @param s1 string to compare to string 2
	 * @param s2 string to compare to string 1
	 * @return true if they are Anagrams false if they are not Anagrams
	 */
	public static boolean areAnagrams(String s1, String s2) {
		boolean boo = false;
		if (s1 == null || s2 == null) {
			Validation.reportError("One or both of the strings are null");
		} else if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			sort(c1);
			sort(c2);
			if(Arrays.equals(c1, c2)){
				boo = true;
			}
			else
				boo = false;
		}
		return boo;

	}
	
	public static void sort(char[] a){
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) { // If index a[j] is greater than a[j+1] swap the two.
					char currentIndex = a[j];
					a[j] = a[j + 1];
					a[j + 1] = currentIndex;
				}
			}
		}
	}

}
