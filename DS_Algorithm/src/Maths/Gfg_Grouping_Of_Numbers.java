package Maths;

public class Gfg_Grouping_Of_Numbers {
	static int maxGroupSize(int[] arr, int N, int K) {
        // code here
        int temp[]=new int[K];
        for(int i=0;i<N;i++){
            temp[arr[i]%K]++;
        }
        int ans=0;
        for(int i=0;i<=K/2;i++){
            if(i==0 || i==K-i){
                if(temp[i]!=0){
                    ans++;
                }
                
            }
            else{
                ans+=Math.max(temp[i],temp[K-i]);    
            }
        }
        return ans;
    }
}
