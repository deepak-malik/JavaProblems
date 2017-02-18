package com.deepak.java.problems.Recursion;

/**
 * Given a string, count number of "X" in it
 * This could be lower case or upper case
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to count the existence of a character in a string
	 *  
	 * @param str
	 * @return {@link}
	 */
	public static int countX_Iterative(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				count++;
			}
		}
		return count;
	}

	/**
	 * Method to count the existence of a character in a string
	 * 
	 * @param str
	 * @return {@link int}
	 */
	public static int countX_Recursive(String str) {
		if (str.length() == 0) {
			return 0;
		}
		str = str.toLowerCase();
		if (str.charAt(0) == 'x') {
			return 1 + countX_Recursive(str.substring(1));
		} else {
			return countX_Recursive(str.substring(1));
		}
	}

	public static void main(String[] args) {
		System.out.println(countX_Recursive("X"));
		System.out.println(countX_Recursive("x"));
		System.out.println(countX_Recursive("Xhiugougxxhiwh"));
		System.out.println(countX_Recursive("hello"));

		System.out.println(countX_Iterative("X"));
		System.out.println(countX_Iterative("x"));
		System.out.println(countX_Iterative("Xhiugougxxhiwh"));
		System.out.println(countX_Iterative("hello"));
	}

}
