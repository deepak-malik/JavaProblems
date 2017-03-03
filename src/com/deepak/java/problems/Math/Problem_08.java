/**
 * JavaProblems
 * Problem_08.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Given a number n, positive or negative, find the reverse
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_08 {

	/**
	 * Method to find the reverse of a number
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int findReverse(int n) {
		/* We don't want to deal with negative numbers, so get the absolute value */
		int x = Math.abs(n);
		int result = 0;
		/* Keep going until it becomes zero */
		while (x != 0) {
			/* Multiply the result with 10 every time and add the remainder */
			result = (result * 10) + (x % 10);
			/* Move to next digit */
			x = x/10;
		}
		/* If we got negative number, make the result as negative */
		if (n < 0) {
			result *= -1;
		}
		/* Ensure, we don't go out of bound */
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(findReverse(2332));
		System.out.println(findReverse(23321));
		System.out.println(findReverse(2));
		System.out.println(findReverse(-84838));
		System.out.println(findReverse(23));
	}

}
