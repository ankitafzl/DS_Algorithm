package Dynamic_Programming;

public class Gfg_count_all_possible_paths_from_top_left_to_Bottom_Right {
	int x,y;
    long mod=1000000007;
    long dp[][];
    long numberOfPaths(int m, int n)
    {
        dp=new long[101][101];
        // code here
        x=m;
        y=n;
        return dfs(0,0);
    }
    
    long dfs(int m,int n){
        if(m==x-1 || n==y-1){
            return 1;
        }
        
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        
        long right=dfs(m,n+1);
        long down=dfs(m+1,n);
        return dp[m][n]=(right+down)%mod;
    }
}
