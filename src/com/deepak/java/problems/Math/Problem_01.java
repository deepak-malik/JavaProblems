/**
 * JavaProblems
 * Problem_01.java
 */
package com.deepak.java.problems.Math;

import java.math.BigInteger;

/**
 * <br> Problem Statement :
 * 
 * Find the factorial of given number. 
 * Provide solution in all the approaches you know. 
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to find factorial of a given number
	 * using recursive approach.
	 * Note : This approach is good for small numbers 
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * 
	 * @param number
	 * @return {@link int}
	 */
	public static int findFactorial_Recursive(int number) {
		/* Break condition */
		if (number == 0) { 
			return 1;
		}
		return number * findFactorial_Recursive(number - 1);
	}

	/**
	 * Method to find factorial of a given number
	 * using iterative approach
	 * Note : This approach is good for small numbers
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * 
	 * @param number
	 * @return {@link int}
	 */
	public static int findFactorial_Iterative(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	/**
	 * Method to find factorial of a given number
	 * when number is too big
	 * Note : This will work for big numbers
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * 
	 * @param number
	 * @return {@link BigInteger}
	 */
	public static BigInteger findFactorial_Iterative_BigNumber(int number) {
		BigInteger result = new BigInteger("1");
		for (int i = 1; i <= number; i++) {
			result = result.multiply(new BigInteger(String.valueOf(i)));
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(findFactorial_Iterative_BigNumber(100));
		System.out.println(findFactorial_Iterative(300));
	}

}
