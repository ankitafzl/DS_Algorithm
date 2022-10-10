package Arrays;
import java.util.*;
public class Leetcode_level_2_Insert_Interval {
	public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        
        while(i<n && intervals[i][1]<newInterval[0]){
            ans.add(intervals[i++]);
        }
        int x[]=newInterval;
        while(i<n && intervals[i][0]<=newInterval[1]){
            x[0]=Math.min(x[0],intervals[i][0]);
            x[1]=Math.max(x[1],intervals[i++][1]);
        }
        ans.add(x);
        while(i<n){
            ans.add(intervals[i++]);
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}
