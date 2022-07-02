package Dynamic_Programming;

public class Best_Time_to_Buy_and_Sell_Stock_II {

	 public int maxProfit(int[] prices) {
	        int max_profit=0;
	        for(int i=1;i<prices.length;i++){
	            if(prices[i]>prices[i-1]){
	                max_profit+=(prices[i]-prices[i-1]);
	            }
	        }
	        return max_profit;
	    }
}
