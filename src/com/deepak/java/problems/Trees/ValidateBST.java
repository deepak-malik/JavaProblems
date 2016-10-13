/**
 * JavaProblems
 * ValidateBST.java
 */
package com.deepak.java.problems.Trees;

/**
 * <br> Problem Statement :
 * Check if a given BST is valid
 * 
 * NOTE : Empty tree or tree with 
 * just one node is considered as BST
 * </br>
 * 
 * @author Deepak
 */
public class ValidateBST {
	
	/**
	 * Main method to test the algorithm
	 * 
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
		boolean isValidBST = validateBST(binarySearchTree.getRoot());
		System.out.println("\nIs valid BST => " + isValidBST);
	}

	/**
	 * A BST will be considered as valid if left node 
	 * <= root node and right node > root node
	 * 
	 * @param root - Root node of the Tree
	 * @return {@link boolean} - True, if BST
	 */
	public static boolean validateBST(TreeNode root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/**
	 * Returns true, if a given BST is valid
	 * 
	 * @param node - Node of the tree
	 * @param minValue - Minimum value possible in the tree
	 * @param maxValue - Maximum value possible in a tree
	 * @return {@link boolean} - True, if tree is BST
	 */
	private static boolean isBST(TreeNode node, int minValue, int maxValue) {
		if (node == null) { /* Empty tree is BST */
			return true;
		}
		/* False if node violates min and max constraints */
		if (node.value < minValue || node.value > maxValue) {
			return false;
		}
		/* Check left and right subtree recursively */
		return isBST(node.left, minValue, node.value) &&
				isBST(node.right, node.value + 1, maxValue);
	}

}
