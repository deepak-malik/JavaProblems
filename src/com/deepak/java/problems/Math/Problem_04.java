/**
 * JavaProblems
 * Problem_04.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Given a positive array of sorted integers, 
 * find the first missing integer
 * 
 * Follow Up : What if numbers are not sorted?
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to find first missing integer in sorted array.
	 * Note : Assuming numbers are starting from 0
	 * 
	 * Time Complexity = O(n)
	 * Space Complexity = O(1)
	 * 
	 * @param array
	 * @return {@link int}
	 */
	public static int findFirstMissingInteger_SortedArray(int[] array) {
		/* Sum of first n natural numbers */
		int expectedSum = (array.length * (array.length + 1)) / 2;
		int actualSum = 0;
		for (int value : array) {
			actualSum += value;
		}
		return expectedSum - actualSum;
	}

	/**
	 * Method to find first missing integer in unsorted array
	 * 
	 * Time Complexity = O(n)
	 * Space Complexity = O(1)
	 * 
	 * @param array
	 * @return {@link int}
	 */
	public static int findFirstMissingInteger_UnSortedArray(int[] array) {
		int i = 0;
		int n = array.length;
		while (i < n) {
			/* If current element is in range (0, length) and not in its desired
			 * position, then swap else continue */
			if (array[i] >= 0 && array[i] < n && array[array[i]] != array[i]) {
				swap(array, i, array[i]);
			} else {
				i++;
			}
		}
		/* Check from 0th index, if each index and value are same */
		int k = 0;
		while (k < n && array[k] == k) {
			k++;
		}
		/* If it breaks because of empty array or on reaching end,
		 * then k must be the first missing number */
		if (n == 0 || k < n) {
			return k;
		} else {
			return array[0] == k ? k + 1 : k; 
		}
	}

	/**
	 * Method to swap positions in array
	 * 
	 * @param array
	 * @param i
	 * @param j
	 */
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		int[] array = {0};
		System.out.println(findFirstMissingInteger_UnSortedArray(array));
		int[] array2 = {0,1,2,3,4,5,7};
		System.out.println(findFirstMissingInteger_SortedArray(array2));
	}

}
