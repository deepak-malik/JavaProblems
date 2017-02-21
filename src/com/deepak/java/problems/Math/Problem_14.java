package com.deepak.java.problems.Math;

/**
 * Implement FizzBuzz till a given number n
 * 
 * @author Deepak
 */
public class Problem_14 {

	/**
	 * Method to print fizz Buzz
	 * 
	 * @param n
	 */
	public static void fizzBuzz(int n) {
		if (n < 0) return;
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
