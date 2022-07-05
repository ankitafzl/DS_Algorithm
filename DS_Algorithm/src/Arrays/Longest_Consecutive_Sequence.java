package Arrays;
import java.util.*;
public class Longest_Consecutive_Sequence {

	 public int longestConsecutive(int[] nums) {
	        HashMap<Integer,Boolean> map=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            map.put(nums[i],true);
	        }
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i]-1)){
	                map.put(nums[i],false);
	            }
	        }
	        int ans=0;
	        for(Integer k:map.keySet()){
	            if(map.get(k)==true){
	                ans=Math.max(ans,findLength(map,k));
	            }
	        }
	        return ans;
	    }
	    
	    private int findLength(HashMap<Integer,Boolean> map,int k){
	        int ans=0;
	        while(map.containsKey(k)){
	            ans++;
	            k++;
	        }
	        return ans;
	    }
}
