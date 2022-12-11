package String;
import java.util.*;
public class Gfg_Build_the_smallest {
	 static String buildLowestNumber(String str, int N) {
	        // code here
	        Stack<Character> stack=new Stack<>();
	        for(char ch:str.toCharArray()){
	            while(!stack.isEmpty() && stack.peek()>ch && N>0){
	                stack.pop();
	                N--;
	            }
	            stack.push(ch);
	        }

	        while(!stack.isEmpty() && N>0){
	            stack.pop();
	            N--;
	        }

	        StringBuilder sb=new StringBuilder();
	        while(!stack.isEmpty()){
	            sb.append(stack.pop());
	        }

	        while(sb.length()>0 && sb.charAt(sb.length()-1)=='0'){
	            sb.setLength(sb.length()-1);
	        }
	        if(sb.length()==0){
	            return "0";
	        }
	        return sb.reverse().toString();
	    }
}
