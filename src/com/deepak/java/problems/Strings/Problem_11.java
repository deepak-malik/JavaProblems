package com.deepak.java.problems.Strings;

/**
 * Find the length of last word
 * 
 * @author Deepak
 */
public class Problem_11 {

	/**
	 * Method to check the length of last word
	 * 
	 * @param input
	 * @return {@link int}
	 */
	public static int lengthOfLastWord(String input) {
		if (input == null || input.length() == 0) {
			return 0;
		}
		int result = 0;
		boolean isChar = false;
		for (int i = input.length() - 1; i >=0; i--) {
			char c = input.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				isChar = true;
				result++;
			} else {
				if (isChar) {
					return result;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello Deepak Malik, Java is fun!"));
	}

}
