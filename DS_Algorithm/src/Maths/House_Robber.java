package Maths;

public class House_Robber {
	Integer dp[];
    public int rob(int[] nums) {
        dp=new Integer[nums.length];
        return solve(nums,nums.length-1);
    }
    
    private int solve(int[] nums,int i){
         if(i<0){
             return 0;
         }    
        if(dp[i]!=null){
            return dp[i];
        }
        return dp[i]=Math.max(solve(nums,i-2)+nums[i],solve(nums,i-1));
    }
}
