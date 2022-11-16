package TreeNode;

public class Leetcode_Count_Complete_Tree_Nodes {
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
	 
	 public int countNodes(TreeNode root) {
	        if(root==null){
	            return 0;
	        }
	        int l_height=left_height(root);
	        int r_height=right_height(root);
	        if(l_height==r_height){
	            return (int)Math.pow(2,l_height)-1;
	        }
	        return countNodes(root.left)+countNodes(root.right)+1;
	    }

	    public int left_height(TreeNode root){
	        if(root==null){
	            return 0;
	        }
	        return left_height(root.left)+1;
	    }

	    public int right_height(TreeNode root){
	        if(root==null){
	            return 0;
	        }
	        return right_height(root.right)+1;
	    }
}
