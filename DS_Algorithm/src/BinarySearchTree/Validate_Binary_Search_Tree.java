package BinarySearchTree;

public class Validate_Binary_Search_Tree {

	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	
	 public boolean isValidBST(TreeNode root) {
	        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
	    }
	    
	    public boolean isValidBST(TreeNode root , long min,long max) {
	        if(root==null){
	            return true;
	        }
	        if(root.val>=max || root.val<=min){
	            return false;
	        }
	        return isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max);
	    }
	
}
