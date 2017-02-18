package com.deepak.java.problems.Math;

/**
 * Find the factorial of given number
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to find factorial of a given number 
	 * 
	 * @param number
	 * @return {@link int}
	 */
	public static int findFactorial(int number) {
		/* Break condition */
		if (number == 0) { 
			return 1;
		}
		return number * findFactorial(number - 1);
	}

	public static void main(String[] args) {
		System.out.println(findFactorial(5));
		System.out.println(findFactorial(0));
	}

}
