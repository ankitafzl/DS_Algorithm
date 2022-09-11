package Stack;
import java.util.*;
public class Gfg_Stack_Permutations {
	 public static int isStackPermutation(int n, int[] ip, int[] op) {
	        // code here
	        Stack<Integer> stack=new Stack<>();
	        int j=0;
	        
	        for(int i=0;i<n;i++){
	            stack.push(ip[i]);
	            if(stack.peek()==op[j]){
	                while(!stack.isEmpty() && stack.peek()==op[j]){
	                    stack.pop();
	                    j++;
	                }
	            }
	        }
	        
	        if(stack.size()==0){
	            return 1;
	        }
	        return 0;
	    }
}
