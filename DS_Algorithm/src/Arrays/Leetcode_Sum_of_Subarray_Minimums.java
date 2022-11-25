package Arrays;

public class Leetcode_Sum_of_Subarray_Minimums {
	public int sumSubarrayMins(int[] arr) {
	       final int modulo = 1_000_000_007;
	       int[] stack = new int[arr.length + 1];
	        int idxStack = 0;

	        long res = 0;
	        for (int i = 1; i <= arr.length; i++) {
	            while (idxStack >= 0 && (i == arr.length || arr[stack[idxStack]] > arr[i])){
	                int idx = stack[idxStack--];
	                int leftIdx = idxStack < 0 ? -1 : stack[idxStack];
	                res += 1l * arr[idx] * (i - idx) * (idx - leftIdx);
	            }
	            stack[++idxStack] = i;
	        }
	        return (int) (res % modulo);
	    }
}
