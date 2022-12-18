package Dynamic_Programming;

public class Leetcode_House_Robber_II {
	public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int x=solve(nums,0,nums.length-1);
        int y=solve(nums,1,nums.length);
        return Math.max(x,y);
    }
    private int solve(int []nums,int st,int end){
        int dp[]=new int[end];
        dp[st]=nums[st];
        dp[st+1]=Math.max(nums[st],nums[st+1]);
        for(int i=st+2;i<end;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
