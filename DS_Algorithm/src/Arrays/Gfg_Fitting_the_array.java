package Arrays;
import java.util.*;
public class Gfg_Fitting_the_array {
	public static boolean isFit (int arr[], int brr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<n;i++){
            if(arr[i]>brr[i]){
                return false;
            }
        }
        return true;
    }
}
