package Maths;

public class Leetcode_Concatenation_of_Consecutive_Binary_Numbers {
	public int concatenatedBinary(int n) {
        int ans = 0;
        int mod = (int) 1000000007;
        
        for (int i = 1; i <= n; i++) {
            String str = Integer.toBinaryString(i);
            for (int s = 0; s < str.length(); s++) {
                ans = ((ans * 2) + (str.charAt(s) - '0')) % mod;
            }
        }
        
        return ans;
    }
}
