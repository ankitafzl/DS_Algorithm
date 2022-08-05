package String;
import java.util.*;
public class Top_K_Frequent_Words {
	public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        //int len = words.length;
        
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>(
            (w1, w2) -> map.get(w1).equals(map.get(w2)) ? w2.compareTo(w1) : map.get(w1) - map.get(w2));
        
        for (String word : map.keySet()) {
            pq.offer(word);
            
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        List<String> ans = new ArrayList<>();
        
        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }
        
        Collections.reverse(ans);
        return ans;
    }
}
