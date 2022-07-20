package String;
import java.util.*;
public class Leetcode_Number_of_Matching_Subsequences {

	 public int numMatchingSubseq(String s, String[] words) {
	        Map<Character,Queue<String>> map=new HashMap<>();
	        int count=0;
	        for(int i=0;i<s.length();i++){
	            map.putIfAbsent(s.charAt(i),new LinkedList<>());
	        }
	        
	        for(String w:words){
	            char s_char=w.charAt(0);
	            if(map.containsKey(s_char)){
	                map.get(s_char).offer(w);
	            }
	        }
	        
	        for(int i=0;i<s.length();i++){
	            char s_char=s.charAt(i);
	            Queue<String> q=map.get(s_char);
	            int len=q.size();
	            for(int j=0;j<len;j++){
	                String str=q.poll();
	                if(str.substring(1).length()==0){
	                    count++;
	                }else{
	                    if(map.containsKey(str.charAt(1))){
	                        map.get(str.charAt(1)).add(str.substring(1));
	                    }
	                }
	            }
	        }
	        return count;
	    }
}
