package Binary_Search;

public class Leetcode_Find_Peak_Element {
	 public int findPeakElement(int[] nums) {
	        if (nums == null) {
	            return -1;
	        }
	        if (nums.length == 1) {
	            return 0;
	        }
	        
	        int left = 0;
	        int right = nums.length - 1;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] < nums[mid+1]) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }

	        return left;
	    }
}
