package Arrays;
import java.util.*;
public class Leetcode_level_2_ {
	public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        
        for(int i:asteroids){
            boolean flag=true;
            while(!stack.isEmpty() && i<0 && stack.peek()>0){
                if(-i>stack.peek()){
                    stack.pop();
                }
                else if(-i<stack.peek()){
                    flag=false;
                    break;
                }
                else{
                    flag=false;
                    stack.pop();
                    break;
                }
            }
            if(flag==true){
                stack.push(i);
            }
        }
        int temp[]=new int[stack.size()];
        for(int i=temp.length-1;i>=0;i--){
            temp[i]=stack.pop();
        }
        return temp;
    }
}
