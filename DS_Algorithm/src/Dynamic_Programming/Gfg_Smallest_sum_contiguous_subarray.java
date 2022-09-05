package Dynamic_Programming;

public class Gfg_Smallest_sum_contiguous_subarray {
	static int smallestSumSubarray(int a[], int size)
    {
        // your code here
        int min=0;
        int min_val=Integer.MAX_VALUE;
        
        for(int i=0;i<size;i++){
            if(min>0){
                min=a[i];
            }
            else{
                min+=a[i];
            }
            if(min<min_val){
                min_val=min;
            }
        }
        return min_val;
    }
}
