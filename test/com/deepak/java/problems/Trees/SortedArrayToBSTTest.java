/**
 * JavaProblems
 * SortedArrayToBSTTest.java
 */
package com.deepak.java.problems.Trees;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for converting a sorted array to BST
 * 
 * @author Deepak
 */
public class SortedArrayToBSTTest {

	/* Test case to convert to BST with odd number of elements 
	 * This variation is to find the mid */
	@Test
	public void sortedArrayToBSTTest1() {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		TreeNode root = SortedArrayToBST.convertToBST(array);
		Assert.assertEquals(BinarySearchTree.getDepth(root), 3);
		Assert.assertEquals(root.value, 4);
		Assert.assertEquals(root.left.value, 2);
		Assert.assertEquals(root.right.value, 6);
	}

	/* Test case to convert sorted array with 
	 * even number of elements */
	public void sortedArrayToBSTTest2() {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		TreeNode root = SortedArrayToBST.convertToBST(array);
		Assert.assertEquals(BinarySearchTree.getDepth(root), 3);
		Assert.assertEquals(root.value, 5);
		Assert.assertEquals(root.left.value, 3);
		Assert.assertEquals(root.right.value, 7);
	}

}
