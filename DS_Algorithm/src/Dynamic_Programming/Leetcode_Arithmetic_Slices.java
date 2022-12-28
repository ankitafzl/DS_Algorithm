package Dynamic_Programming;

public class Leetcode_Arithmetic_Slices {
	public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int ans=0;
        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                dp[i]=1+dp[i-1];
                ans+=dp[i];
            }
        }
        return ans;
    }
}
