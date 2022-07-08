package Dynamic_Programming;

public class Leetcode_Paint_House_III {

	public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int[][][] dp = new int[m][m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        int ans = solve(0, 0, 0, houses, cost, m, n, target, dp);
        return (ans == Integer.MAX_VALUE / 2) ? -1 : ans;
    }
    
    private int solve(int i, int t, int l, int[] houses, int[][] cost, int m, int n, int target, int[][][] dp) {
         if (t > target){
              return Integer.MAX_VALUE / 2;
         }
         if (i == m) {
              return t == target ? 0 : Integer.MAX_VALUE / 2;
         }
         if (dp[i][t][l] != -1) {
             return dp[i][t][l];
         }
         else {
             int ans = Integer.MAX_VALUE / 2;
             if (houses[i] == 0) {
                   for (int j = 0; j < n; j++) {
                       ans = Math.min(ans, cost[i][j]+solve(i + 1, l == j + 1 ? t : t + 1, j + 1, houses, cost, m, n, target, dp));
                   }
             } 
             else {
                   ans = Math.min(ans,solve(i + 1, l == houses[i] ? t : t + 1, houses[i], houses, cost, m, n, target, dp));
             }
    
             return dp[i][t][l]= ans;
        }
    }
}
