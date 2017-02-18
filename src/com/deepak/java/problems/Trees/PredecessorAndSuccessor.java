/**
 * JavaProblems
 * PredecessorAndSuccessor.java
 */
package com.deepak.java.problems.Trees;

/**
 * <br> Problem Statement :
 * Given a BST and a node in it, find the Predecessor
 * and Successor of a given node.
 * This has to be InOrder
 * 
 * Note : Predecessor is the maximum value available
 * in left subtree and Successor is the minimum
 * value available in right subtree.
 * 
 * @author Deepak
 */
public class PredecessorAndSuccessor {
	
	/* InOrder -> Left -> Root > Right */
	public static int findPredecessor(TreeNode root, TreeNode node) {
		if (node == null) {
			return 0;
		}
		return 0;
	}
	
	public static TreeNode findInOrderSuccessor(TreeNode root, TreeNode node) {
		if (node == null) {
			return null;
		}
		/* Case 1 : When given node has right sub tree */
		if (node.right != null) {
			return findMinimum(node.right);
		}
		/* Case 2 : When given node does not have a right sub tree */
		TreeNode parent = findParent(node.value, root, null);
		while (parent != null && node == parent.right) {
			node = parent;
			parent = findParent(parent.value, root, parent);
		}
		return parent;
	}

	private static TreeNode findParent(int value, TreeNode root, TreeNode parent) {
		if (root == null) {
			return null;
		}
		if (value != root.value) {
			parent = findParent(value, root.left, root);
			if (parent == null) {
				parent = findParent(value, root.right, root);
			}
		}
		return parent;
	}

	private static TreeNode findMinimum(TreeNode node) {
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}
	
}
