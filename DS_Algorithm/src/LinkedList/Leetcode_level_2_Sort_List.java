package LinkedList;

public class Leetcode_level_2_Sort_List {

	public class ListNode {
		      int val;
		     ListNode next;
		      ListNode() {}
		       ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	 public ListNode sortList(ListNode head) {
	        if (head == null || head.next == null) {
	            return head;
	        }

	        ListNode previous = head;
	        ListNode slow = head;
	        ListNode fast = head;

	        while (fast != null && fast.next != null) {
	            previous = slow;
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        previous.next = null;
	        return merge(sortList(head), sortList(slow));
	    }
	    
	    ListNode merge(ListNode left, ListNode right) {
	        if (left == null) {
	            return right;
	        }
	        if (right == null) {
	            return left;
	        }
	        if (left.val < right.val) {
	            left.next = merge(left.next, right);
	            return left;
	        } 
	        else {
	            right.next = merge(left, right.next);
	            return right;
	        }
	    }
}
