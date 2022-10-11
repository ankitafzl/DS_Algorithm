package Arrays;

public class Leetcode_Increasing_Triplet_Subsequence {
	public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int p1 = Integer.MAX_VALUE;
        int p2 = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if (p1 >= nums[i]) {
                p1 = nums[i];
            } else if (p2>=nums[i]) {
                p2 = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}
