package LinkedList;

public class Leetcode_level_2_Odd_Even_Linked_List {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        boolean odd = true;
        ListNode dummy_Odd_Head = new ListNode(0);
        ListNode curr_Odd = dummy_Odd_Head;
        ListNode dummy_Even_Head = new ListNode(0); 
        ListNode curr_Even = dummy_Even_Head;
        while (head != null) {
            ListNode next = head.next;
            head.next = null;
            if (odd) {
                curr_Odd.next = head;
                curr_Odd = curr_Odd.next;
            } else {
                curr_Even.next = head;
                curr_Even = curr_Even.next;
            }
            odd = !odd;
            head = next;
        }
        curr_Odd.next = dummy_Even_Head.next; 
        return dummy_Odd_Head.next;
    }
}
