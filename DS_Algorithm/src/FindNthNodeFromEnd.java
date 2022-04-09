public class FindNthNodeFromEnd {
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
	
	public ListNode getNthNode(int n){
		if(head==null)
			return null;
		if(n<=0)
			throw new IllegalArgumentException("Invalid Value : n = "+n);
		
		ListNode mainPtr=head;
		ListNode refPtr=head;
		int count =0;
		while(count<n){
			if(refPtr==null)
				throw new IllegalArgumentException(n +" is greater than  the number of node in list.");
			refPtr=refPtr.next;
			count++;
		}
		while(refPtr!=null){
			refPtr=refPtr.next;
			mainPtr=mainPtr.next;
		}
		return mainPtr;
	}
	
	public static void main(String [] args)
      {
		 FindNthNodeFromEnd s1=new FindNthNodeFromEnd();

    	  s1.insertFirst(11);
    	  s1.insertFirst(8);
    	  s1.insertFirst(1);
    	  s1.insertFirst(5);
    	  s1.display(); 
    	  
    	  System.out.println();
    	  ListNode fromEndNode=s1.getNthNode(2);
    	  System.out.println("Nth Node from e is = "+fromEndNode.data);
    	  
      }
}
