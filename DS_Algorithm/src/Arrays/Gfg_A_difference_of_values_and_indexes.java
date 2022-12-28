package Arrays;

public class Gfg_A_difference_of_values_and_indexes {
	public static int maxDistance (int arr[], int n) {
        //Complete the function
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            max1=Math.max(max1,arr[i]+i);
            min1=Math.min(min1,arr[i]+i);
            max2=Math.max(max2,arr[i]-i);
            min2=Math.min(min2,arr[i]-i);

        }
        return Math.max(max1-min1,max2-min2);
    }
}
