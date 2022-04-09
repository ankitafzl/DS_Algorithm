package CircularSinglyLinkedList;

public class InsertNodeAtEnd {
	private ListNode last;
    private int length;
    private class ListNode{
 	   private ListNode next;
 	   private int data;
 	   public ListNode(int data){
 		   this.data=data;
 	   }
    }
    
    public InsertNodeAtEnd(){
 	   last=null;
 	   length=0;
    }
    
    public int length(){
		return length;
	}
	
	public boolean isEmpty(){
		return length==0; 
	}
	
	public void display(){
		if(last==null)
			return;
		ListNode first=last.next;
		while(first != last){
			System.out.print(first.data+" ");
			first=first.next;
		}
		System.out.print(first.data+" ");
	}
	
	public void insertLast(int data){
		ListNode temp=new ListNode(data);
		if(last==null){
			last=temp;
			last.next=last;
		}
		else{
			temp.next=last.next;
			last.next=temp;
			last=temp;
		}
		
		length++;
	}
	
	public static void main(String []args)
	{
		InsertNodeAtEnd csll=new InsertNodeAtEnd();
		csll.insertLast(1);
		csll.insertLast(5);
		csll.insertLast(10);
		csll.insertLast(15);
		
		csll.display();
	}
}
