package Arrays;
import java.util.*;
public class Leetcode_Arithmetic_Slices_II_Subsequence {
	 public int numberOfArithmeticSlices(int[] nums) {
	        int n=nums.length;
	        int ans = 0;
	        Map<Integer, Integer>[] map = new Map[n];

	        for (int i = 0; i < n; i++) {
	            map[i] = new HashMap<>(i);

	            for (int j = 0; j < i; j++) {
	                long diff = (long)nums[i] - nums[j];
	                if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) {
	                    continue;
	                }

	                int d = (int)diff;
	                int x = map[i].getOrDefault(d, 0);
	                int y = map[j].getOrDefault(d, 0);
	                ans += y;
	                map[i].put(d, x + y + 1);
	            }
	        }

	        return ans;
	    }
}
