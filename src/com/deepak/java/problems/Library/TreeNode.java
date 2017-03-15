/**
 * JavaProblems
 * TreeNode.java
 */
package com.deepak.java.problems.Library;

/**
 * TreeNode class 
 * 
 * @author Deepak
 *
 * @param <T>
 */
public class TreeNode<T> {

	/* Data, left and right child */
	private T data;
	private TreeNode<T> left;
	private TreeNode<T> right;

	/**
	 * Constructor
	 * 
	 * @param data
	 */
	public TreeNode(T data) {
		this.data = data;
	}

	/* Accessors */
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	public TreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + "]";
	}

}
