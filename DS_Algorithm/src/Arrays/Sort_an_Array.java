package Arrays;

public class Sort_an_Array {
	 public int[] sortArray(int[] nums) {
	        final int n = nums.length;
	        int[] temp = new int[n];
	        for (int i = 1; i < n; i *= 2) {
	            for (int lo = 0; lo < n-i; lo += i + i) {
	                int mid = lo + i - 1;
	                int hi = Math.min(lo + i + i - 1, n - 1);
	                merge(nums, temp, lo, mid, hi);
	            }
	        }
	        return nums;
	    }
	    private void merge(int[] arr, int[] temp, int lo, int mid, int hi) {
	       
	        for (int k = lo; k <= hi; k++) {
	            temp[k] = arr[k];
	        }

	        int i = lo, j = mid + 1;
	        for (int k = lo; k <= hi; k++) {
	            if (i > mid) {
	                arr[k] = temp[j++];
	            }
	            else if (j > hi) {
	                arr[k] = temp[i++];
	            }
	            else if (temp[j] < temp[i]) {
	                arr[k] = temp[j++];
	            }
	            else {
	                arr[k] = temp[i++];
	            }
	        }
	    }
}
