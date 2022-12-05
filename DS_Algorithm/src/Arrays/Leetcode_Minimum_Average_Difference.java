package Arrays;

public class Leetcode_Minimum_Average_Difference {
	public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long sum=0;
        long curr_sum=0;
        for(int num: nums){
            sum+=num;
        }
        int m=(int)1e9;
        int ans=0;
        for(int i=0;i<n;i++){
            curr_sum+=nums[i];
            long avg1=curr_sum/(i+1);
            if(i==n-1){
                if(avg1<m){
                    return n-1;
                }
                else{
                    break;
                }
            }
            long avg2=(sum-curr_sum)/(n-i-1);
            if(Math.abs(avg1-avg2)<m){
                m=(int)Math.abs(avg1-avg2);
                ans=i;
            }
        }
        return ans;
    }
}
