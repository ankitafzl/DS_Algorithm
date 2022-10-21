package Dynamic_Programming;

public class Gfg_Number_Formation {
	public int getSum(int x, int y, int z) {
        // Your code goes here
        long mod=(long)1e9+7;
        long exact_sum[][][]=new long[x+1][y+1][z+1];
        long exact_num[][][]=new long[x+1][y+1][z+1];
        long ans=0;
        exact_num[0][0][0]=1;
        for(int i=0;i<=x;++i){
            for(int j=0;j<=y;++j){
                for(int k=0;k<=z;++k){
                    if(i>0){
                        exact_sum[i][j][k]+=(exact_sum[i-1][j][k]*10+4*exact_num[i-1][j][k])%mod;
                        exact_num[i][j][k]+=exact_num[i-1][j][k]%mod;
                    }
                    if(j>0){
                        exact_sum[i][j][k]+=(exact_sum[i][j-1][k]*10+5*exact_num[i][j-1][k])%mod;
                        exact_num[i][j][k]+=exact_num[i][j-1][k]%mod;
                    }
                    if(k>0){
                        exact_sum[i][j][k]+=(exact_sum[i][j][k-1]*10+6*exact_num[i][j][k-1])%mod;
                        exact_num[i][j][k]+=exact_num[i][j][k-1]%mod;
                    }
                    ans+=exact_sum[i][j][k]%mod;
                    ans%=mod;
                }
            }
        }
        return (int)ans;
    }
}
