package Arrays;
import java.util.*;
public class Leetcode_Erect_the_Fence {
	public int orientation(int[] p, int[] q, int[] r) {
        return (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1]);
   }
   public int[][] outerTrees(int[][] points) {
       Arrays.sort(points, new Comparator<int[]> () {
           public int compare(int[] p, int[] q) {
               return q[0] - p[0] == 0 ? q[1] - p[1] : q[0] - p[0];
           }
       });
       Stack<int[]> stack = new Stack<>();
       for (int i = 0; i < points.length; i++) {
           while (stack.size() >= 2 && orientation(stack.get(stack.size() - 2), stack.get(stack.size() - 1), points[i]) > 0){
               stack.pop();
           }
           stack.push(points[i]);
       }
       stack.pop();
       for (int i = points.length - 1; i >= 0; i--) {
           while (stack.size() >= 2 && orientation(stack.get(stack.size() - 2), stack.get(stack.size() - 1), points[i]) > 0){
               stack.pop();
           }
           stack.push(points[i]);
       }
       HashSet<int[]> set = new HashSet<>(stack);
       return set.toArray(new int[set.size()][]);
   }
}
