public class RemoveDuplicateFromSortedList {
	private ListNode head;
	private static class ListNode{
		private int data;  // can be a generic type
		private ListNode next; //reference  to next ListNode in list
		
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
	
	public void insertFirst(int value){
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	public void removeDuplicate(){
		if(head==null)
			return ;
		ListNode current=head;
		while(current!=null && current.next!=null){
			if(current.data==current.next.data){
				current.next=current.next.next;
			}
			else{
				current=current.next;
			}
		}
	}
	
	public static void main(String [] args)
      {
		RemoveDuplicateFromSortedList s1=new RemoveDuplicateFromSortedList();
          
    	  s1.insertFirst(3);
    	  s1.insertFirst(3);
    	  s1.insertFirst(2);
    	  s1.insertFirst(1);
    	  s1.insertFirst(1);
    	  s1.display(); 
    	  
    	  System.out.println();
    	  s1.removeDuplicate();
    	  s1.display(); 
    	  
      }
}
