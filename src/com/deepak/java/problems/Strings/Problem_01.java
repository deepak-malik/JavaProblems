/**
 * JavaProblems
 * Problem_01.java
 */
package com.deepak.java.problems.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Anagram : Two words are said to be anagrams, if they have same number of characters,
 * but are arranged at different places in both the words
 * 
 * There are lot of variations to this problem. Some of them are discussed below 
 * 	1. Given 2 words, find if they are anagram of each other
 * 	2. Generate all possible anagrams of a given word, anagram generated may not be a valid dictionary word.
 * 	3. Generate all possible anagrams of a given word, anagram generated has to be a valid dictionary word. 
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Check if 2 words are anagram of each other
	 * 
	 * Approach : This is a brute force approach, where we can pick up a character
	 * from the first word and check it's existence in the second word. 
	 * How do we handle duplicates here? Also time complexity will be O(n^2) where
	 * n is the number of characters in the word (Both words are of same length, so n)
	 * 
	 * A slightly better way could be, take first word and push the character and it's
	 * count in a map. Keep doing this for all the characters in the first word. Now for
	 * second word, start reducing the count. At the end, count should be 0 because both
	 * of the words should have same set of characters.
	 * This approach will be,
	 * Time Complexity : O(n) because we will be checking each character in both the words.
	 * Remember this will be 2 for loops one after the other. We don't have nested loops here. 
	 * Space Complexity : O(n) because we will be adding all the characters in the hash map.
	 * 
	 * @param word1
	 * @param word2
	 * @return {@link boolean} - True, if anagram 
	 */
	public static boolean isAnagram_BruteForce(String word1, String word2) {
		/* Basic validations on both the words */
		if (word1.isEmpty() || word2.isEmpty() || word1 == null || word2 == null || word1.length() != word2.length()) {
			return false;
		}
		HashMap<Character, Integer> countMap = new HashMap<>();
		/* Process each character from first word */
		for (int i = 0; i < word1.length(); i++) {
			char wordChar = word1.charAt(i);
			/* If map contains that character, increase the count else add 
			 * the character and make count as 1 */
			if (countMap.containsKey(wordChar)) {
				countMap.put(wordChar, countMap.get(wordChar) + 1);
			} else {
				countMap.put(wordChar, 1);
			}
		}
		/* Process each character from second word */
		for (int i = 0; i < word2.length(); i++) {
			char wordChar = word2.charAt(i);
			/* If map contains the character, reduce the count */
			if (countMap.containsKey(wordChar)) {
				countMap.put(wordChar, countMap.get(wordChar) - 1);
			} else {
				return false;
			}
		}
		/* Check count map and ensure all values are 0 */
		for (Integer count : countMap.values()) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Check if 2 words are anagram of each other
	 * 
	 * Approach : This is a slightly better optimized approach. Here, we will
	 * run just one loop and add the indexes of all the characters from both the words.
	 * If indexes are same for both the words, it will be an anagram.
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * 
	 * Though time complexity is still O(n) which is same as brute force, but it is a bit 
	 * better running one for loop as compared to three loops in previous approach.
	 * 
	 * @param word1
	 * @param word2
	 * @return {@link boolean} - True, if anagram
	 */
	public static boolean isAnagram_Optimized(String word1, String word2) {
		/* Basic validations on both the words */
		if (word1.isEmpty() || word2.isEmpty() || word1 == null || word2 == null || word1.length() != word2.length()) {
			return false;
		}
		/* Two variables to store the sum of indexes of each word */
		int result1 = 0;
		int result2 = 0;
		/* Check for index of each word */
		for (int i = 0; i < word1.length(); i++) {
			result1 += word1.charAt(i);
			result2 += word2.charAt(i);
		}
		/* If result is same from both the indexes sum, they are anagram */
		return result1 == result2;
	}

	/**
	 * Generate all anagrams from a given word. Generated anagram may not be a valid word 
	 * Though anagrams have to be valid words as per definition, but here we are not considering it.
	 * In a way, this is finding all the permutations of a given word.
	 * 
	 * Approach : This will be a combination of recursion and iterative approach. 
	 * Take each character of the word, consider it as prefix and then find the 
	 * combinations of other characters.
	 *  
	 * @param word
	 * @return {@link List<String>} - List of anagrams
	 */
	public static List<String> generateAllAnagrams(String word) {
		/* If word is empty or null, no anagrams can be generated */
		if (word.isEmpty() || word == null) {
			return null;
		}
		/* Start generating the anagrams considering blank prefix */
		List<String> result = new ArrayList<>();
		result = generateAllAnagrams("", word);
		return result;
	}

	/**
	 * Generate all anagrams of a given word 
	 * 
	 * @param prefix
	 * @param word
	 * @return {@link List<String>} - List of anagrams
	 */
	private static List<String> generateAllAnagrams(String prefix, String word) {
		List<String> anagrams = new ArrayList<>();
		int length = word.length();
		/* If length of word is 0, just add the prefix to the list */
		if (length == 0) {
			anagrams.add(prefix);
		} else {
			/* Else check for each character and find the anagrams recursively */
			for (int i = 0; i < length; i++) {
				/* New prefix will be current prefix + next character */
				String newPrefix = prefix + word.charAt(i);
				/* New word will be all characters in the word except the current character */
				String newWord = word.substring(0, i) + word.substring(i + 1, length);
				/* Add all anagrams to the result */
				anagrams.addAll(generateAllAnagrams(newPrefix, newWord));
			}
		}
		return anagrams;
	}

	public static void main(String[] args) {
		List<String> result = generateAllAnagrams("Abc");
		for (String string : result) {
			System.out.println(string);
		}
	}

}
