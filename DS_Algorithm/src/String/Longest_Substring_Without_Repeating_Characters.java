package String;
import java.util.*;
public class Longest_Substring_Without_Repeating_Characters {

   public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(set.add(ch)){
                max=Math.max(max,j-i+1);
                j++;
            }
            else{
                while(s.charAt(i)!=ch){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(ch);
                i++;
            }
        }
        return max;
    }
}
