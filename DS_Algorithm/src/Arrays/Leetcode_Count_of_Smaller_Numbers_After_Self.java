package Arrays;
import java.util.*;
public class Leetcode_Count_of_Smaller_Numbers_After_Self {
	public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int n=nums.length;
        for(int i=n-1; i>=0; i--){
            if(list.isEmpty()){
               list.add(nums[i]);
               ans.add(0);
            }
            else if(nums[i]>list.get(list.size()-1)){
                list.add(list.size(), nums[i]);
                ans.add(list.size()-1);
           }
           else{
                int left=0; 
                int right=list.size()-1;
 
                while(left<right){
                    int mid = left + (right-left)/2;
 
                    if(nums[i]>list.get(mid)){
                        left=mid+1;
                    }
                    else{
                        right=mid;
                    }
                }
                list.add(right, nums[i]);
                ans.add(right);
            }    
       }
       Collections.reverse(ans);
       return ans;
    }
}
