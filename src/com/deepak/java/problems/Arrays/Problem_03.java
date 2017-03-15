/**
 * JavaProblems
 * Problem_03.java
 */
package com.deepak.java.problems.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <br> Problem Statement :
 * 
 * Given an array of integers, return indices of the two numbers,
 * such that they add up to a specific target. You may assume that
 * each input would have exactly one solution, and you may not use 
 * the same element twice.
 * 
 * Example : Given numbers = [2, 7, 11, 15] and target = 9
 * Output : [0, 1]
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {
	
	public static void main(String[] args) {
		int[] arr = new int[]{2, 7, 11, 13};
		System.out.println(Arrays.toString(towSum_Sorted(arr, 19)));
	}
	
	public static int[] towSum_Sorted(int[] array, int target) {
		if (array == null || array.length <= 1) {
			return new int[]{-1, -1};
		}
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			if ((array[low] + array[high]) == target) {
				break;
			} else if ((array[low] + array[high]) > target) {
				high--;
			} else {
				low++;
			}
		}
		return new int[]{low, high};
	}

	public static int[] twoSum_NotSorted(int[] array, int target) {
		/* Array should not be null and should have at least 2 elements */
		if (array == null || array.length <= 1) {
			return new int[]{-1, -1};
		}
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(target - array[i])) {
				result[1] = i;
				result[0] = map.get(target - array[i]);
				return result;
			}
			/* Handle duplicates */
			if (map.containsKey(array[i])) {
				continue;
			}
			map.put(array[i], i);
		}
		return result;
	}
	
}
