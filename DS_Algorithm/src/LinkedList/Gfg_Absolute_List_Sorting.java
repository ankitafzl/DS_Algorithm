package LinkedList;

public class Gfg_Absolute_List_Sorting {
	class Node
	{
	   int data;
	   Node next;
	   Node(int d) {data = d; next = null; }
	 }
	
	Node sortList(Node head) {
		// Your code here
		if(head==null || head.next==null){
		    return head;
		}
		
		//Node next=head;
		Node prev=head;
		Node curr=head.next;
		
// 		if(head.data<0){
// 		    prev=curr;
// 		    curr=curr.next;
// 		}
		
		while(curr!=null){
		    if(curr.data<prev.data){
		        prev.next=curr.next;
		        curr.next=head;
		        head=curr;
		        curr=prev;
		    }else{
		        prev=curr;
		        
		    }
		    curr=curr.next;
		}
		return head;
	}
}
