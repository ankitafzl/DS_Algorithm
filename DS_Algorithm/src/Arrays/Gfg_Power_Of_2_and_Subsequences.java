package Arrays;
import java.util.*;
public class Gfg_Power_Of_2_and_Subsequences {
	static Long numberOfSubsequences(int N, ArrayList<Long> A){
        // code here
       
        int count=0;
        long mod=1000000007;
        for(long i:A){
            if((i & (i-1))==0){
                count++;
            }
            
        }
        return (long)(Math.pow(2,count)%mod-1)%mod;
    }
}
