public class BinarySearch {
	/** Use binary search to find the key in the list */
	/**
	 * @param list
	 *            A list of Comparable objects
	 * @param key
	 *            A object that you want to find in the array
	 * @return the index of the object in the array
	 */
	public static int binarySearch(Comparable[] list, Comparable key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key.compareTo(list[mid]) < 0)
				high = mid - 1;
			else if (key.compareTo(list[mid]) == 0)
				return mid;
			else
				low = mid + 1;
		}

		return -low - 1; // Now high < low
	}

}
