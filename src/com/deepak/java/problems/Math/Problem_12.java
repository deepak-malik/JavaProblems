package com.deepak.java.problems.Math;

/**
 * Find if a given number is power of 3
 * 
 * @author Deepak
 */
public class Problem_12 {

	/**
	 * Method to check if n is power of three
	 * This is a iterative solution
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPowerOfThree_Iterative(int n) {
		/* If n is 0, return false */
		if (n == 0) {
			return false;
		}
		/* If it's 1, return true i.e 3^0 = 1*/
		if (n == 1) {
			return true;
		}
		boolean result = false;
		while (n > 0) {
			/* Remainder should be 0 and then keep dividing by 3
			 * At the end, we should be left with 0. if yes, n is power of three */
			int remainder = n % 3;
			if (remainder == 0) {
				n = n/3;
				if (n == 1) {
					return true;
				}
			} else {
				return false;
			}
		}
		return result;
	}

	/**
	 * Method to check if n is power of 3
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPowerOfThree_Recursion(int n) {
		/* Basic test cases for 0 and 1 */
		if (n == 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		/* If n > 1, we can check further, if it is 2, return false */
		if (n > 1) {
			/* Mode by 3 should be 0 and power of three should be true for number / 3 */
			return (n % 3 == 0) && isPowerOfThree_Recursion(n/3);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfThree_Iterative(9));
		System.out.println(isPowerOfThree_Recursion(9));
		System.out.println(isPowerOfThree_Iterative(17));
		System.out.println(isPowerOfThree_Recursion(17));
	}
}
