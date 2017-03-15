/**
 * JavaProblems
 * Problem_16
 */
package com.deepak.java.problems.Trees;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.deepak.java.problems.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given a BST, find the mode i.e. the value that occurs maximum number of times.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_16 {

	/**
	 * Method to find mode in a Binary Tree
	 * 
	 * @param root
	 * @return {@link T}
	 */
	public static <T> T findMode(TreeNode<T> root) {
		/* If root is null, return null */
		if (root == null) {
			return null;
		}
		/* Create a count map and populate it while traversing the tree */
		Map<T, Integer> countMap = new HashMap<>();
		countMap = populateMapWhileTraversing(root);
		/* Let root contains the item that occurred max number of times
		 * and it's occurrence is 1 as of now */
		int maxOccurences = 1;
		T mode = root.getData();
		/* Traverse through the map and find which item occurred max number of times */
		for (Map.Entry<T, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > maxOccurences) {
				mode = entry.getKey();
			}
		}
		return mode;
	}

	/**
	 * Method to populate hash map while traversing. 
	 * This could be a recursive approach as well.
	 * 
	 * @param root
	 * @return {@link Map<T, Integer>}
	 */
	private static <T> Map<T, Integer> populateMapWhileTraversing(TreeNode<T> root) {
		/* Map to hold result and stack to temporarily hold values of tree */
		Map<T, Integer> result = new HashMap<>();
		Stack<TreeNode<T>> stack = new Stack<>();
		stack.push(root);
		/* Keep traversing while stack is empty */
		while (!stack.isEmpty()) {
			/* Update hash map with this node */
			TreeNode<T> node = stack.pop();
			if (result.containsKey(node.getData())) {
				result.put(node.getData(), result.get(node.getData()) + 1);
			} else {
				result.put(node.getData(), 1);
			}
			/* Check for right and left node */
			if (node.getRight() != null) {
				stack.push(node.getRight());
			}
			if (node.getLeft() != null) {
				stack.push(node.getLeft());
			}
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(26);
		TreeNode<Integer> node1 = new TreeNode<Integer>(10);
		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
		TreeNode<Integer> node3 = new TreeNode<Integer>(4);
		TreeNode<Integer> node4 = new TreeNode<Integer>(6);
		TreeNode<Integer> node5 = new TreeNode<Integer>(3);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setRight(node5);
		System.out.println(findMode(root));
	}

}
