package Arrays;

public class Leetcode_Sum_of_Even_Numbers_After_Queries {
	public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n=queries.length;
        int[] ans = new int[n];
        int s = 0;  
        for(int i : nums){
            if(i % 2==0)
                s+=i;
        }
        
        for(int i=0; i<n; i++){
            if(nums[queries[i][1]] % 2 == 0){
               if(queries[i][0] % 2==0){
                   ans[i] = s+queries[i][0];
               }
               else{
                    ans[i] = s-nums[queries[i][1]];
               }
                   
            }
            else{
                if(queries[i][0] % 2==0){
                    ans[i] = s;
                }
                else{
                    ans[i] = s+queries[i][0]+nums[queries[i][1]];
                }
                    
            }
            nums[queries[i][1]] += queries[i][0];

            s=ans[i];
        }
        return ans;
    }
}
