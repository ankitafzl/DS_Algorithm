package Arrays;
import java.util.*;
public class Subsets_II {
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> ans=new ArrayList<>();
	        solve(0,nums,new ArrayList<>(),ans);
	        return ans;
	    }
	    
	    void solve(int ind,int[]nums,List<Integer> curr,List<List<Integer>> ans){
	        ans.add(new ArrayList<>(curr));
	        for(int i=ind;i<nums.length;i++){
	            if(i>ind && nums[i-1]==nums[i]){
	                continue;
	            }
	            curr.add(nums[i]);
	            solve(i+1,nums,curr,ans);
	            curr.remove(curr.size()-1);
	        }
	    }
}
