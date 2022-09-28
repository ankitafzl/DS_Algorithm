package String;
import java.util.*;
public class Leetcode_level_2_Longest_Palindrome_by_Concatenating_Two_Letter_Words {
	 public int longestPalindrome(String[] words) {
         Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        int len = 0;
        int singleMaxLen = 0;
        for(String word:map.keySet()){
            String reverse = (new StringBuilder(word)).reverse().toString();
            if(!word.equals(reverse)) {
                len += word.length()*2*Math.min(map.get(word),map.getOrDefault(reverse,0));
            }
            if(word.equals(reverse)) {
                len += word.length()*2*(map.get(word)/2);
            }
            if(word.equals(reverse) && map.get(word)%2==1){
                singleMaxLen = Math.max(singleMaxLen, word.length());
            } 
            map.put(word, 0);
            if(map.containsKey(reverse)) {
                map.put(reverse, 0);
            }
        }
        return len+singleMaxLen;
    }
}
