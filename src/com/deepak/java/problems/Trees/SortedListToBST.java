/**
 * JavaProblems
 * SortedListToBST.java
 */
package com.deepak.java.problems.Trees;

import java.util.LinkedList;
import java.util.List;

public class SortedListToBST {
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(11);
		list.add(17);
		list.add(23);
		list.add(71);
		TreeNode root = convertToBST(list);
		TreeUtils.traverseLevelOrder(root);
	}
	
	private static TreeNode convertToBST(List<Integer> list) {
		if (list.isEmpty()) {
			return null;
		}
		return null;
	}

}
