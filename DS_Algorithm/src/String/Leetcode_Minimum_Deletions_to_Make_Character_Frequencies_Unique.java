package String;
import java.util.*;
public class Leetcode_Minimum_Deletions_to_Make_Character_Frequencies_Unique {

	public int minDeletions(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        Set<Integer> set=new HashSet<>();
        int del_count=0;
        for(int i=0;i<26;i++){
            int curr_freq=freq[i];
            while(curr_freq>0){
                if(set.contains(curr_freq)){
                    curr_freq--;
                    del_count++;
                }
                else{
                    break;
                }
            }
            if(curr_freq!=0){
                set.add(curr_freq);
            }
        }
        return del_count;
    }
}
