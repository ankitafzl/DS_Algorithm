package Arrays;

public class Partition_Array_for_Maximum_Sum {
	public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int dp[]=new int[n];
        dp[0]=arr[0];
        int max=arr[0];
        for(int i=1;i<k;i++){
            max=Math.max(max,arr[i]);
            dp[i]=max*(i+1);
        }
        for(int i=k;i<n;i++){
            int max_sub_array=arr[i];
            for(int j=1;j<=k;j++){
                max_sub_array=Math.max(max_sub_array,arr[i-j+1]);
                dp[i]=Math.max(dp[i],dp[i-j]+max_sub_array*j);
            }
        }
        return dp[n-1];
    }
}
