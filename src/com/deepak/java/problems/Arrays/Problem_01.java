package com.deepak.java.problems.Arrays;

public class Problem_01 {
	
	public static int findUnique(int[] A, int[] B) {
		int length = 0;
		if (A.length > B.length) {
			length = B.length;
		}
		int result = 0;
		for (int i = 0; i < length; i++) {
			result ^= A[i];
			result ^= B[i];
		}
		if (result == 0) {
			result = A[A.length - 1];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,9};
		int[] B = {1,2,3,4,5};
		System.out.println(findUnique(A, B));
	}

}
