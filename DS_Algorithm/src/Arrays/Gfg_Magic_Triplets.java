package Arrays;

public class Gfg_Magic_Triplets {
	public int countTriplets(int[] nums){
        // code here
        int ans=0;
        for(int i=1;i<nums.length-1;i++){
            int small=0;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    small++;
                }
            }
            int large=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    large++;
                }
            }
            ans+=small*large;
        }
        return ans;
    }
}
