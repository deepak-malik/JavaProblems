package com.deepak.java.problems.Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, find the permutation of characters
 * 
 * @author Deepak
 */
public class Problem_08 {

	/**
	 * Method to get permutations of the string 
	 * 
	 * @param str
	 * @return {@link List<String>}
	 */
	public static List<String> getPermutations(String str) {
		List<String> result = new ArrayList<>();
		if (str.length() == 0) {
			result.add("");
			return result;
		}
		char first = str.charAt(0);
		List<String> words = getPermutations(str.substring(1));
		for (String word : words) {
			for (int i = 0; i <= word.length(); i++) {
				result.add(insertCharAt(word, first, i));
			}
		}
		return result;
	}
	
	private static String insertCharAt(String word, char first, int i) {
		String start = word.substring(0, i);
		String end = word.substring(i);
		return start + first + end;
	}

	public static void main(String[] args) {
		List<String> result = getPermutations("abc");
		for (String str : result) {
			System.out.println(str);
		}
	}
}
