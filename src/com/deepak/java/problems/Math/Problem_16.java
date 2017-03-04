/**
 * JavaProblems
 * Problem_16.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_16 {

	/**
	 * Method to divide two integers
	 * 
	 * Time Complexity = O(log(m/n)) => Where m = dividend and n = divisor
	 * Space Complexity = O(1)
	 * 
	 * @param dividend
	 * @param divisor
	 * @return {@link int}
	 */
	public static int divide_BF(int dividend, int divisor) {
		/* If divisor is 0 or we are dividing min value by -1, return max value */
		if (divisor == 0 || (divisor == -1 && dividend == Integer.MIN_VALUE)) {
			return Integer.MAX_VALUE;
		}
		/* Division is basically number of times 
		 * we can subtract divisor until dividend >= 0 */
		int absDivisor = Math.abs(divisor);
		int absDividend = Math.abs(dividend);
		int result = 0;
		while ((absDividend - absDivisor) >= 0) {
			absDividend -= absDivisor;
			result++;
		}
		if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
			return result;
		} else {
			return -result;
		}
	}

	/**
	 * Method to divide two integers
	 * 
	 * Time Complexity : O(log(n))
	 * Space Complexity : O(1)
	 * 
	 * @param dividend
	 * @param divisor
	 * @return {@link int}
	 */
	public static int divide_Optimized(int dividend, int divisor) {
		/* If divisor is 0 or we are dividing min value by -1, return max value */
		if (divisor == 0 || (divisor == -1 && dividend == Integer.MIN_VALUE)) {
			return Integer.MAX_VALUE;
		}
		/* Get positive values */
		int pDividend = Math.abs(dividend);
		int pDivisor = Math.abs(divisor);
		int result = 0;
		while (pDividend >= pDivisor) {
			int leftShifts = 0;
			while (pDividend >= (pDivisor << leftShifts)) {
				leftShifts++;
			}
			result += 1 << (leftShifts - 1);
			pDividend -= pDivisor << (leftShifts - 1); 
		}
		if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
			return result;
		} else {
			return -result;
		}
	}

	public static void main(String[] args) {
		System.out.println(divide_BF(234, 4));
		System.out.println(divide_Optimized(234, 4));
	}

}
