package Dynamic_Programming;

public class Gfg_Count_of_Subarrays {
	long countSubarray(int arr[], int n, int k) {

        // code here
        long ans=0;
        int re=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                ans++;
                int left=i-(re+1);
                int right=n-1-i;
                ans+=left;
                ans+=right;
                ans+=(left*right);
                re=i;
            }
        }
        return ans;
    }
}
