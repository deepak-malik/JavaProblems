package com.deepak.java.problems.Recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * You are given a list of numbers and a target, Check if you can 
 * reach the target by using any arithmetic operation (+, -, *, /)
 * You can only traverse forward.
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to check if we can reach to target by 
	 * performing some operations on list of numbers
	 * 
	 * @param list
	 * @param target
	 * @return {@link boolean}
	 */
	public static boolean isReachableToTarget(List<Integer> list, int target) {
		/* If not valid list, return false */
		if (list == null || list.size() == 0) {
			return false;
		}
		int start = 0;
		int end = list.size() - 1;
		/* Get the results of all numbers */
		Set<Integer> result = getResults(list, start, end);
		/* Check if result contains the target */
		return result.contains(target);
	}

	/**
	 * Method to get the results of all operations on list of numbers 
	 * 
	 * @param list
	 * @param start
	 * @param end
	 * @return {@link Set<Integer>}
	 */
	private static Set<Integer> getResults(List<Integer> list, int start, int end) {
		Set<Integer> result = new HashSet<>();
		/* If start > end, return the empty result,
		 * or if there is only one element in the list, 
		 * there is no operation that can be performed, 
		 * so add that number to result and return */
		if (start > end) {
			return result;
		} else if (start == end) {
			result.add(list.get(start));
			return result;
		}
		/* Check for each number */
		for (int i = start; i < end; i++) {
			/* Try to find results of 2 numbers at a time */
			Set<Integer> result1 = getResults(list, start, i);
			Set<Integer> result2 = getResults(list, i + 1, end);
			for (int x : result1) {
				for (int y : result2) {
					result.add(x + y);
					result.add(x - y);
					result.add(x * y);
					if (y != 0) {
						result.add(x / y);
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		/* 1 + 4 = 5 and 5 * 6 = 30, so this is reachable */
		System.out.println(isReachableToTarget(Arrays.asList(4, 6), 24));
		/* 3 * 9 = 27 and 27 + 4 = 31 and 31 - 6 = 25, and
		 * 25 / 5 = 5, This is reachable */
		System.out.println(isReachableToTarget(Arrays.asList(3, 9, 4, 6, 5), 5));
		/* Not possible, even if we multiply all */
		System.out.println(isReachableToTarget(Arrays.asList(3, 9, 4, 6, 5), 84685));
	}

}
