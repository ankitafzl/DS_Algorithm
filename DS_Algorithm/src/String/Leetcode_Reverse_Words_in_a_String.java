package String;
//import java.util.*;
public class Leetcode_Reverse_Words_in_a_String {
	public String reverseWords(String s) {
        int i=0;
        int n=s.length();
        String ans=new String();

        while(i<n){
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            if(i>=n){
                break;
            }
            int j=i+1;
            while(j<n && s.charAt(j)!=' '){
                j++;
            }
            String sb=s.substring(i,j);
            if(ans.length()==0){
                ans=sb;
            }
            else{
                ans=sb+" "+ans;
            }
            i=j+1;
        }
        return ans;
    }
}
