package Arrays;

public class Kadanes_AlgorithmMaximumSumOfSubArray {
	public static int maxxSubArray(int[] arr){
		int currentMax=arr[0];
		int maxSoFar=arr[0];
		for(int i=1;i<arr.length;i++){
			currentMax=currentMax+arr[i];  //Q1- element becomes part of current sub array
			if(currentMax<arr[i]){
				currentMax=arr[i];  //Q2 -element decides to start its own sub array
			}
			if(maxSoFar<currentMax)
				maxSoFar=currentMax;
		}
		return maxSoFar;
	}
	
      public static void main(String []args){
    	  int []arr={4,3,-2,6,-12,7,-1,6};
    	  System.out.print(maxxSubArray(arr));
      }
}
