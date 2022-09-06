package Arrays;
import java.util.*;
public class Gfg_Minimum_Sum_of_Absolute_Differences_of_Pairs {
	long findMinSum(int[] A,int[] B,int N) { 
        Arrays.sort(A);
        Arrays.sort(B);
         
        long sum=0;
        for(int i=0;i<N;i++){
            sum+=Math.abs(A[i]-B[i]);
        }
        return sum;
    }
}
