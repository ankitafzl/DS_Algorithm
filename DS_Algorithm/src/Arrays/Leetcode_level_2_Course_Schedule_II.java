package Arrays;
import java.util.*;
public class Leetcode_level_2_Course_Schedule_II {
	int[] visited;
    @SuppressWarnings("rawtypes")
	List[] inDegreeEdges;
    List<Integer> sortedList = new ArrayList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) {
            return new int[numCourses];
        }
        
        inDegreeEdges = buildInDegreeEdges(numCourses, prerequisites);
        visited = new int[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            if(!dfs(i)) {
                return new int[]{ };
            }
        }
        
        int[] rst = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            rst[i] = sortedList.get(i);
        }
        
        return rst;
    }    
    
    public boolean dfs(int node) {
        if (visited[node] == 1) {
            return true;
        }
        if (visited[node] == -1) {
            return false; 
        }
        
        visited[node] = -1;
        List<Integer> dependencies = inDegreeEdges[node];
        for (Integer childNode : dependencies) {
            if (!dfs(childNode)) {
                return false;
            }
        }
        visited[node] = 1;
        sortedList.add(0, node);
        return true;
    }

    private List[] buildInDegreeEdges(int numCourses, int[][] prerequisites) {
        List[] inDegreeEdges = new ArrayList[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            inDegreeEdges[i] = new ArrayList<Integer>();
        }
        
        for (int[] prerequisite : prerequisites) {
            inDegreeEdges[prerequisite[1]].add(prerequisite[0]);
        }
        return inDegreeEdges;
    }
}
