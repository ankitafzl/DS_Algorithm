package Greedy;
import java.util.*;
public class Longest_Palindrome {
	 public int longestPalindrome(String s) {
         HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }                                                                                           
        int ans=0;
        boolean odd=false;
        for(int i:map.values()){
            if(i%2==0){
                ans+=i;
            }
            else{
                odd=true;
                ans+=i-1;
            }
        }
        if(odd==true){
            ans++;
        }
        return ans;
    }
}
