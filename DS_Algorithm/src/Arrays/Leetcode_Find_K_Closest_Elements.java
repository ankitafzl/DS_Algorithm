package Arrays;
import java.util.*;
public class Leetcode_Find_K_Closest_Elements {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        if (k==0) {
            return ans;
        }
        int n=arr.length-1;
        int left=0, right=n;
        int[] indexes=new int[2];
        
        while(left+1<right){
            int mid=left+(right-left)/2;
            if (arr[mid]==x){
                indexes=findIndexes(arr, k, x, mid, n);
                
                for (int i=indexes[0]; i<=indexes[1]; i++) {
                    ans.add(arr[i]);
                }
                return ans;
            }
            else if(arr[mid]<x) {
                left=mid;
            }
            else 
            {
                right=mid;
            }
        }
        
        int closest=x-arr[left]>arr[right]-x?right:left;
        
        indexes=findIndexes(arr, k,x, closest, n);
        for (int i=indexes[0]; i<=indexes[1]; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
    
     public static int[] findIndexes(int[]arr, int k, int x, int mid, int n){
        int[] indexes=new int[2];
        int p1=mid, p2=mid;
        while(k>1){
            if (p1==0){
                p2+=k-1;
                break;
            }
            if (p2==n){
                p1-=k-1; 
                break;
            }
            if (x-arr[p1-1]>arr[p2+1]-x) {
                p2++;            
            }
            else {
                p1--;
            }
            k--; 
        }
        indexes[0]=p1; 
        indexes[1]=p2;
        
        return indexes;
    }
}
