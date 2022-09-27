package Arrays;
import java.util.*;
public class Gfg_Minimum_Cost_of_ropes {
	long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long i:arr){
            pq.add(i);
        }
        long cost=0;
        while(pq.size()>1){
            long a=pq.remove();
            long b=pq.remove();
            long curr=a+b;
            cost+=curr;
            pq.add(curr);
        }
        return cost;
    }
}
