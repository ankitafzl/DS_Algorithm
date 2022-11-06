package Greedy;
import java.util.*;
public class Gfg_Minimum_number_of_Coins {
	static List<Integer> minPartition(int N)
    {
        // code here
        int arr[]=new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        List<Integer> ans=new ArrayList<>();
        int i=9;
        while(i>=0){
            if(arr[i]>N){
                i--;
            }
            else{
                while(N>=arr[i]){
                    ans.add(arr[i]);
                    N-=arr[i];
                }
            }
        }
        return ans;
    }
}
