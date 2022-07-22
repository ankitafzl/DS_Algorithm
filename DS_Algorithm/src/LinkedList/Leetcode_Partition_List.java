package LinkedList;

public class Leetcode_Partition_List {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
public ListNode partition(ListNode head, int x) {
        
        ListNode b_node=new ListNode(-1);
        ListNode b=b_node;
        ListNode a_node=new ListNode(-1);
        ListNode a=a_node;
        
        while(head!=null){
            if(head.val<x){
                b.next=head;
                b=b.next;
            }
            else{
                a.next=head;
                a=a.next;
            }
            head=head.next;
        }
        a.next=null;
        b.next=a_node.next;
        return b_node.next;
    }
}

