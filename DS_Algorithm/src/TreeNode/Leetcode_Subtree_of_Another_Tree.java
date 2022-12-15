package TreeNode;

public class Leetcode_Subtree_of_Another_Tree {

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
	
	public boolean isSubtree(TreeNode subRoot , TreeNode root) {
	       if(subRoot != null && root != null){
	 			return solve(subRoot, root) || isSubtree(subRoot.left, root) || isSubtree(subRoot.right, root);
	 		}else if(subRoot == null && root == null) {
	            return true;
	        }
	 		return false;
	 	}
	 	private boolean solve(TreeNode subRoot, TreeNode root){
	 		if(subRoot != null && root != null){
	 			if(subRoot.val != root.val) {
	 				return false;
	 			}
	 			return solve(subRoot.left, root.left) && solve(subRoot.right, root.right);
	 		}else if(subRoot == null && root == null) {
	            return true;
	        }
	 		return false;   
	    }
}
