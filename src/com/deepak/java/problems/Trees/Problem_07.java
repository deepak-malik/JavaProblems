/**
 * JavaProblems
 * Problem_07.java
 */
package com.deepak.java.problems.Trees;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Check if second tree is subtree of first one, 
 * given root's of both the trees
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_07 {

	/**
	 * Method to check if one tree is sub tree of another one
	 * 
	 * @param root1
	 * @param root2
	 * @return {@link boolean}
	 */
	public static <T> boolean isSubTree(TreeNode<T> root1, TreeNode<T> root2) {
		/* If both root1 and root2 are null, tree2 is subtree */
		if (root1 == null && root2 == null) {
			return true;
		}
		/* If just one of them is null, not a subtree */
		if (root1 == null || root2 == null) {
			return false;
		}
		/* If data of the root matches, keep checking data in both
		 * left subtree and right subtree. If data doesn't match,
		 * move to the left on tree1 or to the right on tree1 until
		 * we find a match */
		if (root1.getData() == root2.getData()) {
			return isSubTree(root1.getLeft(), root2.getLeft()) &&
					isSubTree(root1.getRight(), root2.getRight());
		} else {
			return isSubTree(root1.getLeft(), root2) ||
					isSubTree(root1.getRight(), root2);
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
		System.out.println(isSubTree(root1, node2));
	}

}
