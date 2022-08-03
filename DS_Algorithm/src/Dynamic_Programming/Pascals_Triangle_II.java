package Dynamic_Programming;
import java.util.*;
public class Pascals_Triangle_II {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        int[][] dp = new int[rowIndex + 1][rowIndex + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= rowIndex; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
            }
        }
        for (int k = 0; k <= rowIndex; k++) {
            ans.add(dp[rowIndex][k]);
        }
        return ans;
    }
}
