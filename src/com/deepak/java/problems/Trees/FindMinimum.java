/**
 * JavaProblems
 * FindMinimum.java
 */
package com.deepak.java.problems.Trees;

/**
 * <br> Problem Statement :
 * Given a BST root node, find minimum value in Tree
 * </br>
 * 
 * @author Deepak
 */
public class FindMinimum {

	/**
	 * Method to find the minimum value of a BST.
	 * Since this is BST, We know that minimum value will be at the extreme left.
	 * 
	 * @param root - Root of the tree node
	 * @return {@link int} - Minimum Value
	 */
	public static int findMinimum(TreeNode root) {
		TreeNode node = root;
		/* If root is null, then tree is empty. Return 0*/
		if (node == null) {
			return 0;
		}
		while (node.left != null) {
			node = node.left;
		}
		return node.value;
	}

}
