package String;
import java.util.*;
public class Uncommon_Words_from_Two_Sentences {

	 public String[] uncommonFromSentences(String s1, String s2) {
	        Map<String,Integer> map=new HashMap<>();
	        
	        String[] s1_arr=s1.split("\\s+");
	        String[] s2_arr=s2.split("\\s+");
	        
	        for(int i=0;i<s1_arr.length;i++){
	            if(map.containsKey(s1_arr[i])){
	                map.put(s1_arr[i],map.get(s1_arr[i])+1);
	            }
	            else{
	                map.put(s1_arr[i],1);
	            }
	        }
	        
	        for(int i=0;i<s2_arr.length;i++){
	            if(map.containsKey(s2_arr[i])){
	                map.put(s2_arr[i],map.get(s2_arr[i])+1);
	            }
	            else{
	                map.put(s2_arr[i],1);
	            }
	        }
	        
	        Set<String> set=new HashSet<>();
	        for(String str:map.keySet()){
	            if(map.get(str)>1){
	                continue;
	            }
	            set.add(str);
	        }
	        String []ans=new String[set.size()];
	        int ind=0;
	        for(String str:set){
	            ans[ind++]=str;
	        }
	        return ans;
	    }
}
