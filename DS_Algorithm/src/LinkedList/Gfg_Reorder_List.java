package LinkedList;

public class Gfg_Reorder_List {

	
	class Node
	{
	    int data;
	    Node next;
	    Node(int d) {
	        data = d;
	        next = null;
	    }
	}
	 Node reorderlist(Node head) {
	        // Your code here
	        if(head.next==null){
	            return head;
	        }
	        Node fast=head;
	        Node slow=head;
	        Node previous=null;
	        
	        while(fast!=null && fast.next!=null){
	            previous=slow;
	            slow=slow.next;
	            fast=fast.next.next;
	            
	        }
	        previous.next=null;
	        Node rev=reverse(slow);
	        Node start=head;
	        while(start!=null){
	            Node st_next=start.next;
	            Node rev_next=rev.next;
	            start.next=rev;
	            if(st_next!=null){
	                rev.next=st_next;
	            }
	            start=st_next;
	            rev=rev_next;
	        }
	        return head;
	      
	    }
	    
	      Node reverse(Node head){
	          Node previous=null;
	          while(head!=null){
	              Node next=head.next;
	              head.next=previous;
	              previous=head;
	              head=next;
	          }
	          return previous;
	      }
}
