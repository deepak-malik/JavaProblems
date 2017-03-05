/**
 * JavaProblems
 * Problem_30.java
 */
package com.deepak.java.problems.Math;

import java.util.Arrays;

/**
 * <br> Problem Statement :
 * 
 * Given an array of n integers where n > 1, nums, return an array output 
 * such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * 
 * For example, given [1,2,3,4], return [24,12,8,6].
 * 
 * Follow up:
 * Could you solve it with constant space complexity? 
 * (Note: The output array does not count as extra space 
 * for the purpose of space complexity analysis.)
 *  
 * </br>
 * 
 * @author Deepak
 */
public class Problem_30 {

	/**
	 * Method to calculate product of array except self
	 * 
	 * Approach : Given numbers [1, 2, 3, 4], regarding the third number 3, 
	 * the product of array except 3 is 1*2*4 which consists of two parts: 
	 * left 1*2 and right 4. The product is left*right. We can get lefts and rights:
	 * Numbers:     1    	2    3     4
	 * Lefts:            	1    1*2   1*2*3
	 * Rights:  	2*3*4   3*4  4      
	 * 
	 * Let’s fill the empty with 1:
	 * 
	 * Numbers:     1    	2    3     4
	 * Lefts:       1    	1    1*2   1*2*3
	 * Rights:  	2*3*4   3*4  4     1
	 * 
	 * We can calculate lefts and rights in 2 loops. The time complexity is O(n).
	 * We store lefts in result array. If we allocate a new array for rights. 
	 * The space complexity is O(n). To make it O(1), 
	 * we just need to store it in a variable which is right in code.
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * 
	 * @param nums
	 * @return {@link int[]}
	 */
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		/* Calculate lefts and store in res. */
		int left = 1;
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				left = left * nums[i - 1];
			}
			res[i] = left;
		}
		/* Calculate rights and the product from the end of the array */
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			if (i < n - 1) {
				right = right * nums[i + 1];
			}
			res[i] *= right;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
	}

}
