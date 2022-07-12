package Arrays;

public class Split_Array_Largest_Sum {
	public int splitArray(int[] nums, int m) {
        int st = 0;
        int end = 0;
        
        for (int num : nums) {
            st = Math.max(st, num);
            end += num;
        }
        
        while (st <= end) {
            int mid = (st + end) / 2;
            if (can_Split(nums, m, mid)) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }
    private boolean can_Split(int[] nums, int m, int cap) {
        int count = 1;
        int sum = 0;
        
        for (int num : nums) {
            sum += num;
            if (sum > cap) {
                count++;
                if (count > m) {
                    return false;
                }
                sum = num;
            }
        }
        return true;
    } 
}
