package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
public class LevelOrderTraversal {
	private TreeNode root;
    private class TreeNode{
 	   private TreeNode left;
 	   private TreeNode right;
 	   private int data;
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
	 
	 public void levelOrder(){
		 if(root==null)
			 return;
		 Queue<TreeNode> queue=new LinkedList<>();
		 queue.offer(root);
		 
		 while(!queue.isEmpty()){
			 TreeNode temp=queue.poll();
			 System.out.print(temp.data+" ");
			 if(temp.left!=null)
				 queue.offer(temp.left);
			 if(temp.right!=null)
				 queue.offer(temp.right);
		 }
     }
	
  public static void main(String []args){
	  LevelOrderTraversal bt=new LevelOrderTraversal();
  	   bt.createBinaryTree();
  	   bt.levelOrder();
  } 
}
