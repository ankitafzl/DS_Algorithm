package Graph;
import java.util.*;
public class Leetcode_level_2_Bus_Routes {
	public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target) {
            return 0;
        }
        
        int n=routes.length;
      
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < routes[i].length; j++){
                List<Integer> list = map.containsKey(routes[i][j]) ? map.get(routes[i][j]): new ArrayList<>();
                list.add(i);
                map.put(routes[i][j], list);
            }
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        int step = 0;
        boolean[] ride = new boolean[n];
        while(!q.isEmpty()){
            int size = q.size();
            ++step;
            for(int i = 0; i < size; i++){
                int cur = q.poll();
               
                List<Integer> list = map.get(cur);
                for(Integer bus : list){
                    if(ride[bus]) continue;
                    ride[bus] = true;
                    for(Integer stop : routes[bus]){
                        if(stop == target) return step;
                        q.offer(stop);
                    }
                }
            }
        }
        return -1;
    }
}
