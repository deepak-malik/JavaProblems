/**
 * JavaProblems
 * Problem_11.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Find if a given number is power of 2
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_11 {
	
	/**
	 * Method to check if a number is power of 2
	 * 
	 * Time Complexity = O(1)
	 * Space Complexity = O(1) 
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPowerOfTwo(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}
	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(4));
		System.out.println(isPowerOfTwo(5));
	}

}
