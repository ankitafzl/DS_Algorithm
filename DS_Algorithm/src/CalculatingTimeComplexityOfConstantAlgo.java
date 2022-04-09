
public class CalculatingTimeComplexityOfConstantAlgo {
      public static void main(String []args)
      {
    	  System.out.println(sum(3,4));
    	  findsum(4);
    	  
    	  //int[] arr={1,2,3,4};
    	  //System.out.println(get(arr,arr.length));
      }
      public static int sum(int x,int y)
      {
    	  int result=x+y;
    	  return result;
      }
      
//      public static int get(int []arr,int i)
//      {
//    	  return arr[i];
//      }
      
      public static void findsum(int n)
      {
    	  for(int i=1;i<=n;i++)
    	  {
    		  for(int j=1;j<=n;j++)
    		  {
    			  System.out.println("i="+i+",j="+j);
    		  }
    		  System.out.println("End of Inner loop");
    	  }
    	  System.out.println("End of Outer loop");
      }
}
