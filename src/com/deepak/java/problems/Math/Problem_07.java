package com.deepak.java.problems.Math;

/**
 * Given a number n, find it's square root without using /
 * 
 * @author Deepak
 */
public class Problem_07 {

	/**
	 * Method to find the square root of a number
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int findSquareRoot(int n) {
		/* If number is 0, return 0 */
		if (n == 0) {
			return 0;
		}
		/* Same logic as square, but here, compare result */
		int j = 0;
		int result = 0;
		int sum = 1;
		while (result < n) {
			result += sum;
			sum += 2;
			j++;
		}
		return j;
	}

	public static void main(String[] args) {
		System.out.println(findSquareRoot(9));
		System.out.println(findSquareRoot(25));
		System.out.println(findSquareRoot(49));
		System.out.println(findSquareRoot(8));
	}

}
