package BinaryTree;
public class FindMaximumValueUsingRecursive {
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
	 
    public int maxValue(){
    	return maxValue(root);
    }
    
	 public int maxValue(TreeNode root){
		 if(root==null){
			 return Integer.MIN_VALUE;
		 }
		 int result=root.data;
		 int left=maxValue(root.left);
		 int right=maxValue(root.right);
		 if(left>result)
			 result=left;
		 if(right>result)
			 result=right;
		 
		 return result;
     }
	
   public static void main(String []args){
	   FindMaximumValueUsingRecursive bt=new FindMaximumValueUsingRecursive();
  	   bt.createBinaryTree();
  	   System.out.println(bt.maxValue());
  } 
}
