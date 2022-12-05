package String;
import java.util.*;
public class Leetcode_Determine_if_Two_Strings_Are_Close {
	public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }

        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(char ch:word1.toCharArray()){
            freq1[ch-'a']++;
        }

        for(char ch:word2.toCharArray()){
            freq2[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if((freq1[i]==0 && freq2[i]!=0) || (freq1[i]!=0 && freq2[i]==0)){
                return false;
            }
        }

        Map<Integer,Integer> map=new HashMap<>();

        for(int i:freq1){
            if(i>0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }

        for(int i: freq2){
            if(i>0){
                if(!map.containsKey(i)){
                    return false;
                }
                map.put(i,map.get(i)-1);
                if(map.get(i)==0){
                    map.remove(i);
                }
            }
        }

        return map.size()==0;
    }
}
