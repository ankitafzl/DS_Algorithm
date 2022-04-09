package DoublyLinkedList;

import java.util.NoSuchElementException;
public class DeleteLastNode {
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
	   	private ListNode previous;
	   	private ListNode next;
	   	
	   	public ListNode(int data){
	   		this.data=data;
	   	}
	}
	 public DeleteLastNode(){
	   	  this.head=null;
	   	  this.tail=null;
	   	  this.length=0;
	 }
	     
	 public boolean isEmpty(){
	      return length==0;
	 }
	     
	 public int length(){
	   	  return length;
	 }
	 
	 public void displayForward(){
	   	  if(head==null)
	   		  return;
	   	  ListNode temp=head;
	   	  while(temp!=null)
	     	{
	     		System.out.print(temp.data+" --> ");
	     		temp=temp.next;
	     	}
	     	System.out.print("null");
	    }
	     
	     public void displayBackward(){
	   	  if(tail==null)
	   		  return;
	   	  ListNode temp=tail;
	   	  while(temp!=null){
	   		  System.out.print(temp.data+" --> ");
	       		temp=temp.previous;
	        }
	       	System.out.print("null");
	    }
	     
	      public void insertFirst(int value){
	    	  ListNode newNode=new ListNode(value);
	    	  if(isEmpty()){
	    		  tail=newNode;
	    	  }else{
	    		  head.previous=newNode;
	    	  }
	    	  newNode.next=head;
	    	  head=newNode;
	    	  length++;
	      }  
	     
	    public ListNode deleteLast(){
	    	if(isEmpty()){
	    		throw new NoSuchElementException();
	    	}
	    	ListNode temp=tail;
	    	if(head==tail){
	    		head=null;
	    	}else{
	    		tail.previous.next=null;
	    	}
	    	tail=tail.previous;
	    	temp.previous=null;
	    	return temp;
	    }  
	     
	
    public static void main(String []args){
    	 DeleteLastNode dll=new DeleteLastNode();
    	 dll.insertFirst(65);
   	     dll.insertFirst(25);
   	     dll.insertFirst(5);
   	     dll.insertFirst(1);
   	     
     	  dll.displayForward();
     	  System.out.println();
     	  dll.displayBackward();
     	  System.out.println();
     	  dll.deleteLast();
     	 
     	  dll.displayForward();
    	  System.out.println();
    	  dll.displayBackward();
    	  
    	  
    }
}
