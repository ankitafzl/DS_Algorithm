package Arrays;

public class Leetcode_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
	public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
               st=mid+1;
            }
            else{
                 end=mid-1;
            }
        }
        int st1=0;
        int end1=nums.length-1;
        while(st1<=end1){
            int mid=(st1+end1)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                st1=mid+1;
            }
            else if(nums[mid]<target){
                 st1=mid+1;
            }
            else{
                 end1=mid-1;
            }
        }
        
        return ans;
    }
}
