package Maths;
import java.util.*;
public class Gfg_Print_the_pattern {
	static List<String> pattern(int n){
        // code here
        int x=1;
        List<String> ans=new ArrayList<>();
         for(int i=0;i<n;i++){
             StringBuilder sb=new StringBuilder();
             
             for(int j=0;j<i;j++){
                 sb.append("--");
             }
             
             for(int j=0;j<n-i;j++){
                 sb.append(x+"*");
                 x++;
             }
             ans.add(sb.toString());
         }
         
         for(int i=n-1;i>=0;i--){
             StringBuilder sb=new StringBuilder(ans.get(i));
             for(int j=0;j<n-i;j++){
                 sb.append(x+"*");
                 x++;
             }
             sb.deleteCharAt(sb.length()-1);
             ans.set(i,sb.toString());
         }
         return ans;
    }
}
