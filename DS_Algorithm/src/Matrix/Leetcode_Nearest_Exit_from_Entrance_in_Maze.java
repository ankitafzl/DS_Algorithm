package Matrix;
import java.util.*;
public class Leetcode_Nearest_Exit_from_Entrance_in_Maze {
	public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        Deque<int[]> dq = new ArrayDeque<>();
        dq.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        int ans = 0;
        int[] dir = {-1, 0, 1, 0, -1};
        while (!dq.isEmpty()) {
            ++ans;
            for (int k = dq.size(); k > 0; --k) {
                int[] p = dq.poll();
                int i = p[0];
                int j = p[1];
                for (int l = 0; l < 4; ++l) {
                    int x = i + dir[l], y = j + dir[l + 1];
                    if (x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == '.') {
                        if (x == 0 || x == m - 1 || y == 0 || y == n - 1) {
                            return ans;
                        }
                        dq.offer(new int[] {x, y});
                        maze[x][y] = '+';
                    }
                }
            }
        }
        return -1;
    }
}
