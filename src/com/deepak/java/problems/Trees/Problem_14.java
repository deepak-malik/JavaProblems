/**
 * JavaProblems
 * Problem_14.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Check if a given tree is a Sum Tree?
 * Sum Tree is one, where each node is equal to sum of nodes on left and right.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_14 {

	/**
	 * Method to check if a given tree is sum tree
	 * 
	 * @param root
	 * @return {@link boolean}
	 */
	public static boolean isSumTree(TreeNode<Integer> root) {
		/* If root is null, it is a sum tree */
		if (root == null) {
			return true;
		}
		/* Find individual sum of left subtree and right subtree */
		int leftSum = 0, rightSum = 0;
		if (root.getLeft() != null) {
			leftSum = findSum(root.getLeft());
		}
		if (root.getRight() != null) {
			rightSum = findSum(root.getRight());
		}
		/* Check if left sum and right sum addition leads to root's value.
		 * This check is not to be performed if root is a leaf node */
		if (leftSum + rightSum != root.getData() && !isLeaf(root)) {
			return false;
		}
		/* Check recursively for left and right sub tree */
		return isSumTree(root.getLeft()) && isSumTree(root.getRight());
	}

	/**
	 * Method to check if a given node is a leaf node 
	 * 
	 * @param node
	 * @return {@link boolean}
	 */
	private static boolean isLeaf(TreeNode<Integer> node) {
		/* If node is null, it is not a leaf node */
		if (node == null) {
			return false;
		}
		/* If a node contains no left or right child. It is a leaf node */
		return node.getLeft() == null && node.getRight() == null;
	}

	/**
	 * Method to find sum of the tree from a given node 
	 * 
	 * @param root
	 * @return {@link int}
	 */
	private static int findSum(TreeNode<Integer> root) {
		/* If root is null, return 0 */
		if (root == null) {
			return 0;
		}
		/* If both left and right child are null, return the value at node */
		if (root.getLeft() == null && root.getRight() == null) {
			return root.getData();
		}
		/* Find sum recursively for left and right sub tree */
		return root.getData() + findSum(root.getLeft()) + findSum(root.getRight());
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(26);
		TreeNode<Integer> node1 = new TreeNode<Integer>(10);
		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
		TreeNode<Integer> node3 = new TreeNode<Integer>(4);
		TreeNode<Integer> node4 = new TreeNode<Integer>(6);
		TreeNode<Integer> node5 = new TreeNode<Integer>(3);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setRight(node5);
		System.out.println(isSumTree(root));
	}

}
