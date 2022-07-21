package CircularSinglyLinkedList;

public class Leetcode_Reverse_Linked_List_II {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	 public ListNode reverseBetween(ListNode head, int left, int right) {
	        
	        if(head==null || head.next==null){
	            return head;
	        }
	        
	        ListNode  dummy=new ListNode(-1);
	        dummy.next=head;
	        ListNode curr=dummy;
	        ListNode previous=null;
	        
	        for(int i=0;i<left;i++){
	            previous=curr;
	            curr=curr.next;
	        }
	        
	        ListNode curr_r=curr;
	        ListNode previous_r=previous;
	        
	        for(int i=left;i<=right;i++){
	            ListNode temp=curr_r.next;
	            curr_r.next=previous_r;
	            previous_r=curr_r;
	            curr_r=temp;
	        }
	        previous.next=previous_r;
	        curr.next=curr_r;
	        return dummy.next;
	    }
}
