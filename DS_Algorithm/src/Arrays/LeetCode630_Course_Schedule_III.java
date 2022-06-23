package Arrays;
import java.util.*;
public class LeetCode630_Course_Schedule_III {
	 public int scheduleCourse(int[][] courses) {
	        Arrays.sort(courses,(a,b)->a[1]-b[1]);
	        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
	        int t=0;
	        for(int course[]:courses){
	            if(t+course[0]<=course[1]){
	                pq.offer(course[0]);
	                t+=course[0];
	            }
	            else if(!pq.isEmpty() && pq.peek()>course[0]){
	                t+=course[0]-pq.poll();
	                pq.offer(course[0]);
	            }
	        }
	        return pq.size();
	    }
}
