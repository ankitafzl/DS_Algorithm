package Bit_Manipulation;

public class Reverse_Bits {
	public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++){
            int lsb=n&1;
            int reverse_lsb=lsb<<31-i;
            ans|=reverse_lsb;
            n=n>>1;
        }
        return ans;
    }
}
