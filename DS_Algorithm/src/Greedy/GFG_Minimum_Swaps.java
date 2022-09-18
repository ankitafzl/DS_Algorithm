package Greedy;

public class GFG_Minimum_Swaps {
	public static int minimumSwaps(int[] c, int[] v,int n,int k,int b,int t) {
        // code here
        int count1=0;
        int count2=0;
        int swap=0;
        
        for(int i=n-1;i>=0;i--){
            if(v[i]*t+c[i]>=b){
                count1++;
                swap+=count2;
            }
            else{
                count2++;
            }
            if(count1>=k){
                break;
            }
        }
        if(count1>=k){
            return swap;
        }
        return -1;
    }
}
