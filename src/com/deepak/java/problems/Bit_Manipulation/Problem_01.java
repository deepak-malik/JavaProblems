package com.deepak.java.problems.Bit_Manipulation;

/**
 * Given an array of integers, every element appears
 * twice except for one. Find that single one.
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to find a single number
	 * 
	 * @param array
	 * @return {@link int}
	 */
	public static int singleNumber(int[] array) {
		int result = 0;
		for (int value : array) {
			result ^= value; 
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {2, 4, 6, 6, 3, 2, 3}));
	}

}
