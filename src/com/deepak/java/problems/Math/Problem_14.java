/**
 * JavaProblems
 * Problem_14.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement
 * 
 * Implement FizzBuzz till a given number n
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_14 {

	/**
	 * Method to print fizz Buzz
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * 
	 * @param n
	 */
	public static void fizzBuzz(int n) {
		/* Fizz buzz cannot happen on negative numbers */
		if (n < 0) return;
		/* Check for each number, if divisible by 3 or 5 or both.
		 * Print accordingly */
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		fizzBuzz(100);
	}

}
