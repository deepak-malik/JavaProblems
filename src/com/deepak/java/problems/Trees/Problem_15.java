/**
 * JavaProblems
 * Problem_15.java
 */
package com.deepak.java.problems.Trees;

/**
 * <br> Problem Statement :
 * 
 * Suppose you are building an N node binary search tree with the values 1..N.
 * How many structurally different binary search trees are there that store
 * those values? Write a recursive function that, given the number of distinct
 * values, computes the number of structurally unique binary search trees that
 * store those values.
 * 
 * For example, countTrees(4) should return 14, since there
 * are 14 structurally unique binary search trees that store 1, 2, 3, and 4.
 * 
 * @author Deepak
 *
 */
public class Problem_15 {

	/**
	 * Method to count number of trees possible with given number of keys
	 * 
	 * @param numKeys
	 * @return {@link long}
	 */
	public static <T> long countTrees(int numKeys) {
		/* If keys is 1 or less then 1, we can create only one key */
		if (numKeys <= 1) {
			return 1;
		}
		/* Let sum be 0, and check for number of trees 
		 * from 1 until we meet number of keys */
		long sum = 0L;
		for (int root = 1; root <= numKeys; root++) {
			sum += countTrees(root - 1) * countTrees(numKeys - root);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(countTrees(2));
	}

}
