package Arrays;

public class Leetcode_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown {
	
	//method 1
	public int maxProfit(int[] prices) {
        int n = prices.length;
        if(prices == null || n == 0) {
           return 0;
        } 
        int[] buy = new int[n + 1];
        int[] sell = new int[n + 1];
        buy[1] = -prices[0];
        for(int i = 2; i <= n; i++){
            buy[i] = Math.max(sell[i - 2] - prices[i - 1], buy[i - 1]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i - 1]);
        }
        return sell[n];
    }
	
	
	//method 2 Recursion
	public int maxProfit1(int[] prices) {
        return solve(0,1,prices);
    }
    int solve(int i,int buy,int[] prices){
        if(i>=prices.length){
            return 0;
        }
        if(buy==1){
            return Math.max(-prices[i]+solve(i+1,0,prices),0+solve(i+1,1,prices));
        }
        return Math.max(prices[i]+solve(i+2,1,prices),0+solve(i+1,0,prices));
    }
}
