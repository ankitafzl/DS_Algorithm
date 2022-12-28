package Arrays;
import java.util.*;
public class Leetcode_Remove_Stones_to_Minimize_the_Total {
	public int minStoneSum(int[] piles, int k) {
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->b-a);
        int n=piles.length;
        for(int i=0;i<n;i++){
            pq.add(piles[i]);
        }
        int t=0;
        while(t<k){
            int x=pq.poll();
            int y=Math.floorDiv(x,2);
            pq.offer(x-y);
            t++;
        }
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}
