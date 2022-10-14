package LinkedList;

public class Leetcode_Delete_the_Middle_Node_of_a_Linked_List {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }

	 public ListNode deleteMiddle(ListNode head) {
	        if(head==null){
	            return null;
	        }
	        
	        ListNode dummy = new ListNode(0, head);
	        ListNode slow = dummy;
	        ListNode fast = dummy;

	        while (fast.next != null && fast.next.next != null) {
	           slow = slow.next;
	           fast = fast.next.next;
	        }

	        slow.next = slow.next.next;
	        return dummy.next;
	    }
	
}
