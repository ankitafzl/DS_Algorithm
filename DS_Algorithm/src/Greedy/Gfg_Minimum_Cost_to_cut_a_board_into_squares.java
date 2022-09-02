package Greedy;
import java.util.*;
public class Gfg_Minimum_Cost_to_cut_a_board_into_squares {
	public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        // code here
        Arrays.sort(X);
        Arrays.sort(Y);
        int i=X.length-1;
        int j=Y.length-1;
        int ver_cuts=1;
        int hor_cuts=1;
        int ans=0;
        
        while(i>=0 && j>=0){
            if(X[i]>Y[j]){
                ans+=(X[i]*ver_cuts);
                hor_cuts++;
                i--;
            }
            else{
                ans+=(Y[j]*hor_cuts);
                ver_cuts++;
                j--;
            }
        }
        
        while(i>=0){
            ans+=(X[i]*ver_cuts);
            i--;
        }
        while(j>=0){
            ans+=(Y[j]*hor_cuts);
            j--;
        }
        return ans;
    }
}
