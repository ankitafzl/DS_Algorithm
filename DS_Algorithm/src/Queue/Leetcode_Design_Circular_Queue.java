package Queue;
import java.util.*;
public class Leetcode_Design_Circular_Queue {
	 int q[];
	    int front=0,rear=0,size=0;
	    public Leetcode_Design_Circular_Queue(int k) {
	        q=new int[k];
	        Arrays.fill(q,-1);
	    }
	    
	    public boolean enQueue(int value) {
	        if(isFull()){
	            return false;
	        }
	        if(isEmpty()){
	            front=rear=0;
	            q[rear]=value;
	            size++;
	            return true;
	        }
	        rear++;
	        size++;
	        rear=rear%q.length;
	        q[rear]=value;
	        return true;
	    }
	    
	    public boolean deQueue() {
	        if(isEmpty()){
	            return false;
	        }
	        q[front]=-1;
	        size--;
	        front++;
	        front=front%q.length;
	        return true;
	    }
	    
	    public int Front() {
	        return q[front];
	    }
	    
	    public int Rear() {
	        return q[rear];
	    }
	    
	    public boolean isEmpty() {
	        return size==0;
	    }
	    
	    public boolean isFull() {
	        return size==q.length;
	    }
}
