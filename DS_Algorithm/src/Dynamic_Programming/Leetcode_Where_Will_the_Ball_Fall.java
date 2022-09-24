package Dynamic_Programming;
import java.util.*;
public class Leetcode_Where_Will_the_Ball_Fall {
	public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
    
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; ++i){
            dp[i] = i;
        }
      
       for (int i = 0; i < m; ++i) {
           int[] newDp = new int[n];
           Arrays.fill(newDp, -1);
           
           for (int j = 0; j < n; ++j) {
        
                if (j + grid[i][j] < 0 || j + grid[i][j] == n){
                    continue;
                }
                if (grid[i][j] == 1 && grid[i][j + 1] == -1 || grid[i][j] == -1 && grid[i][j - 1] == 1){
                    continue;
                }
                newDp[j + grid[i][j]] = dp[j];
           }
           dp = newDp;
       }

       for (int i = 0; i < n; ++i){
           if (dp[i] != -1){
               ans[dp[i]] = i;
           }
        
       }
       return ans;
    }
}
