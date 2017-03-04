/**
 * JavaProblems
 * Problem_24.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 
 * Given a column number in excel sheet, return it's column title
 * For example :
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB 
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_24 {

	/**
	 * Method to convert excel number to excel title
	 * 
	 * Time Complexity = O(n)
	 * Space Complexity = O(n)
	 * 
	 * @param n
	 * @return {@link String}
	 */
	public static String excelNumberToTitle(int n) {
		StringBuilder builder = new StringBuilder();
		while (n > 0) {
			/* Reduce 1 because we are adding A */
			n--;
			/* Insert at first position */
			builder.insert(0, (char) ('A' + n % 26));
			n /= 26;
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println(excelNumberToTitle(25));
		System.out.println(excelNumberToTitle(26));
		System.out.println(excelNumberToTitle(27));
		System.out.println(excelNumberToTitle(3));
	}

}
