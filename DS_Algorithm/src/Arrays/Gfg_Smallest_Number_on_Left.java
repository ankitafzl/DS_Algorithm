package Arrays;
import java.util.*;
public class Gfg_Smallest_Number_on_Left {
	static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        Stack<Integer> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(stack.size()==0){
                list.add(-1);
            }
            else if(stack.size()>0 && stack.peek()<a[i]){
                list.add(stack.peek());
            }
            else if(stack.size()>0 && stack.peek()>=a[i]){
                while(stack.size()>0 && stack.peek()>=a[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    list.add(-1);
                }
                else{
                    list.add(stack.peek());
                }
            }
            stack.push(a[i]);
        }
        return list;
    }
}
