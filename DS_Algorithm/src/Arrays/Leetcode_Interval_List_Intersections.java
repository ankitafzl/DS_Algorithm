package Arrays;
import java.util.*;
public class Leetcode_Interval_List_Intersections {
	 public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
	        List<int[]> list = new ArrayList<>();

	        int i = 0, j = 0;
	        int m = firstList.length;
	        int n = secondList.length;
	        while (i < m && j < n) {
	            int low = Math.max(firstList[i][0], secondList[j][0]);
	            int high = Math.min(firstList[i][1],secondList[j][1]);
	            if (low <= high){
	                 list.add(new int[]{low, high});
	            } 
	           
	            if (firstList[i][1] < secondList[j][1]) {
	                i++;
	            }
	            else{
	                j++;
	            } 
	        }
	       
	        int[][] ans = new int[list.size()][2];
	        for (int k = 0; k < list.size(); k++) {
	            ans[k] = list.get(k);
	        }
	       
	        return ans;
	    }
}
