package Maths;

public class Gfg_Base_Equivalence {
	String baseEquiv(int n, int m)
    {
        // code here
        int i=2;
        while(i<=32){
            int d=(int)(Math.log(n)/Math.log(i))+1;
            if(d==m){
                return "Yes";
            }
            i++;
        }
        return "No";
    }
}
