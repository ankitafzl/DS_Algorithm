package Arrays;
import java.util.*;
public class Leetcode_level_2_Merge_Intervals {
	public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        int n=intervals.length;
        
        if(n==0 || intervals==null){
            return ans.toArray(new int[0][]);
        }
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int st=intervals[0][0];
        int end=intervals[0][1];
        
        for(int[] i:intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]);
            }
            else{
                ans.add(new int[]{st,end});
                st=i[0];
                end=i[1];
            }
        }
        ans.add(new int[]{st,end});
        return ans.toArray(new int[0][]);
    }
}
