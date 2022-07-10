package Arrays;
import java.util.*;
public class Sum_of_Unique_Elements {
	public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(map.keySet().contains(x)){
                if(map.get(x)==1){
                    sum-=x;
                }
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
                sum+=x;
            }
        }
        return sum;
    }
}
