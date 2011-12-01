import java.io.PrintWriter;
import java.util.Scanner;

public class Athens {

	/**
	 * @param input Document to be read for translation
	 * @param output Translated copy of Input
	 */
	public static void translate(Scanner input, PrintWriter output) {
		while (input.hasNext()) {
			String line = input.nextLine();
			String translatedLine = translateLine(line);
			output.println(translatedLine);
		}
		input.close();
		output.close();
	}

	/**
	 * @param line Line in the document to be translated
	 * @return translated line
	 */
	private static String translateLine(String line) {
		String s = "";
		Scanner scan = new Scanner(line);
		while (scan.hasNext()) {
			String word = scan.next();
			String translatedWord = translateWord(word);
			s += translatedWord + " ";
		}
		return s;
	}

	/**
	 * @param word that you want to be translated
	 * @return the translated word
	 */
	public static String translateWord(String word) {
		String s = word;
		String s2 = null;

		s = word.replace("a", "");
		s2 = s.replace("o", "aw");

		return s2;
	}

}