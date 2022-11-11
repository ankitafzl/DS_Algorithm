package Maths;
import java.util.*;
public class Gfg_Primes_sum {
	static String isSumOfTwo(int N){
        // code here
        boolean primes[]=new boolean[N];
        Arrays.fill(primes,true);
        for(int i=2;i<=N/2;i++){
            if(primes[i]==true){
                for(int j=i*i;j<N;j+=i){
                    primes[j]=false;
                }
            }
        }
        
        for(int i=2;i<=N/2;i++){
            if(primes[i] && primes[N-i]){
                return "Yes";
            }
        }
        return "No";
    }
}
