import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneNumberReader {

	/**
	 * @param input reads the line of a document
	 * @param output a Document that will be written to
	 */
	public static void Phone(Scanner input, PrintWriter output) {
		ArrayList<String> validPhones = new ArrayList<String>();
		int[] Codes = new int[999];
		while (input.hasNext()) {
			String line = input.nextLine();
			if (line.length() != 10) {
				output.println(line);
			} else if (TestPhone(line) == false) {
				output.println(line);
			} else {
				validPhones.add(line);
			}
		}
		AreaCodes(validPhones, Codes);
		System.out.println("Valid Phone Numbers are: " + validPhones);
		// Since the parseInt removes the Zeros leading the number
		// I have to add them back in so they look like area codes
		for (int i = 0; i < Codes.length; i++) {
			if (Codes[i] > 0) {
				if (i < 10) {
					System.out.println("00" + i + ":" + Codes[i]);
				} else if (i > 9 && i < 100) {
					System.out.println("0" + i + ":" + Codes[i]);
				} else {
					System.out.println(i + ":" + Codes[i]);
				}
			}
		}
		input.close();
		output.close();
	}

	/**
	 * @param s - a String of numbers to test if it is a valid phone number
	 * @return true if its valid false if its not valid
	 */
	public static boolean TestPhone(String s) {
		int i = 0;

		while (i < s.length()) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
			i++;
		}
		return true;

	}

	/**
	 * @param s A string arraylist of phone numbers
	 * @param AreaCodes A array of area codes to count 
	 */
	public static void AreaCodes(ArrayList<String> s, int[] AreaCodes) {
		String p;
		int a;
		for (int i = 0; i < s.size(); i++) {
			p = s.get(i).substring(0, 3);
			a = Integer.parseInt(p);
			AreaCodes[a]++;
		}

	}

}
