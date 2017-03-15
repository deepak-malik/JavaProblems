/**
 * JavaProblems
 * Problem_04.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Check if a given tree is BST
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to check if a given tree is BST
	 * 
	 * @param root
	 * @return {@link boolean}
	 */
	public static boolean isBST(TreeNode<Integer> root) {
		return isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	/**
	 * Method to check if a given tree is BST
	 * 
	 * @param node
	 * @param max
	 * @param min
	 * @return {@link boolean}
	 */
	private static boolean isBST(TreeNode<Integer> node, int max, int min) {
		/* If node is null, it is BST */
		if (node == null) {
			return true;
		}
		/* If current node's data crosses min and max bound, it is not BST */
		if (node.getData() <= min || node.getData() > max) {
			return false;
		}
		/* Check recursively for left subtree and right subtree */
		return isBST(node.getLeft(), node.getData(), min) &&
				isBST(node.getRight(), max, node.getData());
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
		System.out.println(isBST(root));
	}

}
