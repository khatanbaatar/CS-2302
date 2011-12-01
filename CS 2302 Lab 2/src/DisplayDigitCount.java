public class DisplayDigitCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] count = new int[10];
		// int b = 9;
		//a[2] = 1;
		//a[7] = 1;

		for (int i = 0; i < count.length - 1; i++) {
			count[a[i]]++;

		}

		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " , ");

		}

	}

}
