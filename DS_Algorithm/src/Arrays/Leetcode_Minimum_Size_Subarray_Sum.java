package Arrays;

public class Leetcode_Minimum_Size_Subarray_Sum {
	public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int st = 0;
        int n = nums.length;
        int sum = 0;
        int ans = n + 1;
        for (int end = 0; end < n; end++) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - st + 1);
                sum -= nums[st++];
            }
        }
        return ans == n + 1 ? 0 : ans;
    }
}
