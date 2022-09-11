package Arrays;

public class Leetcode_Best_Time_to_Buy_and_Sell_Stock_IV {

	 public int maxProfit(int k, int[] prices) {
	        int n = prices.length;
	        
	        if (k>n/2)
	        {
	            int ans = 0;
	            for (int i = 1; i < n; i ++)
	            {
	                ans += Math.max(0,prices[i]-prices[i-1]);
	            }
	            return ans;
	        }
	        
	        int[][] dp = new int[k+1][n];
	        for (int i = 1; i <= k; i ++)
	        {
	            int profit = 0-prices[0];
	            for (int j = 1; j < n; j ++)
	            {
	                dp[i][j] = Math.max(dp[i][j-1], profit+prices[j]);
	                profit = Math.max(profit, dp[i-1][j-1]-prices[j]);
	            }
	        }
	        
	        return dp[k][n-1];
	    }
}
