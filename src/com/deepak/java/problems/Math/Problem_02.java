package com.deepak.java.problems.Math;

/**
 * Check if a given number is prime or not
 * Prime Number : A number which is divisible by just 1 and itself
 *  
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to check if a number is prime
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPrime(int n) {
		/* If number is less then 2, return false */
		if (n < 2) {
			return false;
		}
		/* Then start from 2 and go till n/2 
		 * Note : If a number is not divisible by any number
		 * till n/2, it won't be divisible further. */
		for (int i = 2; i < n/2; i++) {
			/* If remainder comes out to be zero, it is not a prime */
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Method to check if a number is prime
	 * This is a optimized approach
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPrime_Optimized(int n) {
		/* If number is less then 2, return false */
		if (n < 2) {
			return false;
		}
		/* 2 is the first prime. return true */
		if (n == 2) {
			return true;
		}
		/* If a number get's divided by 2, it is not prime */
		if (n % 2 == 0) {
			return false;
		}
		/* Now start with 3, even number can't be a prime, so keep
		 * checking with multiples of 3 and make sure 
		 * increment keeps the number as odd */
		for (int i = 3; i*i <= n; i+=2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(7));
		System.out.println(isPrime(15));
	}

}
