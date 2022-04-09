


public class DeleteNode {
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
      
      public ListNode deleteFirst(){
    	  if(head==null)
    		  return null;
    	  
    	  ListNode temp=head;
    	  head=head.next;
    	  temp.next=null;
    	  return temp;
      }
      
      public static void main(String [] args)
      {
    	  DeleteNode s1=new DeleteNode();
    	  
    	  s1.insertEnd(11);
    	  s1.insertEnd(8);
    	  s1.insertEnd(5);
    	  s1.display();
    	  
    	  System.out.println();
    	  System.out.println(s1.deleteFirst().data);
    	  s1.display();
      }	
}
