/**
 * JavaProblems
 * BinarySearchTree.java
 */
package com.deepak.java.problems.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * It is same as binary tree i.e contains at max 2 TreeNodes
 * Left TreeNode contains value <= root and right TreeNode contains
 * value > root
 * 
 * This class is used to solve tree related problems
 * 
 * @author Deepak
 */
public class BinarySearchTree {

	/* We will maintain root and size of the tree.
	 * Size here means number of TreeNodes in the tree */
	private TreeNode root;

	/**
	 * Add TreeNode to the tree
	 */
	public void addTreeNode(int value) {
		if (root == null) {
			root = new TreeNode(value);
		} else {
			addTreeNode(root, value);
		}
	}

	private TreeNode addTreeNode(TreeNode root, int value) {
		if (root == null) {
			return null;
		} 
		if (value <= root.value) { /* We will insert left */
			if (root.left != null) {
				addTreeNode(root.left, value);
			} else {
				root.left = new TreeNode(value);
			}
		} else { /* We will insert right */
			if (root.right != null) {
				addTreeNode(root.right, value);
			} else {
				root.right = new TreeNode(value);
			}
		}
		return root;
	}

	public int size() {
		return size(root);
	}

	private int size(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return (size(root.left)) + 1 + (size(root.right));
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public TreeNode getRoot() {
		if (isEmpty()) {
			return null;
		}
		return root;
	}

	public boolean isRoot(TreeNode TreeNode) {
		return TreeNode == root;
	}
	
	public TreeNode findParent(TreeNode TreeNode) {
		return findParent(TreeNode.value, root, null);
	}
	
	private TreeNode findParent(int value, TreeNode root, TreeNode parent) {
		if (root == null) {
			return null;
		}
		if (value != root.value) {
			parent = findParent(value, root.left, root);
			if (parent == null) {
				parent = findParent(value, root.right, root);
			}
		}
		return parent;
	}
	
	public boolean hasParent(TreeNode TreeNode) {
		return findParent(TreeNode) != null;
	}
	
	public boolean hasLeftTreeNode(TreeNode TreeNode) {
		return TreeNode.left != null;
	}
	
	public boolean hasRightTreeNode(TreeNode TreeNode) {
		return TreeNode.right != null;
	}
	
	public TreeNode findLeft(TreeNode TreeNode) {
		if (hasLeftTreeNode(TreeNode)) {
			return TreeNode.left;
		}
		return null;
	}
	
	public TreeNode findRight(TreeNode TreeNode) {
		if (hasRightTreeNode(TreeNode)) {
			return TreeNode.right;
		}
		return null;
	}
	
	public boolean isLeafTreeNode(TreeNode TreeNode) {
		return !hasLeftTreeNode(TreeNode) && !hasRightTreeNode(TreeNode);
	}
	
	public static int getDepth(TreeNode TreeNode) {
		if (TreeNode == null) {
			return 0;
		}
		int left = getDepth(TreeNode.left);
		int right = getDepth(TreeNode.right);
		return left > right ? left + 1 : right + 1;
	}
	
	public boolean contains(int value) {
		return search(value) != null;
	}
	
	public TreeNode search(int value) {
		TreeNode TreeNode = root;
		while (TreeNode != null && TreeNode.value != value) {
			if (value <= TreeNode.value) {
				TreeNode = TreeNode.left;
			} else {
				TreeNode = TreeNode.right;
			}
		}
		return TreeNode;
	}
	
	public TreeNode delete(int value) {
		return delete(root, value);
	}
	
	/* There are 3 cases here, 
	 * 1. TreeNode to be removed has no child
	 * 2. TreeNode to be removed has one child
	 * 3. TreeNode to be removed has two child */
	private TreeNode delete(TreeNode root, int value) {
		/* Base case, when tree is empty */
		if (root == null) {
			return root;
		}
		/* Now, go down the tree */
		if (value < root.value) {
			root.left = delete(root.left, value);
		} else if (value > root.value) {
			root.right = delete(root.right, value);
		} else { /* If key is same as the root key, this is the TreeNode to be deleted */
			/* TreeNode with only one child or no child */
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			int minv = root.value;
	        while (root.left != null)
	        {
	            minv = root.left.value;
	            root = root.left;
	        }
			root.value = minv;
            root.right = delete(root.right, root.value);
		}
		return root;
	}
	
	public int getMinimum() {
		TreeNode TreeNode = root;
		while (TreeNode.left != null) {
			TreeNode = TreeNode.left;
		}
		return TreeNode.value;
	}
	
	public int getMaximum() {
		TreeNode TreeNode = root;
		while (TreeNode.right != null) {
			TreeNode = TreeNode.right;
		}
		return TreeNode.value;
	}
	
	/* All of these are DFS */
	/* Left -> Root -> Right */
	public void traverseInOrder(TreeNode TreeNode) {
		if (TreeNode == null) {
			return;
		}
		traverseInOrder(TreeNode.left);
		System.out.println(TreeNode.value + " ");
		traverseInOrder(TreeNode.right);
	}
	
	/* Root -> Left -> Right */
	public void traversePreOrder(TreeNode TreeNode) {
		if (TreeNode == null) {
			return;
		}
		System.out.println(TreeNode.value + " ");
		traversePreOrder(TreeNode.left);
		traversePreOrder(TreeNode.right);
	}
	
	/* Left -> Root -> Right */
	public void traversePostOrder(TreeNode TreeNode) {
		if (TreeNode == null) {
			return;
		}
		traversePostOrder(TreeNode.left);
		System.out.println(TreeNode.value + " ");
		traversePostOrder(TreeNode.right);
	}
	
	/* This is BFS */
	/* Level by Level */
	public void traverseLevelOrder(TreeNode root) {
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
