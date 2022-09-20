package Arrays;
import java.util.*;
public class Leetcode_Find_Duplicate_File_in_System {
	public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for(String p : paths) {
            String[] path_arr = p.split(" ");
            String dir = path_arr[0] + '/';
            for (int i = 1; i < path_arr.length; i++) {
                int start = path_arr[i].indexOf('(');
                String fileName = dir + path_arr[i].substring(0, start);
                String content = path_arr[i].substring(start + 1, path_arr[i].length() - 1);
                map.putIfAbsent(content, new ArrayList<>());
                map.get(content).add(fileName);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                ans.add(map.get(key));
            }
        }
        return ans;
    }
}
