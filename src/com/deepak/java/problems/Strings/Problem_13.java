/**
 * JavaProblems
 * Problem_13.java
 */
package com.deepak.java.problems.Strings;

/**
 * <br> Problem Statement :
 * 
 * Given a string s, find the longest palindromic subsequence's length in s. 
 * You may assume that the maximum length of s is 1000.
 * 
 * Example 1:
 * 
 * Input: "bbbab"
 * Output: 4
 * One possible longest palindromic subsequence is "bbbb".
 * 
 * Example 2:
 * 
 * Input: "cbbd"
 * Output: 2
 * One possible longest palindromic subsequence is "bb".
 * 
 * @author Deepak
 */
public class Problem_13 {
	
	public static int lengthOfLongestPalindromicSubSeq(String str) {
		int n = str.length();
		int[][] dp = new int[n][n];
		for (int i = n - 1; i >= 0; i--) {
			dp[i][i] = 1;
			for (int j = i + 1; j < n; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					dp[i][j] = dp[i + 1][j - 1] + 2;
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[0][n - 1];
	}
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestPalindromicSubSeq("bbbab"));
	}

}
