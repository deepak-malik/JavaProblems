/**
 * JavaProblems
 * Problem_03.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Find minimum and maximum in a BST
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to find minimum value in a BST
	 * Note : Iterative Approach
	 * 
	 * @param root
	 * @return {@link T}
	 */
	public static <T> T minValue_Iterative(TreeNode<T> root) {
		if (root == null) {
			return null;
		}
		while (root.getLeft() != null) {
			root = root.getLeft();
		}
		return root.getData();
	}

	/**
	 * Method to find minimum value in a BST
	 * Note : Recursive Approach
	 * 
	 * @param root
	 * @return {@link T}
	 */
	public static <T> T minValue_Recursive(TreeNode<T> root) {
		if (root == null) {
			return null;
		}
		if (root.getLeft() == null) {
			return root.getData();
		}
		return minValue_Recursive(root.getLeft());
	}

	/**
	 * Method to find maximum value in a BST
	 * Note : Iterative Approach
	 * 
	 * @param root
	 * @return {@link T}
	 */
	public static <T> T maxValue_Iterative(TreeNode<T> root) {
		if (root == null) {
			return null;
		}
		while (root.getRight() != null) {
			root = root.getRight();
		}
		return root.getData();
	}

	/**
	 * Method to find maximum value in a BST
	 * Note : Recursive Approach
	 * 
	 * @param root
	 * @return {@link T}
	 */
	public static <T> T maxValue_Recursive(TreeNode<T> root) {
		if (root == null) {
			return null;
		}
		if (root.getRight() == null) {
			return root.getData();
		}
		return maxValue_Recursive(root.getRight());
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
		System.out.println(minValue_Iterative(root));
		System.out.println(minValue_Recursive(root));
		System.out.println(maxValue_Iterative(root));
		System.out.println(maxValue_Recursive(root));
	}

}
