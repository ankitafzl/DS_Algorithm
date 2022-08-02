package String;
import java.util.*;
public class Minimum_Index_Sum_of_Two_Lists {
	public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> ans = new ArrayList<>();//null;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }
        
        for (int i = 0; i < list1.length; i++) {
            if (map2.containsKey(list1[i])) {
                int sum = map1.get(list1[i]) + map2.get(list1[i]);
                if (sum < min) {
                    min = sum;
                    ans = new ArrayList<String>();
                    ans.add(list1[i]);
                }
                else if (sum == min) {
                    ans.add(list1[i]);
                }
            }
        }
        
        String[] ans1 = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ans1[i] = ans.get(i);
        }
        
        return ans1;
    }
}
