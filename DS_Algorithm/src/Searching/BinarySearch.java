package Searching;

public class BinarySearch {
      public static void main(String []args){
    	  int []arr={1,10,20,47,59,65,75,88,99};
    	  BinarySearch bs=new BinarySearch();
    	  System.out.println(bs.search(arr, 65));
      }
      
      public int search(int []nums,int key){
    	  int low=0;
    	  int high=nums.length;
    	  while(low<=high){
    		  int  mid=(high+low)/2;
    		  if(nums[mid]==key){return mid;}
    		  if(key<nums[mid])
    			  high=mid-1;
    		  else
    			  low=mid+1;
    	  }
    	  return -1;
      }
}
