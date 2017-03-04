/**
 * JavaProblems
 * Problem_25.java
 */
package com.deepak.java.problems.Math;

import java.util.HashSet;

/**
 * <br> Problem Statement :
 * 
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * Example: 19 is a happy number
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_25 {

	/**
	 * Method to check if given number is happy number
	 * 
	 * Time Complexity = O(log(n))
	 * Space Complexity = O(n)
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public boolean isHappyNumber_ExtraSpace(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(n);
		while (n != 1) {
			int result = 0;
			while (n != 0) {
				result += Math.pow(n % 10, 2);
				n /= 10;
			}
			if (set.contains(result)) {
				return false;
			}
			set.add(result);
			n = result;
		}
		return true;
	}

	/**
	 * Method to check if a given number is happy number
	 * 
	 * Time Complexity = O(log(n))
	 * Space Complexity = O(1)
	 * 
	 * @param number
	 * @return {@link boolean}
	 */
	public static boolean isHappyNumber_Optimized(int number) {
		int slow = number;
		int fast = number;
		do {
			slow = digitSquareSum(slow);
			fast = digitSquareSum(digitSquareSum(fast));
			if (fast == 1) {
				return true;
			}
		} while (slow != fast);
		return false;
	}

	/**
	 * Method to find the sum of square of digits
	 * 
	 * @param n
	 * @return {@link int}
	 */
	private static int digitSquareSum(int n) {
		int sum = 0; 
		int temp = 0;
		while (n != 0) {
			temp = n % 10;
			sum += temp * temp;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(isHappyNumber_Optimized(19));
	}

}
