package Arrays;
import java.util.*;
public class Leetcode_Numbers_With_Same_Consecutive_Differences {

	 public int[] numsSameConsecDiff(int n, int k) {
	    LinkedList<Integer> ans = new LinkedList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
	    for (int i = 1; i < n; i++) {
	        int size = ans.size();
	        for (int j = 0; j < size; j++) {
	            int t = ans.removeFirst();
	            if (t == 0) continue;
	            int mod = t % 10;
	            if (k == 0) {
	                ans.add(t * 10 + mod);
	                continue;
	            }
	            if (mod - k >= 0) {
	                ans.add(t * 10 + mod - k);
	            }
	            if (mod + k < 10) {
	                ans.add(t * 10 + mod + k);
	            }
	        }
	    }
	    int[] arr = new int[ans.size()];
	    int i = 0;
	    while (!ans.isEmpty()) {
	        arr[i++] = ans.removeFirst();
	    }
	    return arr;
	    }
}
