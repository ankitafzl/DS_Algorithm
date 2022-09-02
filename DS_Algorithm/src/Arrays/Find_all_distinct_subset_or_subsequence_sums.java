package Arrays;
import java.util.*;
public class Find_all_distinct_subset_or_subsequence_sums {
	public int[] DistinctSum(int[] nums)
    {
        // Code here
        int dp[][]=new int[101][10001];
        Set<Integer> set=new HashSet<>();
        solve(nums,0,0,set,dp);
        int ans[]=new int[set.size()];
        int x=0;
        for(int i:set){
            ans[x]=i;
            x++;
        }
        Arrays.sort(ans);
        return ans;
    }
    
    void solve(int []nums,int i,int sum,Set<Integer> set,int[][] dp){
        if(i==nums.length){
            set.add(sum);
            return;
        }
        if(dp[i][sum]!=0){
            return;
        }
        dp[i][sum]=1;
        solve(nums,i+1,sum,set,dp);
        solve(nums,i+1,sum+nums[i],set,dp);
    }
}
