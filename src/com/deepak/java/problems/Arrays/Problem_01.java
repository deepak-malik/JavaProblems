package com.deepak.java.problems.Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Suppose we abstract our file system by a string in the following manner:
 * The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
 * dir
 * 	subdir1
 * 	subdir2
 * 		file.ext
 * 
 * The directory dir contains an empty sub-directory subdir1 and a sub-directory subdir2 containing a file file.ext.
 * 
 * @author Deepak
 */
public class Problem_01 {
	
	public static void main(String[] args) {
		System.out.println(lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
	}
	
	/**
	 * Find the length of longest path 
	 * 
	 * @param input
	 * @return
	 */
	public static int lengthLongestPath(String input) {
		/* Split the entire path using \n */
	    String[] paths = input.split("\n");
	    /* Create a array using the size of paths. It can act as my stack */
	    int[] stack = new int[paths.length + 1];
	    /* Let max length be 0 */
	    int maxLen = 0;
	    /* Now check for each string */
	    for(String s : paths) {
	    	/* if character doesn't exist in string, last index is 0
	    	 * So, find the last index and add 1 to it */
	        int lev = s.lastIndexOf("\t") + 1;
	        /* Find the current length of this string that we pushed to stack */
	        int curLen = stack[lev + 1]; // Since my level start from 0, adding 1 
	        /* Check the current length */
	        curLen = stack[lev] + s.length() - lev + 1;
	        /* If it is a file, find the max length */
	        if (s.contains(".")) {
	        	maxLen = Math.max(maxLen, curLen-1);
	        }
	    }
	    return maxLen;
	}
	
	
	public int lengthLongestPath_UsingStacks(String input) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0); // "dummy" length
        int maxLen = 0;
        for(String s:input.split("\n")){
            int lev = s.lastIndexOf("\t") + 1; // number of "\t"
            while (lev+1 <stack.size()) {
            	stack.pop(); // find parent
            }
            int len = stack.peek() + s.length()-lev+1; // remove "/t", add"/"
            stack.push(len);
            // check if it is file
            if(s.contains(".")) {
            	maxLen = Math.max(maxLen, len-1); 
            }
        }
        return maxLen;
    }
	
	
}
