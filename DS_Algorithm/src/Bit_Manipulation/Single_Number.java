package Bit_Manipulation;

public class Single_Number {
	public int singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        return xor;
    }
}
