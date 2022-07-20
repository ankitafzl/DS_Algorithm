package Arrays;
import java.util.*;
public class Minimum_Deletions_to_Make_Array_Divisible {

	 public int minOperations(int[] nums, int[] numsDivide) { 
	        int count = 0; 
	        Arrays.sort(nums);
	        Set<Integer> set = new HashSet<>();
	        for (int i :numsDivide ) {
	        	set.add(i);
	        }
	        
	        for (int i = 0; i < nums.length; i++) {
	            boolean flag = true;
	            for (int j : set) {
	                if (j % nums[i] != 0) {
	                    flag = false;
	                    break; 
	                }
	            }
	           
	            if (flag==true) {
	            	return count;
	            }
	            count++;    
	        }
	        return -1;
	    }
}
