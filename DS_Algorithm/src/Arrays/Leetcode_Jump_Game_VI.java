package Arrays;
import java.util.*;
public class Leetcode_Jump_Game_VI {
	 public int maxResult(int[] nums, int k) {
	        Deque<Integer> dq=new ArrayDeque<>();
	        dq.offerLast(0);
	         int n=nums.length;
	        for(int i=1;i<n;i++){
	            nums[i]+=nums[dq.peekFirst()];
	            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
	                dq.pollLast();
	            }
	            dq.offerLast(i);
	            if(i-dq.peekFirst()>=k){
	                dq.pollFirst();
	            }
	        }
	        return nums[n-1];
	    }
}
