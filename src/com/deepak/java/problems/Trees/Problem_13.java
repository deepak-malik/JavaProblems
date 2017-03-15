/**
 * JavaProblems
 * Problem_13.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Find the closest value to a given number in a BST
 * where each node is of type integer.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_13 {

	/**
	 * Method to find the closest node to a given node
	 * 
	 * @param root
	 * @param node
	 * @return {@link TreeNode<Integer>}
	 */
	public static TreeNode<Integer> findClosest(TreeNode<Integer> root, TreeNode<Integer> node) {
		/* If root is null or node is null, no need to process further */
		if (root == null || node == null) {
			return null;
		}
		/* Find inOrder predecessor and successor */
		TreeNode<Integer> inOrderPredecessor = Problem_11.inOrderPredecessor(root, node);
		TreeNode<Integer> inOrderSuccessor = Problem_12.inOrderSuccessor(root, node);
		/* If predecessor is null, return successor else vice versa */
		if (inOrderPredecessor == null) {
			return inOrderSuccessor;
		}
		if (inOrderSuccessor == null) {
			return inOrderPredecessor;
		}
		/* If both have values, check the difference in values.
		 * If both differences are same, return any one */
		if ((node.getData() - inOrderPredecessor.getData()) < (inOrderSuccessor.getData() - node.getData())) {
			return inOrderPredecessor;
		}
		return inOrderSuccessor;
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
		System.out.println(findClosest(root, node6));
	}

}
