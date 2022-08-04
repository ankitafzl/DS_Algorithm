package Arrays;
import java.util.*;
public class Unique_Number_of_Occurrences {
	public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (map.containsKey(temp)) {
                 map.put(temp, map.get(temp) + 1);
            } 
            else {
                 map.put(temp, 1);
            }
         }
         List<Integer> list = new ArrayList<>();
         Iterator<Map.Entry<Integer, Integer>> it= map.entrySet().iterator();
         while (it.hasNext()) {
             int v = it.next().getValue();
             if (list.contains(v)) {
                 return false;
             }
             else{
                 list.add(v);
             }
         }
         return true;
    }
}
