package TreeNode;

public class Leetcode_level_2_Diameter_of_Binary_Tree {

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
	
	 int ans=1;
	    public int diameterOfBinaryTree(TreeNode root) {
	        solve(root);
	        return ans-1;
	    }
	    private int solve(TreeNode root){
	        if(root==null){
	            return 0;
	        }

	        int left = solve(root.left);
	        int right = solve(root.right);
	        ans = Math.max(ans,1+left+right);
	        return Math.max(left,right)+1;
	    }
}
