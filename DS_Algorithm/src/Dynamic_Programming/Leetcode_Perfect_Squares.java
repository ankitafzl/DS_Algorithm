package Dynamic_Programming;
import java.util.*;
public class Leetcode_Perfect_Squares {
	public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int x = (int) Math.sqrt(i);
            for (int j = 1; j <= x; j++) {
                int y = (int) Math.pow(j, 2);
                if (y <= i) {
                   dp[i] = Math.min(dp[i], dp[i - y] + 1);
                }
            }
        }
        return dp[n];

    }

}
