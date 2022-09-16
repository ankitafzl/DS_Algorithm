package Arrays;
import java.util.*;
public class Leetcode_Find_Original_Array_From_Doubled_Array {
	 public int[] findOriginalArray(int[] changed) {
	        List<Integer> ans=new ArrayList<Integer>();
	        Queue<Integer> q=new LinkedList<>();
	        Arrays.sort(changed);
	        for(int num:changed){
	            if(!q.isEmpty() && num==q.peek()){
	                q.poll();
	            }
	            else{
	                q.offer(num*2);
	                ans.add(num);
	            }
	        }
	        return !q.isEmpty() ? new int[]{}:ans.stream().mapToInt(i->i).toArray();
	    }
}
