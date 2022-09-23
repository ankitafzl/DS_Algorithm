package String;
import java.util.*;
public class Gfg_Geek_and_Number_String {
	public int minLength(String s, int n) { 
    	// code here 
    	Stack<Integer> stack=new Stack<>();
    	int pair[]=new int[]{9,2,1,4,3,6,5,8,7,0};
    	for(char ch:s.toCharArray()){
    	    int k=ch-'0';
    	    if(stack.size()==0){
    	        stack.push(k);
    	    }
    	    else{
    	        if(stack.peek()==pair[k]){
    	            stack.pop();
    	        }
    	        else{
    	            stack.push(k);
    	        }
    	    }
    	}
    	return stack.size();
    }
}
