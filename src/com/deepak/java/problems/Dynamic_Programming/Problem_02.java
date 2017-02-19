package com.deepak.java.problems.Dynamic_Programming;

/**
 * Print Fibonacci numbers till a given number
 * 
 * @author Deepak
 */
public class Problem_02 {
	
	public static int fib_DP(int n) {
		if (n == 0) return 0;
		if (n == 1 || n == 2) return 1;
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 1;
		for (int i = 3; i < n + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			System.out.print(fib_DP(i) + " ");
		}
	}

}
