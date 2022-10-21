package Arrays;
import java.util.*;
public class Leetcode_Contains_Duplicate_II {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        k = Math.min(k,n);
        Set<Integer> set =new HashSet<Integer>();
        for (int i = 0 ; i < k ; i++){
                if(!set.add(nums[i])){
                    return true;
                }
        }
        for(int i = k ; i < n ; i++){
            if(!set.add(nums[i])){
                return true;
            }
            set.remove(nums[i-k]);

        }
        return false;
    }
}
