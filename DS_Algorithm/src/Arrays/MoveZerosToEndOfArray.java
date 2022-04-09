package Arrays;

public class MoveZerosToEndOfArray {
	public static void main(String [] args){
	  	  int arr[]={5,0,3,0,1,2};
	  	  
	  	  moveZeros(arr);
	  	  for(int i:arr)
	  	      System.out.print(i+" ");
	    }
	public static void moveZeros(int[] arr)
	{
		int n=arr.length;
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0 && arr[j]==0){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0){
				j++;
			}
		}
	}
}
