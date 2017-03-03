/**
 * JavaProblems
 * Problem_03.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Find the GCD (Greatest Common Divisor) of two given numbers
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to find greatest common divisor
	 * 
	 * Time Complexity : O(n) => Where n is the smaller number
	 * Space Complexity : O(1)
	 * 
	 * @param m
	 * @param n
	 * @return {@link int}
	 */
	public static int findGreatestCommonDivisor(int m, int n) {
		/* Find which is the greater number */
		int x, y;
		x = m > n ? m : n;
		y = m < n ? m : n;
		/* If smaller number is zero, return bigger one */
		if (y == 0) {
			return x;
		}
		int r = x % y;
		/* Recursive call, x -> y and y -> r */
		return findGreatestCommonDivisor(y, r);
	}

	public static void main(String[] args) {
		System.out.println(findGreatestCommonDivisor(15, 17));
		System.out.println(findGreatestCommonDivisor(15, 25));
		System.out.println(findGreatestCommonDivisor(25, 15));
		System.out.println(findGreatestCommonDivisor(25, 0));
	}

}
