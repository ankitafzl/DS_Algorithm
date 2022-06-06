package CircularSinglyLinkedList;

public class Intersection_of_Two_Linked_Lists {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A=headA;
        ListNode B=headB;
        if(A==null || B==null){
            return null;
        }
        while(A!=B){
            A=A==null ? headB:A.next;
            B=B==null ? headA:B.next;
        }
        return A;
    }
}
