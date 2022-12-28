package Graph;
import java.util.*;
public class Leetcode_Keys_and_Rooms {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[n];
        visited[0]=true;
        for(int i:rooms.get(0)){
            queue.add(i);
            visited[i]=true;
        }
        while(!queue.isEmpty()){
            int temp=queue.poll();
            for(int i:rooms.get(temp)){
                if(visited[i]==false){
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
        for(int i=1;i<visited.length;i++){
            if(visited[i]==false){
                return false;
            }
        }
        return true;
    }
}
