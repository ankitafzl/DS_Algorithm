package Arrays;
import java.util.*;
public class Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits {
	 public int maximumSum(int[] nums) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        int ans = -1;
            for (int num: nums) {
	            int key = getNumberTotal(num);
                if (!map.containsKey(key)) {
	                map.put(key, num);
	            }
	            else {
	               ans = Math.max(ans, map.get(key) + num);
	                map.put(key, Math.max(map.get(key), num));
	            }
	        }

	        return ans;
	    }

	    int getNumberTotal(int num) {
	        int ans = 0;
	        while (num > 0) {
	            ans += num % 10;
	            num /= 10;
	        }

	        return ans;
	    }
}
