package Arrays;
import java.util.*;
public class Gfg_Fill_up_buckets {
	public int totalWays(int n, int[] capacity) {
        // code here
        Arrays.sort(capacity);
        int mod=1000000007;
        long ans=1;
        for(int i=0;i<n;i++){
            ans=(ans*(capacity[i]-i))%mod;
        }
        return (int)ans%mod;
    }
}
