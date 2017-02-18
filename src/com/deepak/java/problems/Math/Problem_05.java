package com.deepak.java.problems.Math;

import java.util.Arrays;

/**
 * Given a integer array of size n, find the majority element.
 * A majority element is one, which appears more then n/2 times.
 * You can assume array is not empty and majority element always exists. 
 * 
 * Ex. if array size is 10, we have to return a number which
 * appears more then 5 times.
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to find majority of element in the given array
	 * Here, we can sort the array and since, majority > n/2
	 * so, middle element will always be the majority element
	 * 
	 * Time Complexity - Here sorting takes O(n log(n))
	 * 
	 * @param array
	 * @return {@link int}
	 */
	public static int findMajority_Simple(int[] array) {
		if (array.length == 1) {
			return array[0];
		}
		Arrays.sort(array);
		return array[array.length / 2];
	}

	/**
	 * Method to find majority element in the given array 
	 * This is "Linear time Majority Vote Algorithm"
	 * Time Complexity - O(n)
	 * 
	 * @param array
	 * @return {@link int}
	 */
	public static int findMajorityElement(int[] array) {
		/* Create a pair of result and count of first element */
		int count = 1;
		int result = array[0];
		/* For each element, check if it matches the result
		 * If yes, increase the count, else decrease */
		for (int i = 0; i < array.length; i++) {
			if (array[i] == result) {
				count++;
			} else {
				count--;
			}
			/* When count becomes 0, update the element and reset the counter */
			if (count == 0) {
				result = array[i];
				count = 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = {2, 4, 4, 6, 4, 4, 7, 4, 4};
		System.out.println(findMajority_Simple(array));
		System.out.println(findMajorityElement(array));
	}

}
