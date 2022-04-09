package BinaryTree;
public class RecursiveInOrderTraversal {
	private TreeNode root;
	 
	 private class TreeNode{
	     private TreeNode left;
	     private TreeNode right;
	     private int data;  //generic data
	     
	     public TreeNode(int data){
	    	 this.data=data;
	     }
	 }  
	 
	 public void createBinaryTree(){
		 TreeNode first=new TreeNode(9);
		 TreeNode second=new TreeNode(2);
		 TreeNode third=new TreeNode(3);
		 TreeNode fourth=new TreeNode(4);
		 
		 root=first;
		 first.left=second;
		 first.right=third;
		 second.left=fourth;
	}
	 
	 public void inOrder(TreeNode root){
		 if(root==null)
			 return;
		 inOrder(root.left);
		 System.out.print(root.data+" ");
		 inOrder(root.right);
    }
	
   public static void main(String []args){
	   RecursiveInOrderTraversal bt=new RecursiveInOrderTraversal();
   	   bt.createBinaryTree();
   	   bt.inOrder(bt.root);
   }
}
