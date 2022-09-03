package BinarySearchTree;
import java.util.*;
public class Gfg_Minimum_time_to_fulfil_all_orders {
	public static int findMinTime(int n, int l, int[] arr) {
        // code here
        Arrays.sort(arr);
        int low=arr[0];
        int high=arr[l-1]*n*(n+1)/2;
        int t=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(mid,n,arr)){
                t=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return t;
    }
    
    static boolean isPossible(int mid,int n,int arr[]){
        int donuts=0;
        for(int i:arr){
            int time_taken=0;
            int time_will_take=i;
            while(time_taken+time_will_take<=mid){
                donuts++;
                time_taken+=time_will_take;
                time_will_take+=i;
            }
        }
        if(donuts>=n){
            return true;
        }
        return false;
    }
}
