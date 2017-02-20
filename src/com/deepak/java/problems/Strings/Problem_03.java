package com.deepak.java.problems.Strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a String, Remove duplicate characters from it
 * 
 * @author Deepak
 */
public class Problem_03 {
	
	/**
	 * Method to remove duplicates from a string
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * 
	 * @param str
	 * @return {@link String}
	 */
	public static String removeDuplicates(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
			}
		}
		StringBuilder builder = new StringBuilder();
		for (Character c : set) {
			builder.append(c);
		}
		return builder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates("abbabcddbabcdeedebc"));
	}

}
