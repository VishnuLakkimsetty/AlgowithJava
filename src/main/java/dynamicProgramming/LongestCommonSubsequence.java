// https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/

/*
 * Use 2-D array to store the results of computed values
 * 
 * 
 */

package main.java.dynamicProgramming;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		// String s1 = "AGGTAB";
		// String s2 = "GXTXAYB";

		String s1 = "manish";
		String s2 = "anih";

		char[] X = s1.toCharArray();
		char[] Y = s2.toCharArray();
		int m = X.length;
		int n = Y.length;

		System.out.println("Length of LCS is ::" + lcsLength(X, Y, m, n));
		System.out.println("LCS String is ::" + lcsString(X, Y, m, n));
	}

	private static String lcsString(char[] x, char[] y, int m, int n) {
		int[][] lcs = lcsTable(x, y, m, n);
		int index = lcs[m][n];
		char[] s = new char[index];
		int i = m, j = n;
		while (i > 0 && j > 0) {
			if (x[i - 1] == y[j - 1]) {
				s[index - 1] = x[i - 1];
				index--;
				i--;
				j--;
			} else if (lcs[i][j - 1] > lcs[i - 1][j]) {
				j--;
			} else {
				i--;
			}
		}

		return new String(s);
	}

	private static int lcsLength(char[] x, char[] y, int m, int n) {
		int max = 1;
		int[][] lcs = lcsTable(x, y, m, n);
		max = lcs[m][n];
		return max;
	}

	private static int[][] lcsTable(char[] x, char[] y, int m, int n) {
		int[][] lcs = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					lcs[i][j] = 0;
				} else if (x[i - 1] == y[j - 1]) {
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
				} else {
					lcs[i][j] = (lcs[i - 1][j] > lcs[i][j - 1] ? lcs[i - 1][j] : lcs[i][j - 1]);
				}
			}
		}

		return lcs;
	}
}
