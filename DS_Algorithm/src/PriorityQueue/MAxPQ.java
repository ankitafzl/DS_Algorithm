package PriorityQueue;

public class MAxPQ {
     private Integer[] heap;
     private int n; //size of max heap
     public MAxPQ(int capacity){
    	  heap=new Integer[capacity+1]; //index 0is kept as empty
    	  n=0;
     }
     
     public boolean isEmpty(){
    	 return n==0;
     }
     
     public int size(){
    	 return n;
     }
     
     public void insert(int x){
    	 if(n==heap.length-1){
    		 resize(2*heap.length);
    	 }
    	 n++;
    	 heap[n]=x;
    	 swim(n);
     }
     
     private void swim(int k){
    	 while(k>1 && heap[k/2] < heap[k]){
    		 int temp=heap[k];
    		 heap[k]=heap[k/2];
    		 heap[k/2]=temp;
    		 k=k/2;   // because  we need to continue shifting up till new value inserted is at correct position
    	 }
     }
     
     private void resize(int capacity){
    	 Integer[] temp=new Integer[capacity];
    	 for(int i=0;i<heap.length;i++){
    		 temp[i]=heap[i];
    	 }
    	 heap=temp;
     }
     
     public void printMaxHeap(){
    	 for(int i=1;i<=n;i++){
    		 System.out.print(heap[i]+" ");
    	 }
     }
     
     public static void main(String []args){
    	 MAxPQ maxheap=new MAxPQ(3);
//    	 System.out.println(maxheap.size());  //0
//    	 System.out.print(maxheap.isEmpty());//true
    	 
    	 maxheap.insert(4);
    	 maxheap.insert(5);
    	 maxheap.insert(2);
    	 maxheap.insert(6);
    	 maxheap.insert(1);
    	 maxheap.insert(3);
    	 System.out.println(maxheap.size());
    	 maxheap.printMaxHeap();
     }
}
