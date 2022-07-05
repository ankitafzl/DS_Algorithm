package Recursion;
import java.util.*;
public class Find_the_Winner_of_the_Circular_Game {

	
	//Recursive method
	public int findTheWinner(int n, int k) {
	       if(n==1){
	           return 1;
	       }
	        int i=findTheWinner(n-1,k);
	        int j=(i+k-1)%n+1;
	        return j;
	    }
	
	//other method
	public int findTheWinner1(int n, int k) {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        while(queue.size()!=1){
            for(int j=1;j<k;j++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.poll();
    }
}
