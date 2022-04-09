public class DeleteNodeAtGivenPosition {
	 private ListNode head;
     private static class ListNode{
   	  private int data;
   	  private ListNode next;
   	  
   	  public ListNode(int data){
   		  this.data=data;
   		  this.next=null;
   	  }
     }
     
     public void display(){
   	  ListNode current=head;
   	  while(current != null)
   	  {
   		  System.out.print(current.data+" --> ");
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
     
     public ListNode delete(int position){
   	    // position is valid and starting from
    	 //3 --> 4 --> 7 --> 8 --> 9  --> null
    	 if(position==1)
    		 head=head.next;
    	 else{
    		 ListNode previous=head;
    		 int count=1;
    		 while(count < position-1)
    		 {
    			 previous=previous.next;
    			 count++;
    		 }
    		 ListNode current=previous.next;
    		 previous.next=current.next;
    	 }
    	 return head;	 
     }
     
     public static void main(String [] args)
     {
   	 DeleteNodeAtGivenPosition s1=new DeleteNodeAtGivenPosition();
   	  s1.insertEnd(6);
   	  s1.insertEnd(11);
   	  s1.insertEnd(8);
   	  s1.insertEnd(5);
   	  s1.display();
   	  
   	  System.out.println();
   	  s1.delete(2);
   	  s1.display();
     }	
}
