package BinaryTree;

public class LeetCode_Lowest_Common_Ancestor_of_a_Binary_Tree {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root==null || root==p|| root==q){
	            return root;
	        }
	        TreeNode left_node=lowestCommonAncestor(root.left,p,q);
	        TreeNode right_node=lowestCommonAncestor(root.right,p,q);
	        
	        if(left_node==null){
	            return right_node;
	        }
	        if(right_node==null){
	            return left_node;
	        }
	        else{
	            return root;
	        }
	    }
}
