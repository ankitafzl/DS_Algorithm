package Maths;

public class Gfg_Two_numbers_with_odd_occurrences {
	public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        int x=0;
        for(int i=0;i<N;i++){
            x=x^Arr[i];
        }
        int y=x & -x;
        int m1=0;
        int m2=0;
        for(int i=0;i<N;i++){
            if((y & Arr[i])==0){
                m1^=Arr[i];
            }
            else{
                m2^=Arr[i];
            }
        }
        int ans[]=new int[2];
        if(m1>m2){
            ans[0]=m1;
            ans[1]=m2;
        }
        else{
            ans[0]=m2;
            ans[1]=m1;
        }
        return ans;
    }
}
