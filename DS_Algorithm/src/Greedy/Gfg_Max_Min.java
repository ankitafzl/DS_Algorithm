package Greedy;

public class Gfg_Max_Min {
	 public static int findSum(int A[],int N) 
	    {
	        //code here
	        return max(A)+min(A);
	    }
	    
	    static int max(int A[]){
	        int max=0;
	        for(int i=0;i<A.length;i++){
	            if(A[i]>max){
	                max=A[i];
	            }
	        }
	        return max;
	    }
	    
	    static int min(int A[]){
	        int min=0;
	        for(int i=0;i<A.length;i++){
	            if(A[i]<min){
	                min=A[i];
	            }
	        }
	        return min;
	    }
}
