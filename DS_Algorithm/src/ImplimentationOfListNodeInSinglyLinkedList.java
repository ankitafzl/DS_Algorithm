
public class ImplimentationOfListNodeInSinglyLinkedList {
	
	private ListNode head;
	private static class ListNode{
		private int data;  // can be a generic type
		private ListNode next;  //reference  to next ListNode in list
		
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void display(){
		ListNode current=head;
		while(current != null){
			System.out.print(current.data+ " --> ");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public int length(){
		if(head==null)
			return 0;
		
		int count=0;
		ListNode current=head;
		while(current != null){
			count++;
			current=current.next;
		}
		return count;
	}
	
      public static void main(String [] args)
      {
    	  ImplimentationOfListNodeInSinglyLinkedList s1=new ImplimentationOfListNodeInSinglyLinkedList();
    	  s1.head=new ListNode(10);
    	  ListNode second=new ListNode(1);
    	  ListNode third=new ListNode(8);
    	  ListNode fourth=new ListNode(11);
    	  
    	  // now we will connect then together to form a chain.
    	  
    	  s1.head.next=second; //10 --> 1
    	  second.next=third;   //10 --> 1 --> 8
    	  third.next=fourth;   //10 --> 1 --> 8 -->11 -->null
    	  
    	  s1.display(); 
    	  System.out.println(); 
    	  System.out.print("Length is = "+s1.length());
      }
}
