/**
 * JavaProblems
 * Problem_23.java
 */
package com.deepak.java.problems.Math;

/**
 * <br> Problem Statement :
 * 	
 * Given a column title as appear in an Excel sheet, return its corresponding column number. 
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28 
 * ...
 * AAA -> 703
 *   
 * </br>
 * 
 * @author Deepak
 */
public class Problem_23 {

	/**
	 * Method to convert excel title to number
	 * 
	 * Time Complexity = O(n) => Where n is number of characters in input
	 * Space Complexity = O(1)
	 * 
	 * @param s
	 * @return {@link int}
	 */
	public static int excelTitleToNumber(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(excelTitleToNumber("A"));
		System.out.println(excelTitleToNumber("Z"));
		System.out.println(excelTitleToNumber("AB"));
		System.out.println(excelTitleToNumber("AAA"));
		System.out.println(excelTitleToNumber("AAA"));
	}

}
