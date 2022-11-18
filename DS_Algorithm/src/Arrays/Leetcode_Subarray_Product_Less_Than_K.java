package Arrays;

public class Leetcode_Subarray_Product_Less_Than_K {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        int st = 0;
        int prod = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k) {
                st = i + 1;
                prod = 1;
            } else {
                prod *= nums[i];
                while (prod >= k ) {
                    prod /= nums[st];
                    st++;
                }
                ans += i - st + 1;
            }
        }
        return ans;
    }
}
