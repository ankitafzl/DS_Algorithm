package Sorting;

public class BubbleSort {
      public static void main(String[] args){
    	  int[] arr={5,1,2,3,4,6};
    	  
    	  BubbleSort bs=new BubbleSort();
    	  bs.printArray(arr);
    	  bs.b_sort(arr);
    	  bs.printArray(arr);
      }
      
      public void b_sort(int []arr){
    	  int n=arr.length;
    	  boolean isSwapped;
    	  for(int i=0;i<n-1;i++){
    		  isSwapped=false;
    		  for(int j=0;j<n-1-i;j++){
    			  if(arr[j]>arr[j+1]){
    				  int temp=arr[j];
    				  arr[j]=arr[j+1];
    				  arr[j+1]=temp;
    				  isSwapped=true;
    			  }
    		  }
    		  if(isSwapped==false)
    			  break;
    	  }
      }
      
      public void printArray(int []arr){
    	  int n=arr.length;
    	  for(int i=0;i<n;i++){
    		  System.out.print(arr[i]+" ");
    	  }
    	  System.out.println();
      }
}
