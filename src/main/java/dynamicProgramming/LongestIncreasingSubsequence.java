// https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/

/*
 * Use table memoization by taking extra array of same size
 * 
 * Time O(n^2)
 * Space O(n)
 */

package main.java.dynamicProgramming;

public class LongestIncreasingSubsequence {
	public static void main(String args[]) {
		// int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };  --> 5
		// int arr[] = { 3, 10, 2, 1, 20 };  --> 3
		int arr[] = { 20, 10, 5 }; // --> 1
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n) + "\n");
	}

	private static int lis(int[] arr, int n) {
		int max = 1;
		int[] lis = new int[n];

		// Initialize lis array with 1 as it is min longest subsequence
		for (int i = 0; i < n; i++) {
			lis[i] = 1;
		}

		// Now loop on the actual array using two pointers
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && lis[i] <= lis[j]) {
					lis[i] = lis[j] + 1;
				}
			}
		}

		for (int i : lis) {
			if (max < i)
				max = i;
		}

		return max;
	}

}
