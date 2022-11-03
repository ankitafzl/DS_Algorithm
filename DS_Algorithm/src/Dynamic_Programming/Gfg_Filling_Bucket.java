package Dynamic_Programming;

public class Gfg_Filling_Bucket {
	 static int fillingBucket(int N) {
	        // code here
	        int dp[]=new int[N+1];
	        if(N==1){
	            return 1;
	        }
	        if(N==2){
	            return 2;
	        }
	        dp[1]=1;
	        dp[2]=2;
	        for(int i=3;i<=N;i++){
	            dp[i]=(dp[i-1]+dp[i-2])%100000000;
	        }
	        return dp[N];
	    }
}
