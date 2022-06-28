package String;
import java.util.*;
public class Leetcode_Group_Anagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            } 
            map.get(sorted).add(str);
        }
        list.addAll(map.values());
        return list;
    }
}
