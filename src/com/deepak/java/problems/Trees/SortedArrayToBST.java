/**
 * JavaProblems
 * SortedArrayToBST.java
 */
package com.deepak.java.problems.Trees;

/**
 * <br> Problem Statement :
 * Convert a given sorted array to BST
 * </br>
 * 
 * @author Deepak
 */
public class SortedArrayToBST {
	
	/**
	 * Converts the array to BST and returns the root node
	 * 
	 * @param array - Array passed in the input
	 * @return {@link TreeNode} - Root node of the tree
	 */
	public static TreeNode convertToBST(int[] array) {
		if (array.length == 0) {
			return null;
		}
		return convertToBST(array, 0, array.length - 1);
	}

	/**
	 * Converts the array to BST
	 * 
	 * @param array - Array passed to the method
	 * @param start - Start index from where conversion has to happen
	 * @param end - End index from where conversion should stop
	 * @return {@link TreeNode} - Node of the BST
	 */
	private static TreeNode convertToBST(int[] array, int start, int end) {
		if (start > end) {
			return null;
		}
		if (start == end) {
			return new TreeNode(array[start]);
		}
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(array[mid]);
		root.left = convertToBST(array, start, mid - 1);
		root.right = convertToBST(array, mid + 1, end);
		return root;
	}

}
