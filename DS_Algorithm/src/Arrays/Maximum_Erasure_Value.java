package Arrays;
import java.util.*;
public class Maximum_Erasure_Value {

	 public int maximumUniqueSubarray(int[] nums) {
	        Set<Integer> set=new HashSet<>();
	        int st=0;
	        int end=0;
	        int curr_sum=0;
	        int max_sum=0;
	        while(end<nums.length){
	            int curr_El=nums[end];
	            if(!set.contains(curr_El)){
	                set.add(curr_El);
	                curr_sum+=curr_El;
	                max_sum=Math.max(max_sum,curr_sum);
	                end++;
	            }else{
	                int del_El=nums[st];
	                set.remove(del_El);
	                curr_sum-=del_El;
	                st++;
	            }
	        }
	        return max_sum;
	    }
}
