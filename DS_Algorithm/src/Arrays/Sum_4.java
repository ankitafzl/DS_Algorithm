package Arrays;
import java.util.*;
public class Sum_4 {
	 public List<List<Integer>> fourSum(int[] nums, int target) {
	        int n = nums.length;
	        List<List<Integer>> ans = new ArrayList<>();
	        if(n < 4)
	            return ans;
	        Arrays.sort(nums);
	        for(int i = 0 ; i < n-3 ; i++){
	            if(i != 0 && nums[i] == nums[i-1]) {
	                continue;
	            }
	            for(int j = i+1 ; j < n-2 ; j++)
	            {
	                if(j != i+1 && nums[j] == nums[j-1])   {
	                    continue;
	                } 
	                long temp = ((long)target-nums[i]-nums[j]);   
	                int first = j+1;
	                int last = n-1;
	                while(first < last){
	                    if(nums[first] + nums[last] > temp)   {
	                        last--;
	                    }
	                    else if(nums[first]+ nums[last] < temp)   {
	                        first++;
	                    }
	                    else{
	                        ans.add(Arrays.asList(nums[i] , nums[j] , nums[first] , nums[last]));
	                        while(first < n-1 && nums[first] == nums[first+1]) {
	                            first++;
	                        }
	                        while(0 < last && nums[last] == nums[last-1])   {
	                            last--;
	                        }
	                        first++; 
	                        last--;
	                    }
	                }
	            }
	        }
	        return ans;
	    }
}
