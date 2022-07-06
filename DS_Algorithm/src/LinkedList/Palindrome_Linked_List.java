package LinkedList;

public class Palindrome_Linked_List {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	 public boolean isPalindrome(ListNode head) {
	        ListNode fast=head;
	        ListNode slow=head;
	        
	        while(fast!=null  && fast.next!=null){
	            fast=fast.next.next;
	            slow=slow.next;
	        }
	        slow=reverse(slow);
	        fast=head;
	        
	        while (slow!=null) {
	             if (slow.val != fast.val){
	                 return false;
	             }
	             slow = slow.next;
	             fast = fast.next;
	        }
	        return true;
	    }
	    
	    public ListNode reverse(ListNode head){
			ListNode prev=null;
	        ListNode curr=head;
			while(curr!=null){
				ListNode next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			return prev;
		}
}
