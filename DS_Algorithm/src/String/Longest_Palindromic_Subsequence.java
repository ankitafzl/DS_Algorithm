package String;

public class Longest_Palindromic_Subsequence {
	public int longestPalindromeSubseq(String s) {
        int n = s.length();
        
        int[][] dp = new int[n][n];
        
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
	
	public int longestPalindromeSubseq1(String s) {
        String n1 = s;
        String n2=new StringBuilder(s).reverse().toString();
        int[][] dp= new int[n1.length()+1][n2.length()+1];
        
        for (int i = 1; i <dp.length; i++) {
           for (int j =1; j < dp[0].length; j++) {
                if (n1.charAt(i-1) == n2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } 
               else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n1.length()][n2.length()];
    }
}
