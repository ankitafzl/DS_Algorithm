package Arrays;

public class Two_Sum_II_Input_Array_Is_Sorted {
	 public int[] twoSum(int[] numbers, int target) {
	        int left=0;
	        int right=numbers.length-1;
	        while(left<=right){
	            if(numbers[left]+numbers[right]>target){
	                right--;
	            }
	            else if(numbers[left]+numbers[right]<target){
	                left++;
	            }
	            else{
	                return new int[]{left+1,right+1};
	            }
	        }
	        return new int[]{};
	    }
}
