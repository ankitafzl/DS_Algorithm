package Arrays;

public class Gfg_Split_Array_Largest_Sum {
	static int splitArray(int[] arr , int N, int K) {
        // code here
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<N;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        int ans=0;
        int low=max;
        int high=sum;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            int ctr=1;
            int s=0;
            for(int i=0;i<N;i++){
                s+=arr[i];
                if(s>mid){
                    ctr++;
                    s=arr[i];
                }
            }
            if(ctr>K){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}
