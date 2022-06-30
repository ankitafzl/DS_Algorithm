package Arrays;
import java.util.*;
public class Leetcode_Minimum_Moves_to_Equal_Array_Elements_II {

	public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=nums[n/2];
        int count=0;
        for(int num:nums){
            count+=Math.abs(num-mid);
        }
        return count;
    }
}
