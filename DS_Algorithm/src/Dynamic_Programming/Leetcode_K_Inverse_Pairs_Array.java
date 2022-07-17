package Dynamic_Programming;

public class Leetcode_K_Inverse_Pairs_Array {
	 public int kInversePairs(int n, int k) {
	        int mod=1000000007;
	        int dp[][]=new int[n+1][k+1];
	        dp[0][0]=1;        
	        for(int i=1;i<=n;i++){
	            long sum=0;
	            for(int j=0;j<=k;j++){
	                sum+=dp[i-1][j];
	                if(j>=i){
	                    sum-=dp[i-1][j-i];
	                }dp[i][j]=(int)(sum%mod);
	            }
	        }
	        dp[n][k]+=mod;
	        dp[n][k]=dp[n][k]%mod;
	        return dp[n][k];
	    }
}
