/**
 * JavaProblems
 * Problem_02.java
 */
package com.deepak.java.problems.Arrays;

import java.util.Arrays;

/**
 * <br> Problem Statement :
 * 
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 * 
 * For example,
 * Given [10, 9, 2, 5, 3, 7, 101, 18],
 * The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. 
 * Note that there may be more than one LIS combination, it is only necessary for you to return the length.
 *  
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to find length of longest increasing subsequence
	 * 
	 * Time Complexity : O(n log(n))
	 * Space Complexity : O(n)
	 * 
	 * @param nums
	 * @return {@link int}
	 */
	public static int lengthOfLIS(int[] nums) {
		/* If array is null or length is 0, return 0 */
		if (nums == null || nums.length == 0) {
			return 0;
		}
		/* Create a new array of same size */
		int[] dp = new int[nums.length];
		int length = 0;
		/* Check for each number and see if we have already evaluated it
		 * This can be done by using a binary search on DP array */
		for (int x : nums) {
			int i = Arrays.binarySearch(dp, 0, length, x);
			/* If i is negative do -(i + 1) */
			if (i < 0) {
				i = ~i;
			}
			/* Place that value in DP and if length is equal, increase it */
			dp[i] = x;
			if (i == length) {
				length++;
			}
		}
		return length;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
	}

}
