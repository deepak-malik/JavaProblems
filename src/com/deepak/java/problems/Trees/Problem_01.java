/**
 * JavaProblems
 * Problem_01.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Find height of binary tree
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to find the height of a given tree
	 * 
	 * @param root
	 * @return {@link int}
	 */
	public static <T> int height(TreeNode<T> root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.getLeft());
		int rightHeight = height(root.getRight());
		return 1 + Math.max(leftHeight, rightHeight);
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(10);
		TreeNode<Integer> node1 = new TreeNode<Integer>(6);
		TreeNode<Integer> node2 = new TreeNode<Integer>(17);
		TreeNode<Integer> node3 = new TreeNode<Integer>(3);
		TreeNode<Integer> node4 = new TreeNode<Integer>(12);
		TreeNode<Integer> node5 = new TreeNode<Integer>(23);
		TreeNode<Integer> node6 = new TreeNode<Integer>(19);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node5.setLeft(node6);
		System.out.println(height(root));
	}

}
