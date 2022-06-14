package Dynamic_Programming;

public class Delete_Operation_for_Two_Strings {

	 public int minDistance(String word1, String word2) {
	        int n1=word1.length();
	        int n2=word2.length();
	        int [][]dp=new int[n1+1][n2+1];
	        for(int i=0;i<=n1;i++){
	            for(int j=0;j<=n2;j++){
	                if(i==0 || j==0){
	                    dp[i][j]=i+j;
	                }
	                else if(word1.charAt(i-1)==word2.charAt(j-1)){
	                    dp[i][j]=dp[i-1][j-1];
	                }
	                else{
	                    dp[i][j]=1+Math.min(dp[i-1][j],dp[i][j-1]);
	                }
	            }
	        }
	        return dp[word1.length()][word2.length()];
	    }
}
