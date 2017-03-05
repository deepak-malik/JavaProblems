/**
 * JavaProblems
 * Problem_10.java
 */
package com.deepak.java.problems.Math;

import java.util.ArrayList;
import java.util.List;


/**
 * <br> Problem Statement :
 * 
 * Given n and k, find the kth permutation.
 * For ex, n = 3 i.e {1, 2, 3} and k = 4
 * 
 * Permutations will be, 
 * 	1. "123"
 * 	2. "132"
 * 	3. "213"
 * 	4. "231"
 * 	5. "312"
 * 	6. "321"
 * 
 * 4th Permutation will be 231 
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_10 {

	/**
	 * Method to find kth permutation 
	 * 
	 * Time Complexity : O(n^2)
	 * Space Complexity : O(n)
	 * 
	 * @param n
	 * @param k
	 * @return {@link String}
	 */
	public static String findKthPermutation(int n, int k) {
		List<Integer> numbers = new ArrayList<>();
		int[] factorial = new int[n + 1];
		StringBuilder builder = new StringBuilder();

		/* Create an array for factorial lookup 
		 * i.e {1, 1, 2, 6, 24, ..}*/
		int sum = 1;
		factorial[0] = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
			factorial[i] = sum;
		}

		/* Create a list of numbers to get indexes 
		 * {1, 2, 3, 4, ...}*/
		for (int i = 1; i <= n; i++) {
			numbers.add(i);
		}

		k--; /* Because it starts from 0 */
		for (int i = 1; i <= n; i++) {
			int index = k/factorial[n - i];
			builder.append(numbers.get(index));
			numbers.remove(index);
			k = k - (index * factorial[n - i]);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println(findKthPermutation(3, 4));
	}

}
