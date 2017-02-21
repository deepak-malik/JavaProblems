package com.deepak.java.problems.Math;

/**
 * Given a set of parenthesis of different types 
 * find if they are valid
 * 
 * @author Deepak
 */
public class Problem_15 {

	/**
	 * Method to check if input has valid parenthesis
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isValidParenthesis(String input) {
		int braceCount = 0; // {
		int parenthesisCount = 0; // (
		int squareBracketCount = 0; // [
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
		return braceCount == 0 && parenthesisCount == 0 && squareBracketCount == 0;
	}

	public static void main(String[] args) {
		System.out.println(isValidParenthesis("}}}{{{"));
		System.out.println(isValidParenthesis("{[]"));
		System.out.println(isValidParenthesis("{[()]}"));
	}

}
