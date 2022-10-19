package Graph;
import java.util.*;
public class Gfg_Hamiltonian_Path {
	int n;
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        // code here
        n=N;
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(ArrayList<Integer> edge:Edges){
            int src=edge.get(0);
            int des=edge.get(1);
            map.putIfAbsent(src,new ArrayList<>());
            map.putIfAbsent(des,new ArrayList<>());
            map.get(src).add(des);
            map.get(des).add(src);
        }
        
        Set<Integer> set=new HashSet<>();
        for(int i=1;i<=N;i++){
            if(dfs(i,set,map)){
                return true;
            }
        }
        return false;
    }
    
    boolean dfs(int current,Set<Integer> set,Map<Integer,ArrayList<Integer>> map){
        set.add(current);
        if(set.size()==n){
            return true;
        }
        
        for(int i:map.get(current)){
            if(!set.contains(i) && dfs(i,set,map)){
                return true;
            }
        }
        
        set.remove(current);
        return false;
    }
}
