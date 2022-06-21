package Arrays;
import java.util.*;
public class Furthest_Building_You_Can_Reach {

	 public int furthestBuilding(int[] heights, int bricks, int ladders) {
	        PriorityQueue<Integer> queue=new PriorityQueue<>();
	        int n=heights.length;
	        int bricks_used=0;
	        
	        for(int i=1;i<n;i++){
	            int diff=heights[i]-heights[i-1];
	            if(diff>0){
	                queue.add(diff);
	                if(queue.size()>ladders){
	                    bricks_used+=queue.remove();
	                }
	                if(bricks_used>bricks){
	                    return i-1;
	                }
	            }
	        }
	        return n-1;
	    }
}
