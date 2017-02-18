package com.deepak.java.problems.Trees;

import org.junit.Assert;
import org.junit.Test;

public class PredecessorAndSuccessorTest {
	
	@Test
	public void inOrderSuccessorTest1() {
		BinarySearchTree aTree = new BinarySearchTree();
		aTree.addTreeNode(15);
		aTree.addTreeNode(10);
		aTree.addTreeNode(20);
		aTree.addTreeNode(8);
		aTree.addTreeNode(12);
		aTree.addTreeNode(17);
		aTree.addTreeNode(25);
		aTree.addTreeNode(6);
		aTree.addTreeNode(11);
		aTree.addTreeNode(16);
		aTree.addTreeNode(27);
		TreeNode aNodeToCheck = aTree.getRoot().left;
		Assert.assertEquals(PredecessorAndSuccessor.findInOrderSuccessor(aTree.getRoot(), aNodeToCheck).value, 11);;
	}
	
	@Test
	public void inOrderSuccessorTest2() {
		BinarySearchTree aTree = new BinarySearchTree();
		aTree.addTreeNode(15);
		aTree.addTreeNode(10);
		aTree.addTreeNode(20);
		aTree.addTreeNode(8);
		aTree.addTreeNode(12);
		aTree.addTreeNode(17);
		aTree.addTreeNode(25);
		aTree.addTreeNode(6);
		aTree.addTreeNode(11);
		aTree.addTreeNode(16);
		aTree.addTreeNode(27);
		TreeNode aNodeToCheck = aTree.getRoot().left.right;
		Assert.assertEquals(PredecessorAndSuccessor.findInOrderSuccessor(aTree.getRoot(), aNodeToCheck).value, 15);;
	}
	
	@Test
	public void inOrderSuccessorTest3() {
		BinarySearchTree aTree = new BinarySearchTree();
		aTree.addTreeNode(15);
		aTree.addTreeNode(10);
		aTree.addTreeNode(20);
		aTree.addTreeNode(8);
		aTree.addTreeNode(12);
		aTree.addTreeNode(17);
		aTree.addTreeNode(25);
		aTree.addTreeNode(6);
		aTree.addTreeNode(11);
		aTree.addTreeNode(16);
		aTree.addTreeNode(27);
		TreeNode aNodeToCheck = aTree.getRoot().right.left;
		Assert.assertEquals(PredecessorAndSuccessor.findInOrderSuccessor(aTree.getRoot(), aNodeToCheck).value, 20);;
	}
	
	@Test
	public void inOrderSuccessorTest4() {
		BinarySearchTree aTree = new BinarySearchTree();
		aTree.addTreeNode(15);
		aTree.addTreeNode(10);
		aTree.addTreeNode(20);
		aTree.addTreeNode(8);
		aTree.addTreeNode(12);
		aTree.addTreeNode(17);
		aTree.addTreeNode(25);
		aTree.addTreeNode(6);
		aTree.addTreeNode(11);
		aTree.addTreeNode(16);
		aTree.addTreeNode(27);
		TreeNode aNodeToCheck = aTree.getRoot().right.right.right;
		Assert.assertEquals(PredecessorAndSuccessor.findInOrderSuccessor(aTree.getRoot(), aNodeToCheck).value, 0);;
	}
	
	
}
