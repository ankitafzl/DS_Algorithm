package Arrays;

public class ReverseArray {
      public static void main(String []args)
      {
    	  int []arr={2,11,5,10,7,8};
    	  printArray(arr);
    	  getReverseArray(arr,0,arr.length-1);
    	  printArray(arr);
    	  
      }
      
      public static void getReverseArray(int []arr,int start,int end){
    	 
    	  while(start<end){
    		  int temp=arr[start];
    		  arr[start]=arr[end];
    		  arr[end]=temp;
    		  start++;
    		  end--;
    	  }
      }
      
      public static void printArray(int[]arr){
  		int n=arr.length;
  		for(int i=0;i<n;i++){
  			System.out.print(arr[i]+" ");
  		}
  		System.out.println();
  	}
}
