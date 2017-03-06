/**
 * JavaProblems
 * Problem_19.java
 */
package com.deepak.java.problems.Math;

import java.util.ArrayList;
import java.util.List;

/**
 * <br> Problem Statement :
 * 
 * Find permutation of a given string
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_19 {

	/**
	 * Method to find permutations of a given string
	 * 
	 * Time Complexity : O(n) => Where n is the number of characters in String
	 * Space Complexity : O(n)
	 *  
	 * @param str
	 * @return {@link List<String>}
	 */
	public static List<String> findPermutation(String str) {
		/* If string is null or length is 0, no permutation exists */
		if (str == null || str.length() == 0) {
			return null;
		}
		return findPermutation(str, "");
	}

	/**
	 * Method to find all permutations of a given string
	 * 
	 * @param str
	 * @param prefix
	 * @return {@link List<String>}
	 */
	private static List<String> findPermutation(String str, String prefix) {
		List<String> result = new ArrayList<>();
		int n = str.length();
		if (n == 0) {
			result.add(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				result.addAll(findPermutation(str.substring(0, i) + str.substring(i+1, n), prefix + str.charAt(i)));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> result = findPermutation("abc");
		for (String str : result) {
			System.out.println(str);
		}
	}

}
