/**
 * JavaProblems
 * Problem_37.java
 */
package com.deepak.java.problems.Math;

import java.util.Arrays;

/**
 * <br> Problem Statement :
 * 
 * Write a program to find the nth super ugly number.
 * Super ugly numbers are positive numbers whose all prime factors 
 * are in the given prime list primes of size k. 
 * 
 * For example, [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32] is the sequence of 
 * the first 12 super ugly numbers given primes = [2, 7, 13, 19] of size 4.
 * 
 * Note :
 * (1) 1 is a super ugly number for any given primes.
 * (2) The given numbers in primes are in ascending order.
 * (3) 0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000.
 * (4) The nth super ugly number is guaranteed to fit in a 32-bit signed integer.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_37 {

	/**
	 * Method to find Nth super ugly number
	 * 
	 * Time Complexity = O(kn) = where n is number to be found and k is length of primes
	 * Space Complexity = O(n)
	 * 
	 * @param n
	 * @param primes
	 * @return {@link int}
	 */
	public static int findNthSuperUglyNumber(int n, int[] primes) {
		int[] ugly = new int[n];
		int[] idx = new int[primes.length];
		int[] val = new int[primes.length];
		Arrays.fill(val, 1);
		int next = 1;
		for (int i = 0; i < n; i++) {
			ugly[i] = next;
			next = Integer.MAX_VALUE;
			for (int j = 0; j < primes.length; j++) {
				/* skip duplicate and avoid extra multiplication */
				if (val[j] == ugly[i]) {
					val[j] = ugly[idx[j]++] * primes[j];
				}
				/* Find next ugly number */
				next = Math.min(next, val[j]);
			}
		}
		return ugly[n - 1];
	}

	public static void main(String[] args) {
		System.out.println(findNthSuperUglyNumber(3, new int[]{2, 7, 13, 19}));
	}

}
