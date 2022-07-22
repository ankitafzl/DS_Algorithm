package Arrays;

public class Level_1_Find_Pivot_Index {
	 public int pivotIndex(int[] nums) {
	        int sum=0;
	        int left_sum=0;
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	        }
	        
	        for(int i=0;i<nums.length;i++){
	            if(i!=0){
	                left_sum+=nums[i-1];
	            }
	            if(sum-left_sum-nums[i]==left_sum){
	                return i;
	            }
	        }
	        return -1;
	    }
}
