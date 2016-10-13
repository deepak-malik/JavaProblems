/**
 * JavaProblems
 * PredecessorAndSuccessor.java
 */
package com.deepak.java.problems.Trees;

/**
 * <br> Problem Statement :
 * Given a node in the tree, find the Predecessor
 * and Successor of a given node.
 * 
 * Note : Predecessor is the maximum value available
 * in left subtree and Successor is the minimum
 * value available in right subtree.
 * 
 * @author Deepak
 */
public class PredecessorAndSuccessor {
	
	/**
	 * Main method to test the algorithm
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addTreeNode(17);
		binarySearchTree.addTreeNode(11);
		binarySearchTree.addTreeNode(23);
		binarySearchTree.addTreeNode(71);
		binarySearchTree.addTreeNode(5);
		binarySearchTree.addTreeNode(7);
		binarySearchTree.addTreeNode(3);
		System.out.println("Printing Tree :");
		TreeUtils.traverseLevelOrder(binarySearchTree.getRoot());
		System.out.println("\nFinding predecessor");
		System.out.println(findPredecessor(binarySearchTree.getRoot().left));
		System.out.println("\nFinding successor");
		System.out.println(findSuccessor(binarySearchTree.getRoot()));
	}
	
	/**
	 * Returns the predecessor of a given node
	 * 
	 * @param node TreeNode
	 * @return {@link int} - Predecessor value
	 */
	public static int findPredecessor(TreeNode node) {
		if (node != null && node.left != null) {
			TreeNode nodeToStart = node.left;
			while (nodeToStart.right != null) {
				nodeToStart = nodeToStart.right;
			}
			return nodeToStart.value;
		}
		return 0;
	}
	
	/**
	 * Returns the successor of a given node
	 * 
	 * @param node TreeNode
	 * @return {@link int} - Successor value
	 */
	public static int findSuccessor(TreeNode node) {
		if (node != null && node.right != null) {
			TreeNode nodeToStart = node.right;
			while (nodeToStart.left != null) {
				nodeToStart = nodeToStart.left;
			}
			return nodeToStart.value;
		}
		return 0;
	}

}
