package Graph;
import java.util.*;
public class Gfg_Number_of_Distinct_Islands {

	int countDistinctIslands(int[][] grid) {
        // Your Code here
        int m=grid.length;
        int n=grid[0].length;
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    List<Integer> list=new ArrayList<>();
                    dfs(grid,i,j,list,i,j);
                    set.add(list);
                }
            }
        }
        return set.size();
    }
    
    void dfs(int [][]grid,int i,int j,List<Integer> list, int x,int y){
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        list.add(i-x);
        list.add(j-y);
        dfs(grid,i+1,j,list,x,y);
        dfs(grid,i-1,j,list,x,y);
        dfs(grid,i,j+1,list,x,y);
        dfs(grid,i,j-1,list,x,y);
    }
}
