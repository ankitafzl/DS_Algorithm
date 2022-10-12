package String;
import java.util.*;
public class Gfg_Save_Your_Life {
	static String maxSum(String w,char x[],int b[], int n){
        //code here
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(x[i],b[i]);
        }
        
        StringBuilder ans=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        
        int max=Integer.MIN_VALUE;
        int curr=0;
         for(char ch:w.toCharArray()){
             curr+=map.containsKey(ch)?map.get(ch):ch;
             sb.append(ch);
             if(curr>max){
                 max=curr;
                 ans=new StringBuilder(sb);
             }
             
             if(curr<0){
                 curr=0;
                 sb=new StringBuilder();
             }
         }
        return ans.toString();
    }
}
