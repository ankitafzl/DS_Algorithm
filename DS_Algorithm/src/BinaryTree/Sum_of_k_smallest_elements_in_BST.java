package BinaryTree;

public class Sum_of_k_smallest_elements_in_BST {

	class Node {
	    int data;
	    Node left, right;
	    Node(int key){
	        this.data = key;
	        this.left = this.right = null;
	    }
	}
	int sum;
    int count;
    int sum(Node root, int k) { 
        
        // Code here
        sum=0;
        count=0;
        solve(root,k);
        return sum;
    } 
    
     
    void  solve(Node root,int k){
        if(root==null){
            return;
        }
    
        solve(root.left,k);
        if(count<k){
            sum+=root.data;
            count++;
        }
        if(count<k){
          solve(root.right,k);   
        }
       
    }
    
	
}
