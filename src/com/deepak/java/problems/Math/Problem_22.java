/**
 * JavaProblems
 * Problem_22.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Check if a string representation is a valid number
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_22 {

	/**
	 * Method to check if a given string is a valid number
	 * 
	 * Time Complexity : O(n) => where n is the number of characters in string
	 * Space Complexity : O(n)
	 * 
	 * @param s
	 * @return {@link boolean}
	 */
	public static boolean isValidNumber(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= '0' && charArray[i] <= '9' ||
					(i == 0 && charArray[i] == '-')) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isValidNumber("3"));
		System.out.println(isValidNumber("-39073097"));
	}

}
