/**
 * JavaProblems
 * Problem_17.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * For each node in a binary search tree, create a new duplicate node, and
 * insert the duplicate as the left child of the original node. The resulting
 * tree should still be a binary search tree.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_17 {

	/**
	 * Method to create a double tree 
	 * 
	 * @param root
	 * @return {@link TreeNode<T>}
	 */
	public static <T> TreeNode<T> doubleTree(TreeNode<T> root) {
		/* If root is null, return null */
		if (root == null) {
			return null;
		}
		/* Create a double tree for both left and right sub trees */
		doubleTree(root.getLeft());
		doubleTree(root.getRight());
		/* Create a duplicate node of root node */
		TreeNode<T> duplicate = new TreeNode<T>(root.getData());
		/* Duplicate's left becomes root's left */
		duplicate.setLeft(root.getLeft());
		/* Root's left becomes duplicate */
		root.setLeft(duplicate);
		return root;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(4);
		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
		root.setLeft(node1);
		root.setRight(node2);
		TreeNode<Integer> doubleTree = doubleTree(root);
		System.out.println(doubleTree.getData());
		System.out.println(doubleTree.getLeft().getData());
		System.out.println(doubleTree.getRight().getData());
	}

}
