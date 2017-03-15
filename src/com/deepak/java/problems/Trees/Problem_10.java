/**
 * JavaProblems
 * Problem_10.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path 
 * such that adding up all the values along the path equals the given sum.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_10 {

	/**
	 * Method to check if there is a path from root 
	 * to leaf that adds up to given sum
	 * 
	 * @param root
	 * @param sum
	 * @return {@link boolean}
	 */
	public static boolean hasPathSum(TreeNode<Integer> root, int sum) {
		/* If root is null, no path exists */
		if (root == null) {
			return false;
		}
		/* If root's left and right are null and root's value is sum,
		 * we have found the path i.e just root */
		if (root.getLeft() == null && root.getRight() == null && root.getData() == sum) {
			return true;
		}
		/* Check recursively on left side and right side */
		return hasPathSum(root.getLeft(), sum - root.getData()) || 
				hasPathSum(root.getRight(), sum - root.getData());
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(3);
		TreeNode<Integer> node1 = new TreeNode<Integer>(6);
		TreeNode<Integer> node2 = new TreeNode<Integer>(8);
		TreeNode<Integer> node3 = new TreeNode<Integer>(2);
		TreeNode<Integer> node4 = new TreeNode<Integer>(11);
		TreeNode<Integer> node5 = new TreeNode<Integer>(13);
		TreeNode<Integer> node6 = new TreeNode<Integer>(9);
		TreeNode<Integer> node7 = new TreeNode<Integer>(5);
		TreeNode<Integer> node8 = new TreeNode<Integer>(7);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node4.setLeft(node6);
		node4.setRight(node7);
		node2.setRight(node5);
		node5.setLeft(node8);
		System.out.println(hasPathSum(root, 25));
		System.out.println(hasPathSum(root, 26));
	}

}
