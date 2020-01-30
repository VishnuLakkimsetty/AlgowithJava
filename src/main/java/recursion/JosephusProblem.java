// https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/
package main.java.recursion;

import java.util.LinkedList;
import java.util.Queue;

public class JosephusProblem {
	public static void main(String[] args) {
		int n = 7;
		int k = 3;
		System.out.println("Safe Position:: " + safePosition(n, k));
		System.out.println("Safe Position by Josephus theorem:: " + josephusSafePosition(n, k));
	}

	/**
	 * 
	 * This method will take O(n) space and O(n*k) time complexity
	 * 
	 */
	private static int safePosition(int n, int k) {
		Queue<Integer> q = new LinkedList<>();
		// Add the n positions to the queue
		for (int i = 1; i <= n; i++)
			q.add(i);
		while (q.size() > 1) {
			for (int i = 1; i <= k - 1; i++) {
				int j = q.poll();
				q.add(j);
			}
			q.poll();
		}
		return q.peek();
	}

	/**
	 * 
	 * Josephus Algorithm uses recursion algorithm and calculates the safe position
	 * of (n,k) as below: safe(n,k) = (safe(n-1,k)+k-1)%n+1 and the base case would
	 * return 1 i.e., safe(1,k) = 1
	 * 
	 * This approach will take O(n) space and time complexity
	 * 
	 */
	private static int josephusSafePosition(int n, int k) {
		if(n==1)
			return 1;
		else
			return (josephusSafePosition(n-1, k)+k-1)%n+1;
	}

}
