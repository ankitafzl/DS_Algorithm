package Binary_Search;

public class Leetcode_Find_Minimum_in_Rotated_Sorted_Array {
	 public int findMin(int[] nums) {
	        int min=nums[0];
	        int low=0;
	        int high=nums.length-1;

	        while(low<high){
	            int mid=low+(high-low)/2;
	            if(nums[mid]>nums[high]){
	                low=mid+1;
	            }
	            else{
	                high=mid;
	            }
	            min=nums[low];
	        }
	        return min;
	    }
}
