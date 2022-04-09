package Arrays;
import java.util.HashMap;
import java.util.Map;
public class SumProblem {
	
   public static int[] twoSum(int[] nums,int target)
   {
	   int[] result=new int[2];
	   Map<Integer,Integer> map=new HashMap<>();
	   for(int i=0;i<nums.length;i++){
		   if(!map.containsKey(target-nums[i])){
			   map.put(nums[i], i);
		   }else{
			   result[1]=i;
			   result[0]=map.get(target-nums[i]);
			   return result;
		   }
	   }
	   throw new IllegalArgumentException("Two numbers not found");
   }
   public static void main(String []args)
   {
  	 int[] nums=new int[]{2,11,5,10,7,8};
  	 int[] result=twoSum(nums,9);
  	 System.out.println("The two indices are - "+result[0]+" and "+result[1]);
   }
   
}
