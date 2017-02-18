package com.deepak.java.problems.Recursion;

/**
 * Given a string, count number of "hi" in it.
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to count "hi" in a given string
	 * 
	 * @param str
	 * @return {@link int}
	 */
	public static int countHi(String str) {
		/* If not a valid string, return 0 */
		if (str.length() < 1 || str == null) {
			return 0;
		} 
		/* If "hi" doesn't exists then return 0 
		 * else make count as 1 and check for the rest of the substring */
		if (str.indexOf("hi") == -1) {
			return 0;
		} else {
			return 1 + countHi(str.substring(str.indexOf("hi") + 2, str.length()));
		}
	}

	public static void main(String[] args) {
		System.out.println(countHi("Hello"));
		System.out.println(countHi("hi"));
		System.out.println(countHi("hi this is hihi"));
	}

}
