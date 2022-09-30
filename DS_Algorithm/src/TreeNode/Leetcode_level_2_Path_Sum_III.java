package TreeNode;

public class Leetcode_level_2_Path_Sum_III {
	
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
	
	 int count=0;
	   public int pathSum(TreeNode root, int targetSum) {
	       if(root==null){
	           return 0;
	       }
	       solve(root,0,targetSum);
	       pathSum(root.left,targetSum);
	       pathSum(root.right,targetSum);
	       return count;
	   }
	   public void solve(TreeNode root,long sum,int target){
	       if(root==null){
	           return;
	       }
	       if(sum+root.val==(long)target){
	           count+=1;
	       }
	       solve(root.left,sum+root.val,target);
	       solve(root.right,sum+root.val,target);
	    }
}
