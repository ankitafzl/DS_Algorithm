package Arrays;

public class Leetcode_Jump_Game {
	public boolean canJump(int[] nums) {
        int n = nums.length - 1; 
        for (int i = n; i >= 0; --i) {
            if (nums[i] + i >= n) {
                n = i;
            }
        }
        if(n == 0){
            return true;
        }
        return false;
    }
}
