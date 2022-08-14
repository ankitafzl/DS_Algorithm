package Arrays;
import java.util.*;
public class Leetcode_Longest_Increasing_Subsequence {
	public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
	    int long_sub = 0;
	    for (int num : nums) {
		     int i = Arrays.binarySearch(dp, 0, long_sub, num);
		     if (i < 0)	{
                 i = - (i + 1);
             }
		     dp[i] = num;
	  	     if (i == long_sub)	
             {
                 long_sub++;
             }
	   }
	   return long_sub;
    }
}
