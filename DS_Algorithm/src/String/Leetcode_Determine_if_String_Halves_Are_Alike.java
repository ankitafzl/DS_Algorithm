package String;
import java.util.*;
public class Leetcode_Determine_if_String_Halves_Are_Alike {
	public boolean halvesAreAlike(String s) {
        char ch[]=s.toCharArray();
        int st=0;
        int end=ch.length-1;
        int l_count=0;
        int r_count=0;
        Set<Character> vowels=Set.of('a','e','i','o','u','A','E','I','O','U');
        while(st<end){
            l_count+=vowels.contains(ch[st])?1:0;
            r_count+=vowels.contains(ch[end])?1:0;
            st++;
            end--;
        }
        if(l_count==r_count){
            return true;
        }
        return false;
    }
}
