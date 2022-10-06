package Stack;
import java.util.*;
public class Gfg_lexicographically_smallest_string {
	static String lexicographicallySmallest(String S, int k) {
        // code here
        int n=S.length();
        if(solve(n)){
            k/=2;
        }
        else{
            k*=2;
        }
        if(k>=n){
            return "-1";
        }
        int removed=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=S.charAt(i);
            while(!stack.empty() && removed<k && stack.peek()>ch){
                stack.pop();
                removed++;
            }
            stack.push(S.charAt(i));
        }
        while(removed<k){
            stack.pop();
            removed++;
        }
        StringBuilder sb=new StringBuilder();
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    
    static boolean solve(int n){
        int count=0;
        while(n>0){
            count+=(n&1);
            n>>=1;
        }
        return count>1?false:true;
    }
}
