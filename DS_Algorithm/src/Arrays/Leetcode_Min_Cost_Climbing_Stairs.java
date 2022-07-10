package Arrays;

public class Leetcode_Min_Cost_Climbing_Stairs {
	public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int first_step=cost[0];
        int second_step=cost[1];
        for(int i=2;i<n;i++){
            int curr_step=cost[i]+Math.min(first_step,second_step);
            first_step=second_step;
            second_step=curr_step;
        }
        int min=Math.min(first_step,second_step);
        return min;
    }
}
