package Maths;

public class Gfg_Break_a_number {
	int waysToBreakNumber(int N){
        // code here
        long mod = 1000000007;
        long ans = ((N+1)%mod * (N+2)%mod)%mod /2;
        return (int)ans;
    }
}
