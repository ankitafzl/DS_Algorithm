package Sorting;

public class SelectionSort {
	public void sort(int []arr){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	
   public void printArray(int[] arr){
	   int n=arr.length;
	   for(int i=0; i<n;i++){
		   System.out.print(arr[i]+" ");
	   }
	   System.out.println();
   }
   
   public static void main(String []args){
	   int arr[]={3,1,5,2,6,4};
	   SelectionSort ss=new SelectionSort();
	   ss.printArray(arr);
	   ss.sort(arr);
	   ss.printArray(arr);
	   
   }
}
