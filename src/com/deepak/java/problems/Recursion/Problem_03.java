package com.deepak.java.problems.Recursion;

import java.util.HashSet;

/**
 * Given an array of ints, is it possible to choose a group of some of the ints, 
 * such that the group sums to the given target? 
 * 
 * @author Deepak
 */
public class Problem_03 {
	
	/**
	 * Method to check if pair exists
	 * 
	 * @param array
	 * @param target
	 * @return {@link boolean}
	 */
	public static boolean groupSum_Iterative(int[] array, int target) {
		/* If array is null or target < 0 */
		if (array == null || target <= 0) {
			return false;
		}
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			int complement = target - array[i];
			if (set.contains(array[i])) {
				return true;
			} else {
				set.add(complement);
			}
		}
		return false;
	}
	
	/**
	 * Method to find the group of integers in array which sums to target
	 *  
	 * @param array
	 * @param target
	 * @return {@link boolean}
	 */
	public static boolean groupSum(int[] array, int target) {
		return groupSum(array, 0, target);
	}

	/**
	 * Method to group sum
	 * 
	 * @param array
	 * @param start
	 * @param target
	 * @return {@link boolean}
	 */
	private static boolean groupSum(int[] array, int start, int target) {
		/* If there are no numbers left, then only possible solution
		 * will be - when target == 0 */
		if (array.length == start) {
			return target == 0;
		}
		/* There are 2 cases here now, 
		 * 		1. Move to the next position and reduce the target (When array[start] is chosen)
		 * 		2. Move to the next position with same target (When array[start] is not chosen) */
		return groupSum(array, start + 1, target - array[start]) ||
				groupSum(array, start + 1, target);
	}
	
	public static void main(String[] args) {
		System.out.println(groupSum(new int[] {1, 4, 8, 9}, 12));
		System.out.println(groupSum_Iterative(new int[] {1, 4, 8, 9}, 12));
		System.out.println(groupSum_Iterative(new int[] {1, 4, 8, 9}, 14));
	}
}
