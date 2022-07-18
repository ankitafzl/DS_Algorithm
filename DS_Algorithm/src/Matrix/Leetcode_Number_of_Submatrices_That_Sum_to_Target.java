package Matrix;
import java.util.*;
public class Leetcode_Number_of_Submatrices_That_Sum_to_Target {

	 public int numSubmatrixSumTarget(int[][] matrix, int target) {
	        int m = matrix.length;
	        int n = matrix[0].length;
	        int[][] dp = new int[m + 1][n + 1];
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
	            }
	        }

	        int count = 0;
	        for (int top = 0; top < m; top++) {
	            for (int bottom = top + 1; bottom <= m; bottom++) {
	                Map<Integer, Integer> map = new HashMap<>();
	                map.put(0, 1);
	                for (int k = 1; k <= n; k++) {
	                    int sum = dp[bottom][k] - dp[top][k];
	                    count += map.getOrDefault(sum - target, 0);
	                    map.put(sum, map.getOrDefault(sum, 0) + 1);
	                }
	            }
	        }
	        return count;
	    }
}
