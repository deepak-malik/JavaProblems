package com.deepak.java.problems.Strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a dictionary of words, and a string, tell whether
 * an input string can be completely segmented into dictionary words.
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to check if a string can be segmented to a given words in dict
	 *  
	 * Time Complexity : O(n^2)
	 * Space Complexity : O(n^2) 
	 *  
	 * @param dict
	 * @param str
	 * @return {@link}
	 */
	public static boolean canSegment(Set<String> dict, String str) {
		Set<String> solved = new HashSet<>();
		return canSegment(dict, str, solved);
	}

	private static boolean canSegment(Set<String> dict, String str, Set<String> solved) {
		for (int i = 1; i < str.length(); i++) {
			String first = str.substring(0, i);
			if (dict.contains(first)) {
				String second = str.substring(i);
				if (second == null || second.length() == 0 || dict.contains(second)) {
					return true;
				}
				if (!solved.contains(second)) {
					if (canSegment(dict, second, solved)) {
						return true;
					}
					solved.add(second);
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Set<String> dict = new HashSet<>();
		dict.add("apple");
		dict.add("pear");
		dict.add("pier");
		dict.add("pie");
		System.out.println(canSegment(dict, "applepie"));
	}
	
}
