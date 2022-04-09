public class RemoveGivenKeyFromList {
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
	
	public void removeNode(int key){
		ListNode current=head;
		ListNode temp=null;
		if(current!=null && current.data==key)
		{
			head=current.next;
			return;
		}
		while(current!=null && current.data!=key)
		{
			temp=current;
			current=current.next;
		}
		if(current==null)
			return;
		
		temp.next=current.next;
	}
    public static void main(String [] args)
      {
    	  RemoveGivenKeyFromList s1=new RemoveGivenKeyFromList();

    	  s1.insertFirst(11);
    	  s1.insertFirst(8);
    	  s1.insertFirst(1);
    	  s1.insertFirst(5);
    	  s1.display();
    	  
    	  System.out.println();
    	  s1.removeNode(1);
    	  s1.display();
    	  
      }
}
