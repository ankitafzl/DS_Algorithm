package Arrays;

public class KthLargest_Element_in_an_Array {
	public int findKthLargest(int[] nums, int k) {
        return solve(nums,0,nums.length-1,k);
    }
    
    public int solve(int nums[],int l,int r,int k){
        int pivot=l;
        for(int i=l;i<r;i++){
            if(nums[i]<=nums[r]){
                swap(nums,pivot++,i);
            }
        }
        swap(nums,pivot,r);
        
        int count=r-pivot+1;
        if(count==k){
            return nums[pivot];
        }
        else if(count>k){
            return solve(nums,pivot+1,r,k);
        }
        return solve(nums,l,pivot-1,k-count);
    }
    
    void swap(int nums[],int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}
