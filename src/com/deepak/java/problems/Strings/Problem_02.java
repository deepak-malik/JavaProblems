package com.deepak.java.problems.Strings;

import java.util.Arrays;

/**
 * Rotate a array by a given number k
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Rotate an array 
	 * Time complexity - O(n)
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public static int[] rotateArray_BruteForce(int[] array, int k) {
		if (array == null) {
			return null;
		}
		if (k == array.length) {
			return array;
		}
		if (k > array.length) {
			k = k % array.length;
		}
		int[] tempArray = new int[array.length];
		int count = 0;
		for (int i = array.length - k; i < array.length; i++) {
			tempArray[count] = array[i];
			count++;
		}
		for (int i = 0; i < k; i++) {
			tempArray[count] = array[i];
			count++;
		}
		return tempArray;
	}
	
	public static int[] rotateArray_Optimized(int[] array, int k) {
		if (k > array.length || array == null) {
			return null;
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(rotateArray_BruteForce(new int[] {1, 3, 5, 6, 7, 9}, 0)));
		System.out.println(Arrays.toString(rotateArray_BruteForce(new int[] {1, 3, 5, 6, 7, 9}, 1)));
		System.out.println(Arrays.toString(rotateArray_BruteForce(new int[] {1, 3, 5, 6, 7, 9}, 2)));
		System.out.println(Arrays.toString(rotateArray_BruteForce(new int[] {1, 3, 5, 6, 7, 9}, 3)));
		System.out.println(Arrays.toString(rotateArray_BruteForce(new int[] {1, 3, 5, 6, 7, 9}, 4)));
		System.out.println(Arrays.toString(rotateArray_BruteForce(new int[] {1, 3, 5, 6, 7, 9}, 5)));
		System.out.println(Arrays.toString(rotateArray_BruteForce(new int[] {1, 3, 5, 6, 7, 9}, 6)));
		System.out.println(Arrays.toString(rotateArray_BruteForce(new int[] {1, 3, 5, 6, 7, 9}, 7)));
	}
}
