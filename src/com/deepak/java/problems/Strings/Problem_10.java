package com.deepak.java.problems.Strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Reverse vowels in a given string
 * 
 * @author Deepak
 */
public class Problem_10 {

	/**
	 * Method to reverse the vowels 
	 * 
	 * @param input
	 * @return {@link String}
	 */
	public static String reverseVowels(String input) {
		if (input == null || input.length() == 0) {
			return null;
		}
		char[] array = input.toCharArray();
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		for (int i = 0, j = array.length - 1; i < j; ) {
			if (!vowels.contains(array[i])) {
				i++;
				continue;
			}
			if (!vowels.contains(array[j])) {
				j--;
				continue;
			}
			/* If found, swap */
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(array);
	}
	
	public static void main(String[] args) {
		System.out.println(reverseVowels("Deepak Malik"));
	}
	
}
