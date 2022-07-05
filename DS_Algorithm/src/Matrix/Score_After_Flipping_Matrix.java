package Matrix;

public class Score_After_Flipping_Matrix {

	public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = (1 << (n - 1)) * m;
        for (int j = 1; j < n; j++) {
             int curr = 0;
             for (int i = 0; i < m; i++) {
                 curr += grid[i][j] == grid[i][0] ? 1 : 0;
             }
             ans += Math.max(curr, m - curr) * (1 << (n - j - 1));
        }
        return ans;
   }
}
