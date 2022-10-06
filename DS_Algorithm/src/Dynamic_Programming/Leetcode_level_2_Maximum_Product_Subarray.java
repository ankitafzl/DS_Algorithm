package Dynamic_Programming;

public class Leetcode_level_2_Maximum_Product_Subarray {
	 public int maxProduct(int[] nums) {
	        int n = nums.length;
	        int[] max_product = new int[n];
	        int[] min_product = new int[n];
	        max_product[0] = nums[0];
	        min_product[0] = nums[0];
	        int max = nums[0];
	        for (int i = 1; i < n; i++) {
	            int num = nums[i];
	            if (num > 0) {
	                max_product[i] = Math.max(num, max_product[i - 1] * num);
	                min_product[i] = Math.min(num, min_product[i - 1] * num);
	            } else {
	                max_product[i] = Math.max(num, min_product[i - 1] * num);
	                min_product[i] = Math.min(num, max_product[i - 1] * num);
	            }
	            max = Math.max(max, max_product[i]);
	        }
	        return max;
	    }
}
