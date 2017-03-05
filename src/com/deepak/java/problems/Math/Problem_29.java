/**
 * JavaProblems
 * Problem_29.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Given a non-negative integer num, repeatedly add all its digits.
 * 
 * Follow Up :
 * Keep adding until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_29 {

	/**
	 * Method to add digits of a number
	 * 
	 * Time Complexity = O(log(n))
	 * Space Complexity = O(1)
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int addDigits(int n) {
		int result = 0;
		while (n != 0) {
			result += n % 10;
			n /= 10;
		}
		return result;
	}

	/**
	 * Method to add digits of a number until we are left with 1 digit
	 * 
	 * Time Complexity = O(1)
	 * Space Complexity = O(1)
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int addDigits_FollowUp(int n) {
		return 1 + (n - 1) % 9;
	}

	/**
	 * Method to add digits of a number until we are left with 1 digit
	 * 
	 * Time Complexity = O(n)
	 * Space Complexity = O(1)
	 * 
	 * @param n
	 * @return {@link int}
	 */
	public static int addDigits_FollowUp_Recursive(int n) {
		int sum = 0;
		String s = String.valueOf(n);
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0'; 
		}
		if (sum < 10) {
			return sum;
		} else {
			return addDigits_FollowUp_Recursive(sum);
		}
	}

	public static void main(String[] args) {
		System.out.println(addDigits(38));
		System.out.println(addDigits_FollowUp(38));
		System.out.println(addDigits_FollowUp_Recursive(38));
	}

}
