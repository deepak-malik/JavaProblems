/**
 * JavaProblems
 * Problem_08.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Find lowest common ancestor in a BST
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_08 {

	/**
	 * Method to find LCA in a binary search tree
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
		/* If root is greater then max of 2 input nodes, check LCA in left subtree, else
		 * check in right subtree, else return root */
		if (root.getData() > Math.max(node1.getData(), node2.getData())) {
			return findLCA(root.getLeft(), node1, node2);
		} else if (root.getData() < Math.min(node1.getData(), node2.getData())) {
			return findLCA(root.getRight(), node1, node2);
		} else {
			return root;
		}
	}
	
	public static void main(String[] args) {
		TreeNode<Integer> root1 = new TreeNode<Integer>(4);
		TreeNode<Integer> node1 = new TreeNode<Integer>(1);
		TreeNode<Integer> node2 = new TreeNode<Integer>(5);
		TreeNode<Integer> node3 = new TreeNode<Integer>(8);
		root1.setLeft(node1);
		root1.setRight(node2);
		node2.setRight(node3);
		System.out.println(findLCA(root1, node1, node3).getData());
	}

}
