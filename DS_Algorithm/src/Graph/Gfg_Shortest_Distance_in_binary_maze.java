package Graph;
import java.util.*;
public class Gfg_Shortest_Distance_in_binary_maze {
	class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    
    int shortestPath(int[][] grid, int[] source, int[] destination) {
         
        // Your code here
       Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(source[0],source[1]));
        grid[source[0]][source[1]]=0;
        int dis=0;
        while(!queue.isEmpty()){
            int n=queue.size();
            while(n-->0){
                Pair curr=queue.remove();
                int i=curr.x;
                int j=curr.y;
                if(i==destination[0] && j==destination[1])return dis;
                if(i>0 && grid[i-1][j]==1){
                    grid[i-1][j]=0;
                    queue.add(new Pair(i-1,j));
                }
                if(j>0 && grid[i][j-1]==1){
                    grid[i][j-1]=0;
                    queue.add(new Pair(i,j-1));
                }
                if(i<grid.length-1 && grid[i+1][j]==1){
                    grid[i+1][j]=0;
                    queue.add(new Pair(i+1,j));
                }
                if(j<grid[0].length-1 && grid[i][j+1]==1){
                    grid[i][j+1]=0;
                    queue.add(new Pair(i,j+1));
                }
            }
            dis++;
        }
        return -1;
    }
}
