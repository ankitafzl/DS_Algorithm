package String;
import java.util.*;
public class Leetcode_Word_Subsets {
	public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list=new ArrayList<>();
        int freq[]=new int[26];
        for(String word:words2){
            Map<Character,Integer> map=new HashMap<>();
            for(char ch:word.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
                freq[ch-'a']=Math.max(map.get(ch),freq[ch-'a']);
            }
        }
        
        for(String word:words1){
             Map<Character,Integer> map=new HashMap<>();
             for(char ch:word.toCharArray()){
                  map.put(ch,map.getOrDefault(ch,0)+1);
             }
            
             boolean valid=true;
             for (char ch = 'a'; ch <= 'z'; ch++) {
                if (freq[ch - 'a'] > 0 && (!map.containsKey(ch) || map.get(ch).intValue() < freq[ch - 'a'])) {
                    valid = false;
                    break;
                }
            }
            if (valid==true) {
                list.add(word);
            }
        }
        
        return list;
    }
}
