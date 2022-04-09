import java.util.Scanner;
public class FirstAlgo {
     public static void main(String []args)
     {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 System.out.print(findsum(n));
     }
     public static int findsum(int n)
     {
    	 // first algorithm for sum of num
    	// return n*(n+1)/2;
    	 
    	// second algorithm for sum of num
    	 
    	 int sum=0;
    	 for(int i=1;i<=n;i++)
    	 {
    		 sum+=i;
    	 }
    	 return sum;
     }
}
