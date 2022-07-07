package Arrays;
import java.util.*;
public class Relative_Sort_Array {

	 public int[] relativeSortArray(int[] arr1, int[] arr2) {
	        TreeMap<Integer, Integer> map = new TreeMap<>();
	        for (int i: arr1) {
	            map.put(i, map.getOrDefault(i, 0) + 1);
	        }    
	        int j = 0;
	        for (int i: arr2) {
	            while (map.get(i) > 0) {
	                 arr1[j] = i;
	                 j++;
	                 map.put(i, map.get(i) - 1);
	            }
	        }

	        for (int i: map.keySet()) {
	            while (map.get(i) > 0) {
	                 arr1[j] = i;
	                 j++;
	                 map.put(i, map.get(i) - 1);
	            }
	        }

	        return arr1;
	    }
}
