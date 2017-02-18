package com.deepak.java.problems.Recursion;

/**
 * Given a string and a non-empty substring sub, 
 * compute recursively the number of times that 
 * sub appears in the string, without the sub 
 * strings overlapping.
 *  
 * @author Deepak
 */
public class Problem_09 {

	/**
	 * Method to count the occurrences of sub string in a main string
	 * 
	 * @param str
	 * @param sub
	 * @return {@link int}
	 */
	public static int countOccurence(String str, String sub) {
		if (str == null || str.isEmpty() || sub.length() > str.length()) {
			return 0;
		}
		if (str.indexOf(sub) == -1) {
			return 0;
		} else {
			return 1 + countOccurence(str.substring(str.indexOf(sub) + sub.length()), sub);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(countOccurence("catcowcat", "cat"));
		System.out.println(countOccurence("catcowcat", "cow"));
		System.out.println(countOccurence("catcowcat", "dog"));
	}

}
