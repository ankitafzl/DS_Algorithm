package LinkedList;

public class Gfg_Move_Last_Element_to_Front_of_a_Linked_List {

	class Node
	{
	    int data;
	    Node next;
	    
	    Node(int x){
	        data = x;
	        next = null;
	    }
	}
	
	public static Node moveToFront(Node head) {
        // code here
        if(head.next==null){
            return head;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node last=temp.next;
        temp.next=null;
        last.next=head;
        return last;
    }
}
