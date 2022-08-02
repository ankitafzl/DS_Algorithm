package Matrix;
import java.util.*;
public class Leetcode_Kth_Smallest_Element_in_a_Sorted_Matrix {
	 public int kthSmallest(int[][] matrix, int k) {
	       PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->(b-a));
	        int m=matrix.length;
	        int n=matrix[0].length;
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                pq.offer(matrix[i][j]);
	                if(pq.size()>k){
	                    pq.poll();
	                }
	            }
	        }
	        return pq.peek();
	    }
}
