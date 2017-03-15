/**
 * JavaProblems
 * Problem_12.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Find InOrder Successor in a BST.
 * 
 * Successor - Left most element in the right subtree
 * i.e element just bigger then the given node.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_12 {

	/**
	 * Method to find InOrder successor of a given node 
	 * 
	 * @param root
	 * @param node
	 * @return {@link TreeNode<Integer>}
	 */
	public static TreeNode<Integer> inOrderSuccessor(TreeNode<Integer> root, TreeNode<Integer> node) {
		/* If root is null or node is null, no successor exists */
		if (root == null || node == null) {
			return null;
		}
		/* Find successor i.e node with min value in the right sub tree */
		TreeNode<Integer> successorNode = findMinValue(node.getRight());
		if (successorNode != null) {
			return successorNode;
		}
		/* If successor node is not found, 
		 * Successor lies somewhere between root and this node */
		while (root != null) {
			/* If node's data is less then root's data,
			 * we have to search in left subtree, else right 
			 * If we go towards left any time, root becomes successor */
			if (node.getData() < root.getData()) {
				successorNode = root;
				root = root.getLeft();
			} else {
				root = root.getRight();
			}
		}
		return successorNode;
	}

	/**
	 * Method to find the min value node when a node is given
	 * 
	 * @param root
	 * @return {@link TreeNode<Integer>}
	 */
	private static TreeNode<Integer> findMinValue(TreeNode<Integer> root) {
		/* If root is null, no max value exists */
		if (root == null) {
			return null;
		}
		/* Keep going left, because min value will be the extreme
		 * left most node */
		while (root.getLeft() != null) {
			root = root.getLeft();
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
		System.out.println(inOrderSuccessor(root, node7));
	}

}
