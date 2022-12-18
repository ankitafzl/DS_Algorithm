package Maths;

public class Gfg_A_Game_of_LCM {
	long maxGcd(int N) {
        // code here
        return Math.max(solve(N),solve(N-1));
    }
    
    long solve(long N) {
        long a1 = N*(N-1);
        int count=0;
        for(long i=N-2;i>=1;i--) {
            long g = gcd(a1,i);
            if(g==1) {
                a1*=i;
                count++;
            }
            if(count==2) {
                return a1;
            }
        }
        return a1;
    }
    
    long gcd(long a,long b) {
        if(a==0) {
            return b;
        }
        return gcd(b%a,a);
    }
}
