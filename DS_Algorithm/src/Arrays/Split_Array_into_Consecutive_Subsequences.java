package Arrays;
import java.util.*;
public class Split_Array_into_Consecutive_Subsequences {
	public boolean isPossible(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int val : nums) {
             if (map.containsKey(val - 1) && map.get(val - 1).size() > 0) {             
                  PriorityQueue<Integer> pq = map.get(val - 1);
                  int len = pq.poll();
                  if (map.get(val) == null) {
                       map.put(val, new PriorityQueue<>());
                  }
                  map.get(val).add(len + 1);
             } 
             else {
                 if (map.get(val) == null) {
                       map.put(val, new PriorityQueue<>());
                 }
                 map.get(val).add(1);
             }
        }
            for (PriorityQueue<Integer> pq : map.values()) {
                while (pq.size() > 0) {
                    if (pq.poll() < 3) {
                        return false;
                    }
                }
            }
 
          return true;
   }
}
