package Maths;

public class Gfg_Find_the_Safe_Position {
	static int safePos(int n, int k) {
        // code here
        int ans=1;
        for(int i=2;i<=n;i++){
            ans=(ans+k-1)%i+1;
        }
        return ans;
    }
}
