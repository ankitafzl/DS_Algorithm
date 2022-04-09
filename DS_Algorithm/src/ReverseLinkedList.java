public class ReverseLinkedList {
	private static ListNode head;
	private static class ListNode{
		private int data;  // can be a generic type
		private ListNode next;  //reference  to next ListNode in list
		
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void display(ListNode head){
		ListNode current=head;
		while(current != null){
			System.out.print(current.data+ " --> ");
			current=current.next;
		}
		System.out.print(current);
	}
	
	public ListNode reverse(ListNode head){
		if(head==null)
			return head;
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null){
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}
	
      public static void main(String [] args)
      {
    	  ReverseLinkedList s1=new ReverseLinkedList();
    	  s1.head=new ListNode(10);
    	  ListNode second=new ListNode(1);
    	  ListNode third=new ListNode(8);
    	  ListNode fourth=new ListNode(11);
    	  
    	  // now we will connect then together to form a chain.
    	  
    	  s1.head.next=second; //10 --> 1
    	  second.next=third;   //10 --> 1 --> 8
    	  third.next=fourth;   //10 --> 1 --> 8 -->11 -->null
    	  
    	  s1.display(head); 
    	  System.out.println(); 
    	  
    	  ListNode reverseListHead=s1.reverse(head);
    	  s1.display(reverseListHead);
    	  
      }
}
