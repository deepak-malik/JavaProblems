package com.deepak.java.problems.Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a number, find the possible combinations of valid parenthesis
 * Ex. if n = 3, then output will be 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to generate parenthesis
	 * 
	 * @param n
	 * @return {@link List<String>}
	 */
	public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		dfs(result, "", n , n);
		return result;
	}

	/**
	 * Method to do DFS on the tree
	 * Here left and right mean number of remaining ( and ), that
	 * needs to be added. When left > right there are more ) needs to
	 * be added then (, and these cases are wrong and method will stop 
	 * 
	 * @param result
	 * @param str
	 * @param left
	 * @param right
	 */
	private static void dfs(List<String> result, String str, int left, int right) {
		if (left > right) {
			return;
		}
		/* Base case, when there are no left and right child */
		if (left == 0 && right == 0) {
			result.add(str);
			return;
		}
		/* If left has more then 0 number of braces, then add that */
		if (left > 0) {
			dfs(result, str + "(", left -1 , right);
		}
		/* If right has more then 0 number of braces, then add right */
		if (right > 0) {
			dfs(result, str + ")", left, right - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(String.join(",", generateParenthesis(1)));
		System.out.println(String.join(",", generateParenthesis(2)));
		System.out.println(String.join(",", generateParenthesis(3)));
	}

}
