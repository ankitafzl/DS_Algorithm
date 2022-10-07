package Arrays;
import java.util.*;
public class Leetcode_My_Calendar_III {
	 TreeMap<Integer, Integer> map;
	    public Leetcode_My_Calendar_III() {
	         map = new TreeMap<>(); 
	    }
	    
	    public int book(int start, int end) {
	         map.put(start, map.getOrDefault(start, 0)+1);
	         map.put(end, map.getOrDefault(end, 0)-1);
	         
	         int ans = 0;
	         int ongoing = 0;
	         for(int count : map.values()){
	             ongoing += count;
	             ans = Math.max(ans, ongoing);
	         }
	         
	         return ans;
	    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */
