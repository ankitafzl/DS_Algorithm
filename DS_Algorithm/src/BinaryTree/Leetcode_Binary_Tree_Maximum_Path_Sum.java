package BinaryTree;

public class Leetcode_Binary_Tree_Maximum_Path_Sum {
	
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
	
	int ans = 0;
    public int maxPathSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        ans=max;
        dfs(root);
        return ans;
    }
    public int dfs(TreeNode root){
        if(root != null){
            int left = Math.max(dfs(root.left),0);
            int right = Math.max(dfs(root.right),0);
            int curr_ans = root.val + Math.max(left,right);
            if(left+ right + root.val > ans) {
                ans = left+ right + root.val;
            }
            return curr_ans;
        }else{
            return 0;
        }
    }
}
