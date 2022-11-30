package Map;
import java.util.*;
public class Leetcode_Find_Players_With_Zero_or_One_Losses {
	 public List<List<Integer>> findWinners(int[][] matches) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int[] match : matches) {
	            int win = match[0];
	            int los = match[1];
	            map.put(win, map.getOrDefault(win, 0));
	            map.put(los, map.getOrDefault(los, 0) + 1);
	        }

	        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
	        for (Integer player : map.keySet())
	            if (map.get(player) == 0) {
	                ans.get(0).add(player);
	            } else if (map.get(player) == 1) {
	                ans.get(1).add(player);
	            }
	        
	        Collections.sort(ans.get(0));
	        Collections.sort(ans.get(1));

	        return ans;
	    }
}
