public class FindMiddleNode {
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
	
	public ListNode getMiddleNode(){
		if(head==null)
			return null;
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr != null && fastPtr.next != null){
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}
	
	public static void main(String [] args)
      {
		  FindMiddleNode s1=new FindMiddleNode();

    	  s1.insertFirst(11);
    	  s1.insertFirst(8);
    	  s1.insertFirst(1);
    	  s1.insertFirst(5);
    	  s1.display(); 
    	  
    	  System.out.println();
    	  ListNode middleNode=s1.getMiddleNode();
    	  System.out.println("Middle Node is = "+middleNode.data);
    	  
      }
}
