package Arrays;

public class Leetcode_Construct_Target_Array_With_Multiple_Sums {

	public boolean isPossible(int[] target) {
        int max=0;
        long sum=0;
        int n=target.length;
        for(int i=0;i<n;i++){
            sum+=target[i];
            if(target[max]<target[i]){
                max=i;
            }
        }
        
        long diff=sum-target[max];
        
        if(target[max]==1 || diff==1){
            return true;
        }
        
         if(diff>target[max] || diff==0 || target[max]%diff==0){
            return false;
        }
        
        target[max] %=diff;
        return isPossible(target);
    }
}
