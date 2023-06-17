public class Solution {
    
}
class Solution {
    public static int getPaths(int i, int j, int m, int n, int[][] dp) {
		if(i >= m || j >= n) return 0;
		if(i == m - 1  && j == n - 1) return 1;
		if(dp[i][j] != 0) return dp[i][j];
		dp[i][j] = getPaths(i, j + 1, m, n, dp) + getPaths(i + 1, j, m, n, dp);
		return dp[i][j];
	}
	public static int uniquePaths(int m, int n) {
		int[][] dp = new int[m][n];
		return getPaths(0, 0 , m, n, dp);
	}
}