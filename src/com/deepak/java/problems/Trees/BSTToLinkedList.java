package com.deepak.java.problems.Trees;

/**
 * <br> Problem Statement :
 * Convert BST to Linked List
 * 
 * NOTE : This solution to cover all 3 linked lists
 * 1. Singly Linked List
 * 2. Doubly Linked list
 * 3. Circular Linked list
 * </br>
 * 
 * @author Deepak
 */
public class BSTToLinkedList {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addTreeNode(17);
		binarySearchTree.addTreeNode(11);
		binarySearchTree.addTreeNode(23);
		binarySearchTree.addTreeNode(71);
		binarySearchTree.addTreeNode(5);
		binarySearchTree.addTreeNode(7);
		binarySearchTree.addTreeNode(3);
		System.out.println("Printing Tree :");
		TreeUtils.traverseLevelOrder(binarySearchTree.getRoot());
		toSinglyLinkedList(binarySearchTree.getRoot());
		toDoublyLinkedList(binarySearchTree.getRoot());
		toCircularLinkedList(binarySearchTree.getRoot());
	}

	public static void toSinglyLinkedList(TreeNode root) {

	}

	public static void toDoublyLinkedList(TreeNode root) {

	}

	public static void toCircularLinkedList(TreeNode root) {

	}

}
