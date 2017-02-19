package com.deepak.java.problems.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given 2 strings, check if they are anagram
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to check if 2 strings are anagram
	 * 
	 * @param word1
	 * @param word2
	 * @return {@link boolean}
	 */
	public static boolean isAnagram_BruteForce(String word1, String word2) {
		if (word1 == null || word2 == null || word1.length() != word2.length()) {
			return false;
		}
		Map<Character, Integer> countMap = new HashMap<>();
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		for (int i = 0; i < word1.length(); i++) {
			if (countMap.containsKey(word1.charAt(i))) {
				countMap.put(word1.charAt(i), countMap.get(word1.charAt(i)) + 1);
			} else {
				countMap.put(word1.charAt(i), 1);
			}
		}
		for (int i = 0; i < word2.length(); i++) {
			if (countMap.containsKey(word2.charAt(i))) {
				countMap.put(word2.charAt(i), countMap.get(word2.charAt(i)) - 1);
			} else {
				return false;
			}
		}
		for (Integer value : countMap.values()) {
			if (value != 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Method to check if 2 strings are anagram
	 * 
	 * @param word1
	 * @param word2
	 * @return {@link boolean}
	 */
	public static boolean isAnagram_Optimized(String word1, String word2) {
		if (word1 == null || word2 == null || word1.length() != word2.length()) {
			return false;
		}
		/* 2 strings are anagram if there product is equal */
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		int result1 = 0;
		int result2 = 0;
		for (int i = 0; i < word1.length(); i++) {
			int index1 = word1.charAt(i);
			int index2 = word2.charAt(i);
			result1 += index1;
			result2 += index2;
		}
		if (result1 == result2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isAnagram_BruteForce("Iceman", "Cinema"));
		System.out.println(isAnagram_Optimized("Iceman", "Cinema"));
	}

}
