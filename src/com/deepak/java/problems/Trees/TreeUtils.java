/**
 * JavaProblems
 * TreeUtils.java
 */
package com.deepak.java.problems.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Class to hold utility methods
 * 
 * @author Deepak
 */
public abstract class TreeUtils {
	
	/**
	 * Prints the tree level by level
	 * @param root
	 */
	public static void traverseLevelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
 		int levelNodes = 0; 
		if (root == null) {
			return;
		}
		queue.add(root);
 		while (!queue.isEmpty()) {
 			levelNodes = queue.size();
 			while (levelNodes > 0) {
				TreeNode node = (TreeNode)queue.remove();
				System.out.print(node.value + " ");
				if (node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
					queue.add(node.right);
				}
				levelNodes--;
			}
			System.out.println("");
		}
	}

}
