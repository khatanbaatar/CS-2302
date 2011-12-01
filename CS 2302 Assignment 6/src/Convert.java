import java.io.PrintWriter;
import java.util.Scanner;

public class Convert {
	public static void translate(Scanner input, PrintWriter output) {
		while (input.hasNext()) {
			String line = input.nextLine();
			String translatedLine = translateCharacter(line);
			output.println(translatedLine);
		}
		input.close();
		output.close();
	}

	/**
	 * @param s The line of characters to be translated
	 *            
	 * @return the characters switched from uppercase to lower and lowercase to upper
	 */
	public static String translateCharacter(String s) {

		String n = "";
		int i = 0;

		while (i < s.length()) {
			if (Character.isLetter(s.charAt(i))
					&& Character.isUpperCase(s.charAt(i))) {
				n += Character.toLowerCase(s.charAt(i));
			} else if (Character.isLetter(s.charAt(i))
					&& Character.isLowerCase(s.charAt(i))) {
				n += Character.toUpperCase(s.charAt(i));
			} else {
				n += s.charAt(i);
			}
			i++;
		}
		return n;

	}
}
