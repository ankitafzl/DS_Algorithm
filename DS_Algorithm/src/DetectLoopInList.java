public class DetectLoopInList {
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
	
	public boolean containsLoop(){
		ListNode fastPtr=head;
		ListNode slowPtr=head;
		while(fastPtr != null && fastPtr.next != null){
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			if(fastPtr==slowPtr)
				return true;
		}
		return false;
	}
	
    public static void main(String [] args)
      {
    	  DetectLoopInList s1=new DetectLoopInList();
          s1.createLinkedList();
          System.out.println(s1.containsLoop());
      }
}
