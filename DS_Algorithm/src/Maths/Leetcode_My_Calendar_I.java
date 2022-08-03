package Maths;
import java.util.*;
public class Leetcode_My_Calendar_I {
	TreeMap<Integer, Integer> t_map;
    public Leetcode_My_Calendar_I() {
        t_map = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer prev = t_map.floorKey(start);
        Integer next = t_map.ceilingKey(start);
        
        if ((prev == null || t_map.get(prev) <= start) && (next == null || end <= next)) {
            t_map.put(start, end);
            return true;
        }
        return false;
    }
}
