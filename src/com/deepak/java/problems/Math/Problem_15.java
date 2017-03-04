/**
 * JavaProblems
 * Problem_15.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Given a set of parenthesis of different types 
 * find if they are valid combination
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_15 {

	/**
	 * Method to check if input has valid parenthesis
	 * 
	 * Time Complexity : O(n) => Where n is number of parenthesis in input
	 * Space Complexity : O(1)
	 * 
	 * @param input
	 * @return {@link boolean}
	 */
	public static boolean isValidParenthesis(String input) {
		int braceCount = 0; /* { */
		int parenthesisCount = 0; /* ( */
		int squareBracketCount = 0; /* [ */
		/* Convert to character array and check each one of them.
		 * Maintain count for each pair */
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			switch (c) {
			case '{':
				braceCount++;
				break;
			case '}':
				braceCount--;
				break;
			case '(':
				parenthesisCount++;
				break;
			case ')':
				parenthesisCount--;
				break;
			case '[':
				squareBracketCount++;
				break;
			case ']':
				squareBracketCount--;
				break;

			default:
				break;
			}
		}
		/* Valid pairs will exist if and only if 
		 * input has same number of opening and closing braces. */
		return braceCount == 0 && parenthesisCount == 0 && squareBracketCount == 0;
	}

	public static void main(String[] args) {
		System.out.println(isValidParenthesis("}}}{{{"));
		System.out.println(isValidParenthesis("{[]"));
		System.out.println(isValidParenthesis("{[()]}"));
	}

}
