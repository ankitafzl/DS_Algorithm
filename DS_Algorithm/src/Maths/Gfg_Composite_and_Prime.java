package Maths;
import java.util.*;
public class Gfg_Composite_and_Prime {
	public int Count(int L, int R)
    {
        // code here
        int count=0;
        int primes=0;
        boolean[] temp=new boolean[R+1];
        Arrays.fill(temp,true);
        temp[0]=false;
        temp[1]=false;
        for(int i=2;i<=R;i++){
            if(temp[i]==true){
                for(int j=2*i;j<=R;j+=i){
                    temp[j]=false;
                }
            }
        }
        
        for(int i=L;i<=R;i++){
            if(temp[i]==true){
                primes++;
            }
            else{
                count++;
            }
        }
        if(L==1){
            count--;
        }
        return count-primes;
    }
}
