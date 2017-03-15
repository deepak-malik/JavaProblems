/**
 * JavaProblems
 * Problem_08.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Find lowest common ancestor in a non BST
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_09 {

	/**
	 * Method to find LCA in a non binary search tree
	 * 
	 * @param root
	 * @param node1
	 * @param node2
	 * @return {@link TreeNode<Integer>}
	 */
	public static TreeNode<Integer> findLCA(TreeNode<Integer> root, TreeNode<Integer> node1, TreeNode<Integer> node2) {
		/* If root is null, no need to process further */
		if (root == null) {
			return null;
		}
		/* If at least one matched, no need to continue,
		 * This is LCA for these 2 nodes */
		if (root == node1 || root == node2) {
			return root;
		}
		/* Check recursively on left node and right node */
		TreeNode<Integer> leftNode = findLCA(root.getLeft(), node1, node2);
		TreeNode<Integer> rightNode = findLCA(root.getRight(), node1, node2);
		/* If both sides returned not null, then root is LCA */
		if (leftNode != null && rightNode != null) {
			return root;
		}
		/* If both sides are null, no LCA exists */
		if (leftNode == null && rightNode == null) {
			return null;
		}
		/* Finally, we return the node that is not null */
		return leftNode != null ? leftNode : rightNode;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(3);
		TreeNode<Integer> node1 = new TreeNode<Integer>(6);
		TreeNode<Integer> node2 = new TreeNode<Integer>(8);
		TreeNode<Integer> node3 = new TreeNode<Integer>(2);
		TreeNode<Integer> node4 = new TreeNode<Integer>(11);
		TreeNode<Integer> node5 = new TreeNode<Integer>(13);
		TreeNode<Integer> node6 = new TreeNode<Integer>(9);
		TreeNode<Integer> node7 = new TreeNode<Integer>(5);
		TreeNode<Integer> node8 = new TreeNode<Integer>(7);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node4.setLeft(node6);
		node4.setRight(node7);
		node2.setRight(node5);
		node5.setLeft(node8);
		System.out.println(findLCA(root, node3, node7).getData());
	}

}
