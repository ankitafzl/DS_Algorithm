package Maths;
import java.util.*;
public class Gfg_modified_numbers_and_queries {
	public int sumOfAll(int l, int r)
    {
        // code here
        int ans=0;
        boolean primes[]=new boolean[r+1];
        Arrays.fill(primes,true);
        for(int i=2;i<=r;i++){
            if(primes[i]){
                for(int j=i*i;j<=r;j+=i){
                    primes[j]=false;
                }
            }
        }
        while(l<=r){
            if(l==1){
                l++;
                ans++;
                continue;
            }
            int curr=0;
            for(int i=2;i<=l;i++){
                if(primes[i] && l%i==0){
                    curr+=i;
                }
            }
            ans+=curr;
            l++;
        }
        return ans;
    }
}
