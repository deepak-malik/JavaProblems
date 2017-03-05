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
	 * This is brute force approach which does not handle lot of cases, for ex. doubles
	 * 
	 * Time Complexity : O(n) => where n is the number of characters in string
	 * Space Complexity : O(n)
	 * 
	 * @param s
	 * @return {@link boolean}
	 */
	public static boolean isValidNumber_BF(String s) {
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

	/* We will be using state machine in this approach */
	public enum STATE {START, INTEGER, DECIMAL, UNKNOWN}

	/**
	 * Method to check if a number is valid
	 * 
	 * @param s
	 * @return {@link boolean}
	 */
	public static boolean isValidNumber_Optimized(String s) {
		/* Return false for empty string */
		if (s.isEmpty()) return false;
		/* Ignore + or - */
		int i = 0;
		if (s.charAt(i) == '+' || s.charAt(i) == '-') {
			i++;
		}
		/* Assume state as START and keep checking state for each character */
		STATE currentState = STATE.START;
		while (i < s.length()) {
			currentState = getNextState(currentState, s.charAt(i));
			/* If at any point we reach unknown state, return false */
			if (currentState == STATE.UNKNOWN) {
				return false;
			}
			i++;
		}
		return true;
	}

	/**
	 * Method to check the next state of the character 
	 * 
	 * @param currentState
	 * @param c
	 * @return {@link STATE}
	 */
	private static STATE getNextState(STATE currentState, char c) {
		/* If start, check for others, 
		 * If Integer, check for decimal or valid integer 
		 * If Decimal, check next character is number, if yes, stay at Decimal */
		switch (currentState) {
		case START:
		case INTEGER :
			if (c == '.') {
				return STATE.DECIMAL;
			} else if (c >= '0' && c <= '9') {
				return STATE.INTEGER;
			} else {
				return STATE.UNKNOWN;
			}
		case DECIMAL :
			if (c >= '0' && c <= '9') {
				return STATE.DECIMAL;
			} else {
				return STATE.UNKNOWN;
			}
		default:
			break;
		}
		return STATE.UNKNOWN;
	}

	public static void main(String[] args) {
		System.out.println(isValidNumber_BF("3"));
		System.out.println(isValidNumber_BF("-39073097"));
		System.out.println(isValidNumber_Optimized("3"));
		System.out.println(isValidNumber_Optimized("-39073097"));
		System.out.println(isValidNumber_Optimized("4.325"));
		System.out.println(isValidNumber_Optimized("1.1.1"));
		System.out.println(isValidNumber_Optimized("33."));
		System.out.println(isValidNumber_Optimized("22.22."));
	}

}
