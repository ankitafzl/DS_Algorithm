package Arrays;

public class Leetcode_Wiggle_Subsequence {
	 public int wiggleMaxLength(int[] nums) {
	        int n=nums.length;
	        if(n<=1){
	            return n;
	        }
	        int max=0;
	        int x=1;
	        int y=1;
	        for(int i=0;i<n-1;i++){
	            if(nums[i]<nums[i+1]){
	                x=y+1;
	            }
	            else if(nums[i]>nums[i+1]){
	                y=x+1;
	            }
	        }
	        max=Math.max(x,y);
	        return max;
	    }
}
