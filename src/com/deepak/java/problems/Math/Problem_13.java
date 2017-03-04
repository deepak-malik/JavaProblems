/**
 * JavaProblems
 * Problem_13.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Find if a given number is power of n
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_13 {

	/**
	 * Method to check if a number is power of n
	 * This is a iterative approach
	 * 
	 * Time Complexity : O(log(n))
	 * Space Complexity : O(1)
	 * 
	 * @param number
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPowerOfN_Iterative(int number, int n) {
		/* 0 cannot be a power of any number */
		if (number == 0) {
			return false;
		}
		/* Number raised to the power 0 is always 1 */
		if (number == 1) {
			return true;
		}
		/* Keep going until number is greater then 0.
		 * If remainder is not 0, number is not power of n,
		 * else divide the number by n and follow same steps */
		while (number > 0) {
			int remainder = number % n;
			if (remainder == 0) {
				number = number / n;
				if (number == 1) {
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}

	/**
	 * Method to check if a number is power of n
	 * 
	 * Time Complexity : O(log(n))
	 * Space Complexity : O(1)
	 * 
	 * @param number
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPowerOfN_Recursive(int number, int n) {
		/* 0 cannot be a power of any number */
		if (number == 0) {
			return false;
		}
		/* Number raised to the power 0 is always 1 */
		if (number == 1) {
			return true;
		}
		/* Modulus of number divided by n should be 0 and keep checking for number / n */
		if (number > 1) {
			return (number % n == 0) && isPowerOfN_Recursive(number / n, n);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfN_Iterative(256, 2));
		System.out.println(isPowerOfN_Recursive(256, 2));
	}

}
