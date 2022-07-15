package String;
import java.util.*;
public class Remove_Duplicate_Letters {
	 public String removeDuplicateLetters(String s) {
	        int []last_index=new int[26];
	        for(int i=0;i<s.length();i++){
	            last_index[s.charAt(i)-'a']=i;
	        }
	        boolean []b=new boolean[26];
	        Stack<Integer> stack=new Stack<>();
	        for(int i=0;i<s.length();i++){
	            int c=s.charAt(i)-'a';
	            if(b[c]==true){
	                continue;
	            }
	            while(!stack.isEmpty() && stack.peek() > c && i<last_index[stack.peek()]){
	                b[stack.pop()]=false;
	            }
	            stack.push(c);
	            b[c]=true;
	        }
	        StringBuilder sb=new StringBuilder();
	        while(!stack.isEmpty()){
	            sb.append((char)(stack.pop()+'a'));
	        }
	        return sb.reverse().toString();
	    }
}
