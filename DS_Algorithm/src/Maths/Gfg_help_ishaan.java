package Maths;

public class Gfg_help_ishaan {
	public int NthTerm(int N)
    {
        // code here
        if(N==1){
            return 1;
        }
    
        int i=0;
        while(i<N){
            if(isPrime(N-i) || isPrime(N+i)){
                break;
            }
            i++;
        }
        return i;
    }
    
    boolean isPrime(int n){
        if(n<2){
            return true;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
