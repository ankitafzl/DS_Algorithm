package String;

public class Leetcode_Count_Vowels_Permutation {
	public int countVowelPermutation(int n) {
        if (n == 0){
            return 0;
        }
        long[][] dp = new long[n][5];

        for (int i = 0; i< 5; i++){
            dp[0][i] = 1;
        }
        int a = 0, e = 1, i = 2, o = 3, u = 4;
        int mod = (int) Math.pow(10, 9) + 7;

        for (int j = 1; j < n; j++) {
            dp[j][a] = (dp[j - 1][e] + dp[j - 1][i] + dp[j - 1][u]) % mod;
            dp[j][e] = (dp[j - 1][a] + dp[j - 1][i]) % mod;
            dp[j][i] = (dp[j - 1][e] + dp[j - 1][o]) % mod;
            dp[j][o] = (dp[j - 1][i]) % mod;
            dp[j][u] = (dp[j - 1][i] + dp[j - 1][o]) % mod;
        }

        long count = 0;
        for (int j = 0; j < 5; j++)
            count = (count + dp[n - 1][j]) % mod;

        return (int) count;
    }
}
