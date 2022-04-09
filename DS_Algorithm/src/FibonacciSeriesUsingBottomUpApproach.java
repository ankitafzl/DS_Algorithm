
public class FibonacciSeriesUsingBottomUpApproach {
	public int fibonacci(int n){
		 int[] table=new int[n+1];  //0-->n
		 table[0]=0;
		 table[1]=1;
		 for(int i=2;i<=n;i++){
			 table[i]=table[i-1]+table[i-2];
			 
		 }
		 return table[n];
	}
	
     public static void main(String []args){
    	 FibonacciSeriesUsingBottomUpApproach  fb=new FibonacciSeriesUsingBottomUpApproach();
    	 System.out.println("The 6th fibonacci number is - "+fb.fibonacci(6));
    	 //0,1,1,2,3,5,8
    	 
     }
}
