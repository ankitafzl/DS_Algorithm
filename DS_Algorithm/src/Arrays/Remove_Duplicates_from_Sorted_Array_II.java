package Arrays;

public class Remove_Duplicates_from_Sorted_Array_II {
	 public int removeDuplicates(int[] nums) {
	        int n=nums.length;
	        if(n<3){
	            return n;
	        }
	        
	        int twice=2;
	        for(int i=2;i<n;i++){
	            if(nums[i]!=nums[twice-2]){
	                nums[twice++]=nums[i];
	            }
	        }
	        return twice;
	    }
}
