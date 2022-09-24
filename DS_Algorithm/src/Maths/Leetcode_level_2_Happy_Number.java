package Maths;

public class Leetcode_level_2_Happy_Number {
	 public boolean isHappy(int n) {
	        int slow = n;
	        int fast = n;
	        do {
	            slow = helper(slow);
	            fast = helper(helper(fast));
	            if (fast == 1) {
	                return true;
	            }
	        } while (slow != fast);
	        
	        return false;
	    }
	    private int helper(int n) {
	        int ans = 0;
	        while (n != 0) {
	            ans += (n%10)*(n%10);
	            n /= 10;
	        }
	        return ans;
	    }
}
