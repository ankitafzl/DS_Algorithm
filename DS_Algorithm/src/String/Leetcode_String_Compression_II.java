package String;
import java.util.*;
public class Leetcode_String_Compression_II {
	 private int[][] dp;
	    private char[] chars;
	    private int n;
	    public int getLengthOfOptimalCompression(String s, int k) {
	        this.chars=s.toCharArray();
	        this.n=s.length();
	        this.dp=new int[n][k+1];
	        for(int[] i:dp){
	            Arrays.fill(i,-1);
	        }
	        return solve(0,k);
	    }
	    
	    private int solve(int i,int k){
	        if(k<0){
	            return n;
	        }
	        
	        if(n<=i+k){
	            return 0;
	        }
	        
	        int ans=dp[i][k];
	        if(ans!=-1){
	            return ans;
	        }
	        
	        ans=solve(i+1,k-1);
	        int len=0;
	        int same=0;
	        int diff=0;
	        
	        for(int j=i;j<n && diff <=k ;j++){
	            if(chars[j]==chars[i]){
	                same++;
	                if(same<=2 || same == 10 || same==100){
	                    len++;
	                }
	            }
	            else{
	                diff++;
	            }
	            
	            ans=Math.min(ans,len+solve(j+1,k-diff));
	        }
	        dp[i][k]=ans;
	        return dp[i][k];
	    }
}
