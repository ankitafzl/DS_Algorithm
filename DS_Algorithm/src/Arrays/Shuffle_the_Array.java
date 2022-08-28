package Arrays;

public class Shuffle_the_Array {
	public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int j=n;
        int k=0;
        for(int i=0;i<n;i++){
            ans[k]=nums[i];
            k++;
            ans[k]=nums[j];
            k++;
            j++;
        }
        return ans;
    }
}
