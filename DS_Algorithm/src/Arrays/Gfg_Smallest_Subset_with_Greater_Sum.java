package Arrays;
import java.util.*;
public class Gfg_Smallest_Subset_with_Greater_Sum {
   int minSubset(int[] Arr,int N) { 
        
        long sum1=0;
        long sum2=0;
        int count=0;
        for(int i:Arr){
            sum1+=i;
        }
        Arrays.sort(Arr);
        for(int i=N-1;i>=0;i--){
            sum2+=Arr[i];
            sum1-=Arr[i];
            count++;
            if(sum2>sum1){
                return count;
            }
        }
        return count;
    }
}
