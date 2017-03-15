/**
 * JavaProblems
 * Problem_02.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Find size of binary tree i.e number of nodes
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to find the size of a binary tree
	 * 
	 * @param root
	 * @return {@link int}
	 */
	public static <T> int size(TreeNode<T> root) {
		if (root == null) {
			return 0;
		}
		return 1 + size(root.getLeft()) + size(root.getRight());
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
		System.out.println(size(root));
	}

}
