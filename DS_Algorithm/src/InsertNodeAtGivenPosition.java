public class InsertNodeAtGivenPosition {
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
	
	public void insertNodeGivenPosition(int position,int value){
		
		// 1--> 4 --> 5
		// 1--> 6 --> 4 -->5
		ListNode newNode=new ListNode(value);
		if(position == 1)
		{
			newNode.next=head;
			head=newNode;
		}
		else{
			ListNode previous=head;
			int count=1;  //previous-1
			
			while(count < position-1){
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=newNode;
			newNode.next=current;
			
		}
	}
	
	public static void main(String [] args)
      {
		InsertNodeAtGivenPosition s1=new InsertNodeAtGivenPosition();

//    	  s1.head=new ListNode(10);
//    	  ListNode second=new ListNode(1);
//    	  ListNode third=new ListNode(8);
//    	  ListNode fourth=new ListNode(11);
//   	  
//    	  // now we will connect then together to form a chain.
//    	  
//    	  s1.head.next=second; //10 --> 1
//    	  second.next=third;   //10 --> 1 --> 8
//    	  third.next=fourth;   //10 --> 1 --> 8 -->11 -->null

    	  s1.insertNodeGivenPosition(1,3); //3-->null
    	  s1.insertNodeGivenPosition(2,5); //3-->5-->null
    	  s1.insertNodeGivenPosition(1,2); //2-->3-->5-->null
    	  s1.insertNodeGivenPosition(2,4); //2-->4-->3-->5-->null
    	  s1.insertNodeGivenPosition(5,7); //2-->4-->3-->5-->7-->null
    	  s1.insertNodeGivenPosition(6,1); //2-->4-->3-->5-->7-->6-->null
    	  
    	  s1.display(); 
    	  
      }
}
