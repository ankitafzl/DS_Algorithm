public class InsertNodeInSortedList {
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
	
	public ListNode insertNodeSortedList(int value){
		ListNode newNode=new ListNode(value);
		if(head==null)
			return null;
		
		ListNode current=head;
		ListNode temp=null;
		while(current!=null && current.data < newNode.data){
			temp=current;
			current=current.next;
		}
		newNode.next=current;
		temp.next=newNode;
		return head;
	}
	
	public static void main(String [] args)
      {
		InsertNodeInSortedList s1=new InsertNodeInSortedList();

    	  s1.insertFirst(11);
    	  s1.insertFirst(8);
    	  s1.insertFirst(5);
    	  s1.insertFirst(1);
    	  s1.display();
    	  
    	  System.out.println();
    	  
    	  s1.insertNodeSortedList(10);
    	  s1.display();
      }
}
