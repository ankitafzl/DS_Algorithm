package hashing;
import java.util.*;
public class Top_K_Frequent_Elements {

	public int[] topKFrequent(int[] nums, int k) {
	     
        if (k == nums.length) {
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        } 
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        
        for (int num : map.keySet()) {
            pq.offer(num);
            
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        int[] ans = new int[k];
        
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        
        return ans;
    }
}
