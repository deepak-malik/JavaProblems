/**
 * JavaProblems
 * Problem_18.java
 */
package com.deepak.java.problems.Trees;

import java.util.Comparator;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Check if a given node exists in the binary search tree.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_18 {

	/**
	 * Method to lookup an item in BST
	 * 
	 * @param root
	 * @param nodeToBeSearched
	 * @param comparator
	 * @return {@link boolean}
	 */
	public static <T> boolean lookup(TreeNode<T> root, TreeNode<T> nodeToBeSearched, Comparator<T> comparator) {
		/* If root is null, element does not exists */
		if (root == null) {
			return false;
		}
		/* Compare the nodes and get the value */
		int compared = comparator.compare(root.getData(), nodeToBeSearched.getData());
		/* If 0, values matches, else we have to look up either
		 * in left subtree or right subtree */
		if (compared == 0) {
			return true;
		}
		/* If value is less then 0, then check left subtree else right subtree*/
		if (compared < 0) {
			return lookup(root.getLeft(), nodeToBeSearched, comparator);
		} else {
			return lookup(root.getRight(), nodeToBeSearched, comparator);
		}
	}
	
}
