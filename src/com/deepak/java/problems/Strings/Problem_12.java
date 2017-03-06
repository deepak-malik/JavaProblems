/**
 * JavaProblems
 * Problem_12.java
 */
package com.deepak.java.problems.Strings;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <br> Problem Statement :
 * 
 * Read a file from the given path and return line, word and character count
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_12 {

	/**
	 * Method to count lines, words and characters in a given file 
	 * 
	 * Time Complexity : O(l*w) => Where l is number of lines and w is words in each line
	 * Space Complexity : O(n)
	 * 
	 * @param filePath
	 * @return {@link Map<String, Integer>}
	 */
	public static Map<String, Integer> countLineWordAndChar(String filePath) {
		/* If File path is null, no count */
		if (filePath == null) {
			return null;
		}
		/* Map to store results. Initially all counts will be 0 */
		Map<String, Integer> result = new HashMap<>();
		Scanner sc = null;
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		try {
			File file = new File(filePath);
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				/* Read each line, increase line count,
				 * count number of words and characters */
				String line = sc.nextLine();
				lineCount++;
				String[] words = line.split(" ");
				wordCount += words.length; 
				for (String word : words) {
					charCount += word.length();
				}
			}
			result.put("lineCount", lineCount);
			result.put("wordCount", wordCount);
			result.put("charCount", charCount);
		} catch (IOException e) {
			/* Exception while reading a file */
			e.printStackTrace();
		} finally {
			/* Close the scanner */
			if (sc != null) {
				sc.close();
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Map<String, Integer> result = countLineWordAndChar("/Users/Deepak/Documents/Splunk_Queries.txt");
		System.out.println("Lines => " + result.get("lineCount"));
		System.out.println("Words => " + result.get("wordCount"));
		System.out.println("Characters => " + result.get("charCount"));
	}

}
