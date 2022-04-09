public class RemoveLoopFromList_FloyedCycleDetectAlgo {
       private ListNode head;
       private class ListNode{
    	   private int data;
    	   private ListNode next;
      
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
   	
   	public void createLinkedList(){
   		ListNode first=new ListNode(1);
   		ListNode second=new ListNode(2);
   		ListNode third=new ListNode(3);
   		ListNode fourth=new ListNode(4);
   		ListNode fifth=new ListNode(5);
   		ListNode sixth=new ListNode(6);
   		
   		head=first;
   		first.next=second;
   		second.next=third;
   		third.next=fourth;
   		fourth.next=fifth;
   		fifth.next=sixth;
   		sixth.next=third;
   	}
   	
   	public ListNode startingtLoop(){
		ListNode fastPtr=head;
		ListNode slowPtr=head;
		while(fastPtr != null && fastPtr.next != null){
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			if(fastPtr==slowPtr)
				return getStartingNode(slowPtr);
		}
		return null;
	}
	
	private ListNode getStartingNode(ListNode slowPtr){
		ListNode temp=head;
		while(slowPtr!=temp)
		{
			temp=temp.next;
			slowPtr=slowPtr.next;
		}
		return temp; //starting node of the loop
	}
   	
   	public void removeLoop(){
   		ListNode fastPtr=head;
   		ListNode slowPtr=head;
   		while(fastPtr != null && fastPtr.next != null){
   			fastPtr=fastPtr.next.next;
   			slowPtr=slowPtr.next;
   			if(slowPtr==fastPtr){
   				removeLoop(slowPtr);
   				return ;
   			}
   		}
    }
   	
     private void removeLoop(ListNode slowPtr){
   		ListNode temp=head;
   		while(slowPtr.next!=temp.next)
   		{
   			temp=temp.next;
   			slowPtr=slowPtr.next;
   		}
   		slowPtr.next=null; 
   	}
   	
   	public static void main(String [] args)
         {
   		RemoveLoopFromList_FloyedCycleDetectAlgo s1=new RemoveLoopFromList_FloyedCycleDetectAlgo();
   		  s1.createLinkedList();
   		  System.out.println(s1.startingtLoop().data);
   		  s1.removeLoop();
   		  s1.display();
   		  
         }
}
