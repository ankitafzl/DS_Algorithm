
public class FibonacciSeriesUsingTopDownApporoach {
	public int fibonacci(int[] memo,int n){ // 0 to 6
		 if(memo[n]==0){
			 if(n<2){
				 memo[n]=n; //0 or 1
			 }else{
				 int left=fibonacci(memo,n-1);
				 int right=fibonacci(memo,n-2);
				 memo[n]=left+right;
			 }
		 }
		 return memo[n];
	}
	
    public static void main(String []args){
    	FibonacciSeriesUsingTopDownApporoach  fb=new FibonacciSeriesUsingTopDownApporoach();
   	   System.out.println("The 6th fibonacci number is - "+fb.fibonacci(new int [6+1],6));
   	  //0,1,1,2,3,5,8
    }
}
