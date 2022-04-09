package BinaryTree;
import java.util.Stack;
public class IterativePostOrderTraversal {
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
	 
	 public void postOrder(){
		 TreeNode current=root;
		 Stack<TreeNode> stack=new Stack<>();
		
		 while(current!=null||!stack.isEmpty()){
			 if(current!=null){
				 stack.push(current);
				 current=current.left;
			 }else{
				 TreeNode temp=stack.peek().right;
				 if(temp==null){
					 temp=stack.pop();
					 System.out.print(temp.data+" ");
					 while(!stack.isEmpty() && temp==stack.peek().right){
						 temp=stack.pop();
						 System.out.print(temp.data+" ");
					 }
				 }else{
					 current=temp;
				 }
			 }
		 }
	 }
	
  public static void main(String []args){
	  IterativePostOrderTraversal bt=new IterativePostOrderTraversal();
    	bt.createBinaryTree();
    	bt.postOrder();
  	   }
}
