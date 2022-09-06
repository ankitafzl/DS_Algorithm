package BinaryTree;

public class LeetCode_Binary_Tree_Pruning {
	
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

	public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        
        if (solve(root)==true) {
            return null;
        }
        return root;
    }
    
    private static boolean solve(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        boolean left = solve(root.left);
        boolean right = solve(root.right);
        
        if (left==true) {
            root.left = null;
        }
        if (right==true) {
            root.right = null;
        }
        
        return root.val == 0 && left && right;
    }
}
