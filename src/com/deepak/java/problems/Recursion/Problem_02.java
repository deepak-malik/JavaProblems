package com.deepak.java.problems.Recursion;

/**
 * Print fibonacci series till a given number
 * Note : Fibonacci series is formed by adding 2 previous numbers, 
 * ex, 0, 1, 1, 2, 3, 5, 8 ... 
 * @author Deepak
 */
public class Problem_02 {
	
	/**
	 * Method to find the fib number 
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int fib_Recursive(int n) {
		if (n == 0) return 0;
		if (n == 1 || n == 2) return 1;
		return fib_Recursive(n - 1) + fib_Recursive(n - 2);
	}
	
	/**
	 * Method to find the fib number
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int fib_Iterative(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < n; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		return c;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			System.out.print(fib_Recursive(i) + " ");
		}
		System.out.println();
		for (int i = 0; i < 8; i++) {
			System.out.print(fib_Iterative(i) + " ");
		}
	}

}
