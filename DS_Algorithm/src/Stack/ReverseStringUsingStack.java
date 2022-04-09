package Stack;
import java.util.Stack;
public class ReverseStringUsingStack {
     
      public static String reverseString(String str){
    	  Stack<Character> stack=new Stack<>();
    	  char[] chars=str.toCharArray();
    	  
    	  for(char c:chars)
    		  stack.push(c);
    	  
    	  for(int i=0;i<str.length();i++){
    		  chars[i]=stack.pop();
    	  }
    	  return new String(chars);
      }
      
      public static void main(String []args){
    	  String str="ABCD";
    	  System.out.println("Before Reverse : "+str);
    	  System.out.println();
    	  System.out.println("After Reverse : "+reverseString(str));
      }
}
