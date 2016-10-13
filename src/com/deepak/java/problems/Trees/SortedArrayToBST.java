/**
 * JavaProblems
 * SortedArrayToBST.java
 */
package com.deepak.java.problems.Trees;

/**
 * Convert sorted array to BST
 * @author Deepak
 */
public class SortedArrayToBST {

	/**
	 * Main method to test the algorithm
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {3, 5, 7, 11, 17, 23, 71};
		TreeNode root = convertToBST(array);
		TreeUtils.traverseLevelOrder(root);
	}

	/**
	 * Converts the array to BST and returns the root node
	 * 
	 * @param array
	 * @return
	 */
	public static TreeNode convertToBST(int[] array) {
		if (array.length == 0) {
			return null;
		}
		return convertToBST(array, 0, array.length - 1);
	}

	/**
	 * Converts the array to BST
	 * @param array
	 * @param start
	 * @param end
	 * @return
	 */
	private static TreeNode convertToBST(int[] array, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(array[mid]);
		root.left = convertToBST(array, start, mid - 1);
		root.right = convertToBST(array, mid + 1, end);
		return root;
	}

}
