package Bit_Manipulation;

public class Leetcode_Bitwise_AND_of_Numbers_Range {
	public int rangeBitwiseAnd(int left, int right) {
        while (left < right) {
          right = right & right - 1;
        }
        int ans=0;
        ans=left&right;
        return ans;
    }
}
