package Arrays;
import java.util.*;
public class Leetcode_the_skyline_problem {
	class Point {
        int pos, height;
        public Point(int pos, int height) {
            this.pos = pos;
            this.height = height;
        }
    }
    
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> ans = new ArrayList<>();
        if (isInvalid(buildings)) {
            return ans;
        }
        int m = buildings.length;
        PriorityQueue<Point> queue = new PriorityQueue<>((a, b) -> a.pos == b.pos ? a.height - b.height : a.pos - b.pos);
        for (int i = 0; i < m; i++) {
            queue.offer(new Point(buildings[i][0], -buildings[i][2]));
            queue.offer(new Point(buildings[i][1], buildings[i][2]));
        }
        PriorityQueue<Integer> maxHeightQueue = new PriorityQueue<>(Collections.reverseOrder());
        maxHeightQueue.offer(0);
        int prevPeak = maxHeightQueue.peek();

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            if (point.height < 0) maxHeightQueue.offer(-point.height);
            else maxHeightQueue.remove(point.height); // is end point of a building
            
            int currPeak = maxHeightQueue.peek();
            if (currPeak != prevPeak) {
                List<Integer> list = new ArrayList<>();
                list.add(point.pos);
                list.add(currPeak);
                ans.add(list);
                prevPeak = currPeak;
            }
        }
        return ans;
    }
    
    private boolean isInvalid(int[][] buildings) {
        return buildings == null || buildings.length == 0 || buildings[0] == null || buildings[0].length == 0;
    }
}
