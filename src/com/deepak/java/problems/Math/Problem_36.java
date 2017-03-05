/**
 * JavaProblems
 * Problem_36.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Write a program to check whether a given number is an ugly number. 
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
 * 
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7. 
 * Note that 1 is typically treated as an ugly number.
 * 
 * @author Deepak
 */
public class Problem_36 {

	/**
	 * Method to check if given number is ugly number
	 * 
	 * Time Complexity = O(n) => Because for each number, we are checking 3 times
	 * Space Complexity = O(1)
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isUglyNumber(int n) {
		if (n == 0) return false;
		if (n == 1) return true;
		if (n % 2 == 0) {
			n = n/2;
			return isUglyNumber(n);
		}
		if (n % 3 == 0) {
			n = n/3;
			return isUglyNumber(n);
		}
		if (n % 5 == 0) {
			n = n/5;
			return isUglyNumber(n);
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isUglyNumber(6));
		System.out.println(isUglyNumber(8));
		System.out.println(isUglyNumber(14));
	}

}
