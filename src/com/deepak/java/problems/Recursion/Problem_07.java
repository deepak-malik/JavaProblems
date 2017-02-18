package com.deepak.java.problems.Recursion;

/**
 * print FB Recursion
 * Given a number 123, print
 * 1+2+3
 * -1+2+3
 * 1+2-3
 * -1+2-3
 * 1-2+3
 * -1-2+3
 * 1-2-3
 * -1-2-3
 * 
 * @author Deepak
 */
public class Problem_07 {

	/**
	 * Method to print fb recursion
	 * 
	 * @param str
	 */
	public static void fBRecursion(String str) {
		fBRecursion(str, new StringBuilder());
		return;
	}

	/**
	 * Method to print fb recursion
	 * 
	 * @param str
	 * @param builder
	 */
	private static void fBRecursion(String str, StringBuilder builder) {
		/* If string is null or empty, no recursion exists */
		if (str == null || str.isEmpty()) {
			return;
		}
		/* Take the first char and check if rest string is empty or not 
		 * If yes, print the char and - 
		 * else, call recursive with + and - */
		builder.append(str.charAt(0));
		if (str.substring(1).length() == 0) {
			System.out.println(builder.toString());
			System.out.println("-" + builder.toString());
		} else {
			fBRecursion(str.substring(1), builder.append("+"));
			fBRecursion(str.substring(1), builder.append("-"));
		}
		removeLastTwoCharacters(builder);
	}

	/**
	 * Method to remove last two characters of string 
	 * 
	 * @param builder
	 */
	private static void removeLastTwoCharacters(StringBuilder builder) {
		if (builder.toString() != null && builder.toString().length() > 2) {
			builder.deleteCharAt(builder.length() - 1);
			builder.deleteCharAt(builder.length() - 1);
		}
	}

	public static void main(String[] args) {
		fBRecursion("123");
		fBRecursion("1");
	}

}
