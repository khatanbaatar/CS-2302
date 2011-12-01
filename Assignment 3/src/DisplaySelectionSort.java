public class DisplaySelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] a = { 2.3, 6, 1.2, 5, 34, -3, 6, 6, 6 };
		for (int i = 0; i < a.length; i++) {

			// Find the Current Min
			double currentMin = a[0];
			int currentMinIndex = i;

			for (int j = i; j < a.length; j++) {
				if (a[currentMinIndex] < a[j]) {
					currentMin = a[i];
					currentMinIndex = j;
				}
			}
			// swaps a[i] with the current min;
			if (currentMinIndex != i) {
				a[i] = a[currentMinIndex];
				a[currentMinIndex] = currentMin;

			}
		}

		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " , ");
		}
	}

}