package hashing;
import java.util.*;
public class Two_Sum {
	public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
    
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int r_sum=target-num;
            if(map.containsKey(r_sum)){
                int ind=map.get(r_sum);
                if(ind==i){
                    continue;
                }
                return new int[]{i,ind};
            }
        }
        return new int[]{};
    }
}
