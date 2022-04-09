package Queue;
import java.util.NoSuchElementException;
public class ImplementationOfQueue {
	private ListNode rear;
	private ListNode front;
	private int length;
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public ImplementationOfQueue(){
		rear=null;
		front=null;
		length=0;
	}
	
	public int length(){
		return length;
	}
	
	public boolean isEmpty(){
		return length==0;
	}
	
	public void enqueue(int data){
		ListNode temp=new ListNode(data);
		if(isEmpty()){
			front=temp;
		}
		else{
			rear.next=temp;
		}
		rear=temp;
		length++;
	}
	
	public void print(){
		if(isEmpty()){
			return;
		}
		
		ListNode current=front;
		while(current != null){
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public int dequeue(){
		if(isEmpty())
			throw new NoSuchElementException("Queue is already empty...");
		int result=front.data;
		front=front.next;
		if(front==null)
			rear=null;
		length--;
		return result;
	}
	
	public int first(){
		if(isEmpty())
			throw new NoSuchElementException("Queue is already empty...");
		
		return rear.data;
	}
	
	public int last(){
		if(isEmpty())
			throw new NoSuchElementException("Queue is already empty...");
		
		return front.data;
	}
	
     public static void main(String []args){
    	 ImplementationOfQueue queue=new ImplementationOfQueue();
    	 queue.enqueue(10);
    	 queue.enqueue(15);
    	 queue.enqueue(20);
    	 queue.print();
    	 
    	 System.out.println();
    	 queue.dequeue();
    	 queue.print();
    	 
    	 System.out.println(queue.first());
    	 System.out.println(queue.last());
     }
}
