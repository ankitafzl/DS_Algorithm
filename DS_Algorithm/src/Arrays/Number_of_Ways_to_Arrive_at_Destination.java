package Arrays;
import java.util.*;
public class Number_of_Ways_to_Arrive_at_Destination {
	static int min  ;
    static int count ;
    static int countPaths(int n, List<List<Integer>> roads) {
        ArrayList<ArrayList<Edge>> adj_list = new ArrayList<>() ;

        for(int i = 0 ; i < n ; i++){
            adj_list.add( new ArrayList<>()) ;
        }

        for(List<Integer> list1 : roads){
            int u = list1.get(0) ;
            int v = list1.get(1) ;
            int wt = list1.get(2) ;

            adj_list.get(u).add(new Edge(u,v,wt)) ;
            adj_list.get(v).add(new Edge(v,u,wt)) ;
        }

        min = (int)1e9 ;
        count = 0 ;
        boolean[] visited = new boolean[n] ;

        solve(0, adj_list, visited, 0) ;
        return count ;
    }

    static void solve(int x, ArrayList<ArrayList<Edge>> adj_list, boolean[] visited, int sum ){
        if(x == adj_list.size() - 1){
            if(min == sum){
                count++ ;
            }
            else if(sum < min){
                min = sum ;
                count = 1 ;
            }
            return  ;
        }
        if(sum > min) {
            return ;
        }

        visited[x] = true ;

        for(Edge e : adj_list.get(x)){
            if(visited[e.v] == false){
                solve(e.v , adj_list, visited, sum + e.wt);
            }
        }

        visited[x] = false;
    }

    static class Edge{
        int u ; 
        int v ;
        int wt ;

        Edge(int x, int y, int z){
            u = x ;
            v = y ;
            wt = z ;
        }
    }
}
