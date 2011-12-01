import tester.Validation;

public class DisplayArrayReversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] d = { 1, 2, 3, 4, 5, 6, 7, 8 };

		ArrayReversal.reverse(d, 5);

		int[] a = { 8, 7, 6, 5, 4, 3, 2, 1 };
		// int temp = e[0];
		for (int i = 0; i < a.length / 2; i++) {
			int last = a[a.length - 1 - i]; // get the last value
			a[a.length - 1 - i] = a[i]; // set the last value to the first
			a[i] = last;
		}

		Validation.shouldBeEqual(d, a); // Test
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " , ");
		}

	}

}
