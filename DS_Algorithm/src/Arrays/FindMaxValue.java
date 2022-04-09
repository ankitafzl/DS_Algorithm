package Arrays;

public class FindMaxValue {
	public static void main(String [] args){
  	  int arr[]={5,9,3,15,1,2};
  	  System.out.println(findMax(arr));
    }
    
    public static int findMax(int []arr)
    {
  	  if(arr==null || arr.length==0){
  		  throw new IllegalArgumentException("Invalid input....");
  	  }
  	  
  	  int max=arr[0];
  	  for(int i=1;i<arr.length;i++){
  		  if(arr[i]>max){
  			  max=arr[i];
  		  }
  	  }
  	  return max;
    }
}
