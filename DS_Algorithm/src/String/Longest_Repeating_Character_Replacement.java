package String;
import java.util.*;
public class Longest_Repeating_Character_Replacement {
	 public int characterReplacement(String s, int k) {
	        Map<Character,Integer> map=new HashMap<>();
	        int j=0;
	        int max_length=0;
	        int max_count_repeating_length=0;
	        for(int i=0;i<s.length();i++){
	            char r_ch=s.charAt(i);
	            map.put(r_ch,map.getOrDefault(r_ch,0)+1);
	            max_count_repeating_length=Math.max(max_count_repeating_length,map.get(r_ch));
	            
	            if(i-j+1-max_count_repeating_length>k){
	                char l_ch=s.charAt(j);
	                map.put(l_ch,map.get(l_ch)-1);
	                j++;
	            }
	            max_length=Math.max(max_length,i-j+1);
	        }
	        return max_length;
	    }
}
