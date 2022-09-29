package TreeNode;

public class Leetcode_level_2_Balanced_Binary_Tree {

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
	
	public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return height(root)!=-1;
    }
    
    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int h=Math.abs(left-right);
        
        if(h>1 || left ==-1 || right == -1){
            return -1;
        }
        int max=Math.max(left,right);
        return 1+max;
    }
}
