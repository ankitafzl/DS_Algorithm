
public class Find_Position {
     public static void main(String args[]) {
    	 int n=2;
    	 System.out.println(solve(n));
     }
    public  static int solve(int n)
    {
       if (n < 1) {
          return n;
       }
  
       int n1 = 0, n2 = 1, n3 = 1;
       int ans = 2;
  
       while (n3 < n)
      {
         n3 = n1 + n2;
         ans++;
         n1 = n2;
         n2 = n3;
      }
      
      return ans;
  }
}
