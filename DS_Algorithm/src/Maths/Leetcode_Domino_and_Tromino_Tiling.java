package Maths;

public class Leetcode_Domino_and_Tromino_Tiling {
	public int numTilings(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        long[][] dp = new long[n + 1][3];
        dp[1][0] = 1; dp[2][0] = 2;
        dp[2][1] = 1;
        dp[2][2] = 1;
        int mod = (int)1e9 + 7;
        for(int i = 3; i <= n; i++){
            dp[i][0] = (dp[i - 1][0] + dp[i - 2][0] + dp[i - 1][1] + dp[i - 1][2]) % mod;
            dp[i][1] = (dp[i - 2][0] + dp[i - 1][2]) % mod;
            dp[i][2] = (dp[i - 2][0] + dp[i - 1][1]) % mod;
        }
        return (int)dp[n][0];
    }
}
