package BinaryTree;

import java.util.Stack;

public class IterativeInOrderTraversal {
    private TreeNode root;
    private class TreeNode{
    	private TreeNode left;
    	private TreeNode right;
    	private int  data;
    	public TreeNode(int data){
    		this.data=data;
    	}
    }
    
    public void createBinaryTree(){
		 TreeNode first=new TreeNode(1);
		 TreeNode second=new TreeNode(2);
		 TreeNode third=new TreeNode(3);
		 TreeNode fourth=new TreeNode(4);
		 TreeNode fifth=new TreeNode(5);
		 TreeNode sixth=new TreeNode(6);
		 TreeNode seventh=new TreeNode(7);
		 
		 root=first;
		 first.left=second;
		 first.right=third;
		 second.left=fourth;
		 second.right=fifth;
		 third.left=sixth;
		 third.right=seventh;
	}
	 
	 public void inOrder(){
		 if(root==null)
			 return;
		 Stack<TreeNode> stack=new Stack<>();
		 TreeNode temp=root;
		 while(!stack.isEmpty()||temp!=null){
			 if(temp!=null){
			     stack.push(temp);
			     temp=temp.left;
			 }else{
				 temp=stack.pop();
				 System.out.print(temp.data+" ");
				 temp=temp.right;
			 }
		 }
	 }
	
  public static void main(String []args){
	   IterativeInOrderTraversal bt=new IterativeInOrderTraversal();
    	bt.createBinaryTree();
    	bt.inOrder();
  	   }
}
