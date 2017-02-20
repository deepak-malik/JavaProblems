package com.deepak.java.problems.Strings;

public class Problem_04 {
	
	/**
	 * Method to remove white spaces
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * 
	 * @param str
	 * @return {@link String}
	 */
	public static String removeWhiteSpaces(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != ' ' && c != '\t') {
				builder.append(c);
			}
		}
		return builder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(removeWhiteSpaces("    All greek  to    me.    "));
	}

}
