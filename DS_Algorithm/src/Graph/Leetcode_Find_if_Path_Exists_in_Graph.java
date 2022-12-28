package Graph;
import java.util.*;
public class Leetcode_Find_if_Path_Exists_in_Graph {
	private boolean temp;    
    public boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] visited = new boolean[n];
        HashSet<Integer>[] graph = new HashSet[n];
       // int i, j;        
        for(int i = 0; i < n; i++){
            graph[i] = new HashSet<Integer>();
        }        
        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }        
		if(graph[start].contains(end)){  // direct connection exists
             return true;
        }		
        temp = false;
        dfs(graph, visited, start, end);
        return temp;
    }
    
    private void dfs(HashSet<Integer>[] graph, boolean[] visited, int start, int end){
        if(!visited[start] && temp==false){
            if(start == end){
                temp = true;
                return;
            }
            
            visited[start] = true;
            for(Integer i : graph[start]){
                dfs(graph, visited, i, end);
            }
        }
    }
}
