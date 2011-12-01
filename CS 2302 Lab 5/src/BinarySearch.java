import java.util.Arrays;

import tester.Validation;

/**
 * @author Andres Castro CS 2302 Lab 5
 *
 */
public class BinarySearch {
	/**
	 * Precondition Array is not null and Array is sorted in Decending order
	 * 
	 * @param list Array to be searched
	 * @param key Int that you are searching for
	 * @return Index in the array where key is found
	 */
	public static int binarySearch(int[] list, int key) {		
		int low = 0;
		if (list == null) {
			Validation.reportError("Array is null");
		} else if (isSortedDecreasing(list) != true) {
			Validation.reportError("Array is not sorted in a decreasing order");
		}
		else{
			
		    int high = list.length - 1;

		    while (high >= low) {
		      int mid = (low + high) / 2;
		      if (key > list[mid])
		        high = mid - 1;
		      else if (key == list[mid])
		        return mid;
		      else
		        low = mid + 1;
		    }

		  
		  
		}
		  return -low - 1; // Now high < low
	}

	

	public static boolean isSortedDecreasing(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1])
				return false;
		}
		return true;
	}
}
