public class SearchingElementInSinglyLinkedList {
	private static ListNode head;
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
	
	public static boolean searchElement(ListNode head,int searchKey)
	{ 
		if(head==null)
			return false;
		ListNode current=head;
		while(current != null){
			if(current.data==searchKey){
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
      public static void main(String [] args)
      {
    	  SearchingElementInSinglyLinkedList s1=new SearchingElementInSinglyLinkedList();
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
    	  if(s1.searchElement(head,3))
    		  System.out.println("Search key fount.....");
    	  else
    		  System.out.println("Search key not fount.....");
      }
}
