package com.deepak.java.problems.Math;

/**
 * Given a unsorted positive array of integers, 
 * find the first missing integer
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to find first missing integer 
	 * 
	 * @param array
	 * @return {@link int}
	 */
	public static int findFirstMissingInteger(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			while (array[i] != i) {
				/* Check if element is out of range */
				if (array[i] < 0 || array[i] >= length) {
					break;
				}
				/* Check for duplicates */
				if (array[i] == array[array[i]]) {
					break;
				}
				/* Now swap */
				int temp = array[i];
				array[i] = array[temp];
				array[temp] = temp;
			}
		}
		/* Now our array is sorted, check which index is missing */
		for (int i = 0; i < length; i++) {
			if (array[i] != i) {
				return i;
			}
		}
		return length;
	}

	public static void main(String[] args) {
		int[] array = {-1, -18, 0, 1, 2, 13, 4, 3, 15, 7, 8, 9};
		System.out.println(findFirstMissingInteger(array));
	}

}
