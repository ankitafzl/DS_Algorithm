package Bit_Manipulation;

public class Gfg_The_Bit_Game {
	public static int swapBitGame(long N) {
        // code here
        int ans=0;
        int count=0;
        while(N>0){
            if((N&1)==1){
                count++;
            }
            N>>=1;
        }
        if(count%2==0){
            ans=2;
        }
        else{
            ans=1;
        }
        return ans;
    }
}
