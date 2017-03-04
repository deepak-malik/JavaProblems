/**
 * JavaProblems
 * Problem_26.java
 */
package com.deepak.java.problems.Math;

import java.util.Arrays;

/**
 * <br> Problem Statement :
 * 
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 * 
 * <br>
 * 
 * @author Deepak
 */
public class Problem_26 {

	/**
	 * Method to add one to the number 
	 * 
	 * Time Complexity = O(n)
	 * Space Complexity = O(n)
	 * 
	 * @param digits
	 * @return {@link int[]}
	 */
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;
		return newNumber;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[]{9,9})));
	}

}
