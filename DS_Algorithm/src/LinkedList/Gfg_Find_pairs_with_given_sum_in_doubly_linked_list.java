package LinkedList;
import java.util.*;
public class Gfg_Find_pairs_with_given_sum_in_doubly_linked_list {
	class Node
	{
	    int data;
	    Node next,prev;
	    
	    Node(int x){
	        data = x;
	        next = null;
	        prev = null;
	    }
	}

	public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        
        Node first=head;
        Node second=head;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        
        while(second.next!=null){
            second=second.next;
        }
        
        while(first!=second && first.prev!=second){
            int sum=first.data+second.data;
            if(sum==target){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(first.data);
                list.add(second.data);
                
                ans.add(list);
                first=first.next;
                second=second.prev;
            }
            else if(sum<target){
                first=first.next;
            }
            else{
                second=second.prev;
            }
        }
        return ans;
    }
}
