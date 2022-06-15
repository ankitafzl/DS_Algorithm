package String;
import java.util.*;
public class Longest_String_Chain {

	public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int ans=0;
        Map<String,Integer> map=new HashMap<>();
        for(String w:words){
            map.put(w,1);
            for(int i=0;i<w.length();i++){
                StringBuilder sb=new StringBuilder(w);
                String next=sb.deleteCharAt(i).toString();
                if(map.containsKey(next)){
                     map.put(w,Math.max(map.get(w),map.get(next)+1));
                }
            }
            ans=Math.max(ans,map.get(w));
        }
        return ans;
    }
}
