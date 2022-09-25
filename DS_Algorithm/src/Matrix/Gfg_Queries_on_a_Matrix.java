package Matrix;

public class Gfg_Queries_on_a_Matrix {
	public int[][] solveQueries(int n, int[][] Queries) {
        // Code here
        int dp[][]=new int[n][n];
        for(int []q:Queries){
            int a=q[0];
            int b=q[1];
            int c=q[2];
            int d=q[3];
            for(int i=a;i<=c;i++){
                dp[i][b]++;
                if(d+1<n){
                    dp[i][d+1]--;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                dp[j][i]+=dp[j][i-1];
            }
        }
        return dp;
    }
}
