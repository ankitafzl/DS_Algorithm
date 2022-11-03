package Arrays;

public class Leetcode_Set_Mismatch {
	public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
       
       if( nums==null || nums.length == 0){
           return new int[0];
       }
         
       int n = nums.length;
       int[] bucket = new int[n+1];
       
       for( int i = 0; i < n; i++ ){
           bucket[nums[i]]++;
           if( bucket[nums[i]] == 2 ){
                ans[0] = nums[i];
           }
              
       }
       
       for( int i = 1; i <= n; i++ ){
           if( bucket[i] == 0 ){
               ans[1] = i;
           }
               
       }
       
       return ans;   
   }
}
