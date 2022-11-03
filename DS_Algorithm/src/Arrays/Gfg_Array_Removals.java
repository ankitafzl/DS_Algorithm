package Arrays;
import java.util.*;
public class Gfg_Array_Removals {
	 int removals(int[] arr, int n, int k) {
	        // code here
	        Arrays.sort(arr);
	        int i=0;
	        int j=0;
	        int max=0;
	        while(j<n){
	            if(arr[j]-arr[i]<=k){
	                j++;
	            }
	            else if(i<j){
	                i++;
	            }
	            max=Math.max(max,j-i);
	        }
	        int ans=n-max;
	        return ans;
	    }
}
