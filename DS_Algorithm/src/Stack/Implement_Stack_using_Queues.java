package Stack;
import java.util.*;
public class Implement_Stack_using_Queues {
	Queue<Integer> queue = new LinkedList<Integer>();
//    public MyStack() {
//        
//    }
    
    public void push(int x) {
        Queue<Integer> newQueue = new LinkedList<Integer>();
        newQueue.add(x);
        while (queue.size() > 0) {
            newQueue.add(queue.poll());
        }
        queue = newQueue;
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.size() == 0;
    }
}
