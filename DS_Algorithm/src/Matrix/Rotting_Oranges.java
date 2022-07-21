package Matrix;
import java.util.*;
public class Rotting_Oranges {

	public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                } else if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int step = 0;
        while (!q.isEmpty() && freshCount > 0) {
            int len = q.size();

            for (int i = 0; i < len; i++) {
                int[] curr = q.poll();
                for (int[] dir : dirs) {
                    int next_x = curr[0] + dir[0];
                    int next_y = curr[1] + dir[1];
                    if (next_x < 0 || next_x >= m || next_y < 0 || next_y >= n || grid[next_x][next_y] != 1) {
                        continue;
                    }
                    q.offer(new int[]{next_x, next_y});
                    grid[next_x][next_y] = 2;
                    freshCount--;
                }
            }

            step++;
        }

        return freshCount == 0 ? step : -1;
    }
}
