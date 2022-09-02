package Matrix;
import java.util.*;
public class Leetcode_Pacific_Atlantic_Water_Flow {
	 int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
	    public List<List<Integer>> pacificAtlantic(int[][] heights) {
	        List<List<Integer>> ans=new ArrayList<>();
	        int m=heights.length;
	        int n=heights[0].length;
	        if(heights==null || heights.length==0 || heights[0].length==0){
	            return ans;
	        }
	        
	        boolean p[][]=new boolean[m][n];
	        boolean a[][]=new boolean[m][n];
	        
	        for(int i=0;i<n;i++){
	            dfs(heights,0,i,Integer.MIN_VALUE,p);
	             dfs(heights,m-1,i,Integer.MIN_VALUE,a);
	        }
	        
	        for(int i=0;i<m;i++){
	            dfs(heights,i,0,Integer.MIN_VALUE,p);
	             dfs(heights,i,n-1,Integer.MIN_VALUE,a);
	        }
	        
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(p[i][j]==true && a[i][j]==true){
	                    ans.add(Arrays.asList(i,j));
	                }
	            }
	        }
	        return ans;
	    }
	    
	    public void dfs(int[][] heights,int i,int j,int prev,boolean[][] ocean){
	        if(i<0 || i>=ocean.length || j<0 || j>=ocean[0].length){
	            return;
	        }
	        if(heights[i][j]<prev || ocean[i][j]){
	            return;
	        }
	        ocean[i][j]=true;
	        for(int d[]:dir){
	            dfs(heights,i+d[0],j+d[1],heights[i][j],ocean);
	        }
	    }
}
