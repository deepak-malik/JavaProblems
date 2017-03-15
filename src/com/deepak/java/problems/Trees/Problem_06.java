/**
 * JavaProblems
 * Problem_06.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Check if two trees are same, given root of both the trees
 *
 * </br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to check if two trees are same
	 * 
	 * @param root1
	 * @param root2
	 * @return {@link boolean}
	 */
	public static <T> boolean areSame(TreeNode<T> root1, TreeNode<T> root2) {
		/* If both roots are null, they are same */
		if (root1 == null && root2 == null) {
			return true;
		}
		/* If one of them is null, they are not same */
		if (root1 == null || root2 == null) {
			return false;
		}
		/* Compare the data from current nodes and check recursively 
		 * for left and right subtree */
		return root1.getData() == root2.getData() &&
				areSame(root1.getLeft(), root2.getLeft()) &&
				areSame(root1.getRight(), root2.getRight());
	}

	public static void main(String[] args) {
		TreeNode<Integer> root1 = new TreeNode<Integer>(4);
		TreeNode<Integer> root2 = new TreeNode<Integer>(4);
		TreeNode<Integer> node1 = new TreeNode<Integer>(1);
		TreeNode<Integer> node2 = new TreeNode<Integer>(5);
		TreeNode<Integer> node3 = new TreeNode<Integer>(8);
		root1.setLeft(node1);
		root2.setLeft(node1);
		root1.setRight(node2);
		root2.setRight(node2);
		node2.setRight(node3);
		System.out.println(areSame(root1, root2));
	}

}
