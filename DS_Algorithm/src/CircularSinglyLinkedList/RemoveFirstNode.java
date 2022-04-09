package CircularSinglyLinkedList;

import java.util.NoSuchElementException;
public class RemoveFirstNode {
	 private ListNode last;
     private int length;
     private class ListNode{
  	   private ListNode next;
  	   private int data;
  	   public ListNode(int data){
  		   this.data=data;
  	   }
     }
     
     public RemoveFirstNode(){
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
	
	public void insertStart(int data){
		ListNode temp=new ListNode(data);
		if(last==null)
			last=temp;
		else{
			temp.next=last.next;
		}
		last.next=temp;
		length++;
	}
	
	public ListNode removeFirstNode(){
		if(isEmpty())
			throw new NoSuchElementException("Circular singly linked list is already empty...");
		
		ListNode temp=last.next;
		if(last.next==last)
			last=null;
		else{
			last.next=temp.next;
		}
		temp.next=null;
		length--;
		return temp;
	}
	
	public static void main(String []args)
	{
		RemoveFirstNode csll=new RemoveFirstNode();
		csll.insertStart(15);
		csll.insertStart(10);
		csll.insertStart(5);
		csll.insertStart(1);
		csll.display();
		
		System.out.println();
		
		csll.removeFirstNode();
		csll.removeFirstNode();
		csll.display();
		
	}
}
