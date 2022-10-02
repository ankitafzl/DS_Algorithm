package Maths;
import java.util.*;
public class Leetcode_Number_of_Dice_Rolls_With_Target_Sum {
	final int mod=1000000007;
    Map<String,Integer> map=new HashMap<>();
    public int numRollsToTarget(int n, int k, int target) {
        
        if(target<n || target>n*k){
            return 0;
        }
        if(n==1){
            return (target<=k)?1:0;
        }
        String str=""+n+k+target;
        if(!map.containsKey(str)){
            int sum=0;
            for(int i=1;i<=k;i++){
                sum+=numRollsToTarget(n-1,k,target-i);
                sum%=mod;
            }
            map.put(str,sum);
        }
        return map.get(str);
    }
}
