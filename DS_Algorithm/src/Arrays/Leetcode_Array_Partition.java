package Arrays;
import java.util.*;
public class Leetcode_Array_Partition {
	public int arrayPairSum(int[] nums) {
        int max_sum=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=2){
            max_sum+=Math.min(nums[i],nums[i-1]);
        }
        return max_sum;
    }
}
