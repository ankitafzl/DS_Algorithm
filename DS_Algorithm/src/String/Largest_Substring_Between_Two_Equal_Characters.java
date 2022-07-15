package String;
import java.util.*;
public class Largest_Substring_Between_Two_Equal_Characters {
	public int maxLengthBetweenEqualCharacters(String s) {
	       Map<Character,Integer> map=new HashMap<>();
	       int max=-1;
	       for(int i=0;i<s.length();i++){
	           char ch=s.charAt(i);
	           if(map.containsKey(ch)){
	               max=Math.max(max,i-map.get(ch)-1);
	           }
	           else{
	               map.put(ch,i);
	           }
	       }
	        return max;
	    }
}
