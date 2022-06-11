package Arrays;
import java.util.*;
public class Minimum_Operations_to_Reduce_X_to_Zero {

	public int minOperations(int[] nums, int x) {
        int n = nums.length, sum = 0, max_Len = 0;        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int target = sum - x;
        if (target < 0){
            return -1;
        } 
        if (target == 0){
            return n;
        } 
        
        sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == target) {
                max_Len = i + 1;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            int k = sum - target;
            if (map.containsKey(k)) {
                if (max_Len < (i - map.get(k))) {
                    max_Len = i - map.get(k);
                }
            }
        }
        return max_Len == 0 ? -1 : n - max_Len;
    
    }
}
