package Matrix;
import java.util.*;
public class Gfg_Distance_of_nearest_cell_having_1 {
	 //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int m = grid.length;
        int n= grid[0].length;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

         //using dp list which will store the output.
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        //queue to store the cell indexes which have grid value 1.
        Queue<ArrayList<Integer>> queue = new LinkedList<>(); 

        //traversing all the cells of the matrix.
        for(int i = 0; i < m; i++)
        {
			for(int j = 0; j < n; j++)
			{
			    //if grid value is 1, we update the dp value at same cell as 0 
			    //and push the cell indexes into queue.
				if(grid[i][j] == 1){
					dp[i][j] = 0;
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(i);
					temp.add(j);
					queue.add(temp);
				}
			}
		}

		while(!queue.isEmpty())
		{
		    //storing the cell indexes at top of queue and popping them.
			ArrayList <Integer> curr = queue.poll();
			int x = curr.get(0);
			int y = curr.get(1);

			//iterating over the adjacent cells.
			for(int i = 0; i < 4; i++)
			{
				int nx = x + dx[i];
				int ny = y + dy[i];

				if((nx>=0 && nx<m && ny>=0 && ny<n)&& dp[nx][ny] > dp[x][y])
				{
				    //updating dp and pushing cell indexes in queue.
					dp[nx][ny] = dp[x][y] + 1;
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(nx);
					temp.add(ny);
					queue.add(temp);
				}
			}
		}
		//returning the dp list.
		return dp;
    }
}
