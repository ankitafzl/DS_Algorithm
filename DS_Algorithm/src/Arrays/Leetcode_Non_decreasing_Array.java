package Arrays;

public class Leetcode_Non_decreasing_Array {

	public boolean checkPossibility(int[] nums) {
        int n=nums.length;
        if(n==1){
            return true;
        }
        int index=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                if(index!=0){
                    return false;
                }
                index=i;
            }
        }
        if(index==0 || index==1 || index==n-1){
            return true;
        }
        
        if((nums[index-1]>nums[index+1]) && (nums[index-2]>nums[index])){
            return false;
        }
        return true;
    }
}
