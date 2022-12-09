package TreeNode;

public class Leetcode_Maximum_Difference_Between_Node_and_Ancestor {

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
	
	int diff=0;
    public int maxAncestorDiff(TreeNode root) {
        solve(root);
        return diff;
    }

    int[] solve(TreeNode root){
        
        if(root==null){
            return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE};
        }
        if(root.left==null && root.right==null){
            return new int[]{root.val,root.val};
        }
        int[] left=solve(root.left);
        int[] right=solve(root.right);

        int min=Math.min(left[0],right[0]);
        int max=Math.max(left[1],right[1]);

        diff=Math.max(diff,Math.max(Math.abs(min-root.val),Math.abs(max-root.val)));

        min=Math.min(min,root.val);
        max=Math.max(max,root.val);

        return new int[]{min,max};
    }
}
