package LinkedList;

public class Delete_Node_in_a_Linked_List {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
		
		  public void deleteNode(ListNode node) {
		        
		        ListNode temp = node.next.next;
		        node.val = node.next.val;
		        node.next = temp;

		   }
}
