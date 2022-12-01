package Arrays;

public class Gfg_Rearrange_Array_Alternately {
     public static void rearrange(long arr[], int n){
        
        // Your code here
        int j=0;
        int x=n-1;
        long k=arr[n-1]+1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=((arr[x]%k)*k)+arr[i];
                x--;
            }
            else{
                arr[i]=((arr[j]%k)*k)+arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]/=k;
        }
        
    }
}
