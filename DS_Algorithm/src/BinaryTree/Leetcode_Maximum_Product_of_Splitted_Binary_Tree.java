package BinaryTree;

public class Leetcode_Maximum_Product_of_Splitted_Binary_Tree {
	
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
	
	private long ans = 0, total = 0;
    public int maxProduct(TreeNode root) {
        total = dfs(root); 
        dfs(root);
        return (int)(ans % (int)(1e9 + 7));
    }

    private long dfs(TreeNode root) {
        if (root == null){
            return 0;
        } 
        long sub = root.val + dfs(root.left) + dfs(root.right);
        ans = Math.max(ans, sub * (total - sub));
        return sub;
    }
}
