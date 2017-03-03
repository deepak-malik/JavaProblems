/**
 * JavaProblems
 * Problem_06.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Given a number n, find the square without using * operator
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to find square of a number without using *
	 * 
	 * Time Complexity = O(n)
	 * Space Complexity = O(1)
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int findSquare(int n) {
		/* If n = 0, return 0 */
		if (n == 0) {
			return 0;
		}
		/* Start from the first number 
		 * Note - Squares start from 3, and then we keep on adding + 2
		 * i.e 1 + 3 + 5 = 9 => 3^2
		 * 1+ 3 + 5 + 7 => 4^2 and so on */
		int j = 0;
		int result = 0;
		int sum = 1;
		while (j < n) {
			result += sum;
			sum += 2;
			j++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(findSquare(3));
		System.out.println(findSquare(5));
		System.out.println(findSquare(-2));
	}

}
