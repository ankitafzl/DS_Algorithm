package Matrix;

public class Max_Area_of_Island {
	 public int maxAreaOfIsland(int[][] grid) {
	        int m=grid.length;
	        int n=grid[0].length;
	        int max=0;
	        
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(grid[i][j]==1){
	                    max=Math.max(max,get_curr_area(grid,i,j));
	                }
	            }
	        }
	        return max;
	    }
	    
	    private int get_curr_area(int grid[][],int i,int j){
	        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]<=0){
	            return 0;
	        }
	        grid[i][j]=-1;
	        int left_area=get_curr_area(grid,i,j-1);
	        int right_area=get_curr_area(grid,i,j+1);
	        int up_area=get_curr_area(grid,i-1,j);
	        int down_area=get_curr_area(grid,i+1,j);
	        
	        int total_area=1+left_area+right_area+up_area+down_area;
	        return total_area;
	    }
}
