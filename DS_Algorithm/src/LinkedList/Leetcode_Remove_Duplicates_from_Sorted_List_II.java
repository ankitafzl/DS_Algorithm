package LinkedList;

public class Leetcode_Remove_Duplicates_from_Sorted_List_II {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        
        while(fast!=null){
            while(fast!=null && fast.next!=null && fast.val == fast.next.val){
                fast = fast.next;
            }
            if(slow.next == fast){
                slow = slow.next;
            }else{
                slow.next = fast.next;
                fast = fast.next;
            }
        }
        return dummy.next;
    }

}
