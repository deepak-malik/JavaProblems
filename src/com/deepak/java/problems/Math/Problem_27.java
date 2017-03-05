/**
 * JavaProblems
 * Problem_27.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Implement pow(x, n).
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_27 {

	/**
	 * Method to implement pow function
	 * 
	 * Time Complexity : O(log(n)) => Every time, we are dividing n by 2
	 * Space Complexity : O(1)
	 * 
	 * @param x
	 * @param n
	 * @return {@link double}
	 */
	public static double pow(double x, int n) {
		/* Power of anything to 0 is 1 */
		if (n == 0) {
			return 1;
		}
		/* If power is negative, make it positive and make number as 1/n
		 * Ex. 3^-2 will become (1/3)^2*/
		if (n < 0) {
			n = -n;
			x = 1/x;
		}
		/* Check if power is even or odd */
		return (n % 2 == 0) ? pow(x*x, n/2) : x*pow(x*x, n/2);
	}
	
	public static void main(String[] args) {
		System.out.println(pow(3, 2));
		System.out.println(pow(3, -2));
	}

}
