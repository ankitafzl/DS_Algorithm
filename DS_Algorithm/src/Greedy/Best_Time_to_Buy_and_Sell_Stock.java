package Greedy;

public class Best_Time_to_Buy_and_Sell_Stock {
	 public int maxProfit(int[] prices) {
	        int max_profit=0;
	        int min_price=Integer.MAX_VALUE;
	        for(int i=0;i<prices.length;i++){
	            if(prices[i]<min_price){
	                min_price=prices[i];
	            }
	            else if(prices[i]-min_price>max_profit){
	                max_profit=prices[i]-min_price;
	            }
	        }
	        return max_profit;
	 }
}
