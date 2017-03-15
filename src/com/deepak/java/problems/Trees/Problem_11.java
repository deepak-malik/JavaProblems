/**
 * JavaProblems
 * Problem_11.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Find InOrder Predecessor in a BST.
 * 
 * Predecessor - Right most element in the left subtree
 * i.e element just smaller then the given node.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_11 {

	/**
	 * Method to find InOrder predecessor of a given node 
	 * 
	 * @param root
	 * @param node
	 * @return {@link TreeNode<Integer>}
	 */
	public static TreeNode<Integer> inOrderPredecessor(TreeNode<Integer> root, TreeNode<Integer> node) {
		/* If root is null or node is null, no predecessor exists */
		if (root == null || node == null) {
			return null;
		}
		/* Find predecessor, i.e node with max value in left sub tree*/
		TreeNode<Integer> predecessorNode = findMaxValueNode(node.getLeft());
		/* If we found the value, return that node */
		if (predecessorNode != null) {
			return predecessorNode;
		}
		/* If left subtree does not have successor node, 
		 * we have to find it towards parent */
		while (root != null) {
			/* If node's data is greater then root data, 
			 * we have to search in right subtree else in left subtree */
			if (node.getData() > root.getData()) {
				/* Since we are moving to right sub tree, predecessor remains root */
				predecessorNode = root;
				root = root.getRight();
			} else {
				root = root.getLeft();
			}
		}
		return predecessorNode;
	}

	/**
	 * Method to find the max value node when a node is given
	 * 
	 * @param root
	 * @return {@link TreeNode<Integer>}
	 */
	private static TreeNode<Integer> findMaxValueNode(TreeNode<Integer> root) {
		/* If root is null, no max value exists */
		if (root == null) {
			return null;
		}
		/* Keep going right, because max value will be the extreme
		 * right most node */
		while (root.getRight() != null) {
			root = root.getRight();
		}
		return root;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(10);
		TreeNode<Integer> node1 = new TreeNode<Integer>(6);
		TreeNode<Integer> node2 = new TreeNode<Integer>(17);
		TreeNode<Integer> node3 = new TreeNode<Integer>(3);
		TreeNode<Integer> node4 = new TreeNode<Integer>(9);
		TreeNode<Integer> node5 = new TreeNode<Integer>(12);
		TreeNode<Integer> node6 = new TreeNode<Integer>(23);
		TreeNode<Integer> node7 = new TreeNode<Integer>(7);
		TreeNode<Integer> node8 = new TreeNode<Integer>(19);
		TreeNode<Integer> node9 = new TreeNode<Integer>(27);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node4.setLeft(node7);
		node2.setLeft(node5);
		node2.setRight(node6);
		node6.setLeft(node8);
		node6.setRight(node9);
		System.out.println(inOrderPredecessor(root, node7));
	}

}
