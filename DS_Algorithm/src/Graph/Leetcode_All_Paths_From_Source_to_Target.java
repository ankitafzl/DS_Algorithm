package Graph;
import java.util.*;
public class Leetcode_All_Paths_From_Source_to_Target {
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> curr = new ArrayList<>();
        curr.add(0);
        dfs(0, curr, graph, graph.length - 1, ans);
        return ans;
    }
   private void dfs(int src, List<Integer> curr, int graph[][], int des, List<List<Integer>> ans){
        if(src == des) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i : graph[src]){
            curr.add(i);
            dfs(i, curr, graph, des, ans);
            curr.remove(curr.size()-1);
        } 
    }
}
