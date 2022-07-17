package CircularSinglyLinkedList;

public class Remove_Nth_Node_From_End_of_List {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        ListNode nth=dummy;
        for(int i=1;i<=n+1;i++){
            curr=curr.next;
        }
        while(curr!=null){
            curr=curr.next;
            nth=nth.next;
        }
        nth.next=nth.next.next;
        return dummy.next;
    }
}
