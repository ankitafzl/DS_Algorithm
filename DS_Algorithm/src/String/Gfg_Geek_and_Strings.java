package String;
import java.util.*;
public class Gfg_Geek_and_Strings {
	static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
        // code here
        Map<String,Integer> map=new HashMap<>();
        for(String str:query){
            map.put(str,0);
        }
        
        for(String str:li){
            StringBuilder sb=new StringBuilder();
            for(char ch:str.toCharArray()){
                sb.append(ch);
                if(map.containsKey(sb.toString())){
                    map.put(sb.toString(),map.get(sb.toString())+1);
                }
            }
        }
        List <Integer> ans = new ArrayList<>();
        for (String str: query){
            ans.add(map.get(str));
        }
        return ans;
    }
}
