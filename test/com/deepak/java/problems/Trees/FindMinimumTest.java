/**
 * JavaProblems
 * FindMinimumTest.java
 */
package com.deepak.java.problems.Trees;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for finding minimum value in a BST
 * 
 * @author Deepak
 */
public class FindMinimumTest {

	/* Test Case 1 :
	 * Insert sequential values in the tree,
	 * and find minimum*/
	@Test
	public void findMinimumTest1() {
		BinarySearchTree aTree = new BinarySearchTree();
		aTree.addTreeNode(1);
		aTree.addTreeNode(2);
		aTree.addTreeNode(3);
		aTree.addTreeNode(4);
		Assert.assertEquals(FindMinimum.findMinimum(aTree.getRoot()), 1);
	}

	/* Test Case 2 :
	 * Insert some random values in the tree,
	 * and find the minimum */
	@Test
	public void findMinimumTest2() {
		BinarySearchTree aTree = new BinarySearchTree();
		aTree.addTreeNode(10);
		aTree.addTreeNode(8);
		aTree.addTreeNode(12);
		aTree.addTreeNode(13);
		aTree.addTreeNode(2);
		aTree.addTreeNode(19);
		aTree.addTreeNode(7);
		aTree.addTreeNode(17);
		Assert.assertEquals(FindMinimum.findMinimum(aTree.getRoot()), 2);
	}

	/* Test Case 3 :
	 * Insert just one value in the tree
	 * and find minimum value */
	@Test
	public void findMinimumTest3() {
		BinarySearchTree aTree = new BinarySearchTree();
		aTree.addTreeNode(10);
		Assert.assertEquals(FindMinimum.findMinimum(aTree.getRoot()), 10);
	}

	/* Test Case 4 : 
	 * Insert 0 in the tree, and find 
	 * minimum value */
	@Test
	public void findMinimumTest4() {
		BinarySearchTree aTree = new BinarySearchTree();
		aTree.addTreeNode(0);
		Assert.assertEquals(FindMinimum.findMinimum(aTree.getRoot()), 0);
	}

	/* Test Case 5 : 
	 * Find minimum value from a blank tree */
	@Test
	public void findMinimumTest5() {
		BinarySearchTree aTree = new BinarySearchTree();
		Assert.assertEquals(FindMinimum.findMinimum(aTree.getRoot()), 0);
	}

}
