package Maths;
import java.util.*;
public class Jumping_Numbers {
	static long jumpingNums(long X) {
        // code here
        Queue<Long> q=new LinkedList<>();
        for(long i=1;i<=9;i++){
            q.add(i);
        }
        long ans=0;
        while(!q.isEmpty()){
            long n=q.remove();
            if(n>X){
                continue;
            }
            ans=Math.max(n,ans);
            int l_dig=(int)n%10;
            if(l_dig!=0){
                long f=n*10+(l_dig-1);
                q.add(f);
            }
            if(l_dig!=9){
                long s=n*10+(l_dig+1);
                q.add(s);
            }
           
        }
         return ans;
    }
}
