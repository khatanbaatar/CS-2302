public class DisplayConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "AbAbAbAbAb+234esdflkjeJIDSLFIJW DLKJFW";

		String w = translateWord(a);
		System.out.println(w);
	}

	public static String translateWord(String word) {
		
		String n = "";
		int i = 0;

		while (i < word.length()) {
			if (Character.isLetter(word.charAt(i))
					&& Character.isUpperCase(word.charAt(i))) {
				n += Character.toLowerCase(word.charAt(i));
			} else if (Character.isLetter(word.charAt(i))
					&& Character.isLowerCase(word.charAt(i))) {
				n += Character.toUpperCase(word.charAt(i));
			} else {
				n += word.charAt(i);
			}
			i++;
		}
		return n;

	}

}
