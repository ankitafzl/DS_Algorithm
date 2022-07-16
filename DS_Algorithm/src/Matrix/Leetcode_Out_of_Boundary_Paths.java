package Matrix;

public class Leetcode_Out_of_Boundary_Paths {

	private static int [][]d=new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int dp[][][]=new int[maxMove+1][m][n];
        for(int k = 1; k <= maxMove; k++){
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    int temp_row = 0, temp_col = 0;
                    for(int x = 0; x < 4; x++){
                        temp_row = i + d[x][0];
                        temp_col = j + d[x][1];
                        if(temp_row < 0 || temp_row >= m || temp_col < 0 || temp_col >= n){
                            dp[k][i][j] += 1;
                        }
                        else{
                            dp[k][i][j] = (dp[k][i][j] + dp[k - 1][temp_row][temp_col]) % 1000000007;
                        }
                    }
                }
            }
        }
        return dp[maxMove][startRow][startColumn];    
    }
}
