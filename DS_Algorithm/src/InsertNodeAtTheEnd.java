
public class InsertNodeAtTheEnd {
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
	
	public void insertEnd(int value){
		ListNode newNode=new ListNode(value);
		if(head==null)
		{
			head=newNode;
			return;
		}
		ListNode current=head;
		while(null != current.next){
			current=current.next;
		}
		current.next=newNode;
	}
	
	public static void main(String [] args)
      {
    	  InsertNodeAtTheEnd s1=new InsertNodeAtTheEnd();

    	  s1.insertEnd(11);
    	  s1.insertEnd(8);
    	  s1.insertEnd(5);
    	  
    	  s1.display(); 
    	  
      }
}
