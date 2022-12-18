package Arrays;

public class Leetcode_Jump_Game_II {
	public int jump(int[] nums) {
        int jumps=0;
        int curr=0;
        int next=0;
        for(int i=0;i<nums.length-1;i++){
            next=Math.max(next,nums[i]+i);
            if(i==curr){
                curr=next;
                jumps++;
            }
        }
        return jumps;
    }
}
