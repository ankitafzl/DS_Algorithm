package Arrays;
import java.util.*;
public class Leetcode_Longest_Subsequence_With_Limited_Sum {
	public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] temp = new int[n];
        temp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            temp[i] = temp[i - 1] + nums[i];
        }

        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int j = solve(temp, queries[i]);
            ans[i] = j + 1;
        }
        return ans;
    }

    private int solve(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
