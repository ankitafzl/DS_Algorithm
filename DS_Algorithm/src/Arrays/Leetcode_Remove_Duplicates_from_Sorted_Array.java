package Arrays;

public class Leetcode_Remove_Duplicates_from_Sorted_Array {
	public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int pre=nums[0];
        int l_index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==pre){
                continue;
            }
            nums[l_index + 1] = nums[i];
            pre = nums[i];
            l_index++;
        }
        return l_index+1;
    }
}
