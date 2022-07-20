package Arrays;
import java.util.*;
public class Query_Kth_Smallest_Trimmed_Number {
	class Node{
		int index; 
		String val;  
        Node(int i, String v){ 
        	this.index = i; 
        	this.val = v;
        } 
     }
	
	public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
	    HashMap<Integer, Node[]> map = new HashMap<>();
	    int[] ans = new int[queries.length];
	    int idx = 0;
	    int m = nums.length;
	    int n = nums[0].length();
	    
	    for(int[] query : queries){
	        if(!map.containsKey(query[1])){  
	            Node[] arr = new Node[m];
	            for(int i=0; i<m; i++){
	                String str = nums[i].substring(n-query[1],n); 
	                arr[i] = new Node(i, str);
	            }
				Arrays.sort(arr, (a, b)-> a.val.compareTo(b.val)); 
	            map.put(query[1], arr);
	        }
	        ans[idx++] = map.get(query[1])[query[0]-1].index; 
	    }
	    return ans;
	}
}
