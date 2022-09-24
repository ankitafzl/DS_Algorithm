package BinaryTree;
import java.util.*;
public class Leetcode_Path_Sum_II {
	
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
	
	//using dfs backtracking method.
	 public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        List<List<Integer>> ans=new ArrayList<>();
	        solve(root,targetSum,new ArrayList<>(),ans);
	        return ans;
	    }
	    
	    private static void solve(TreeNode root,int targetSum, List<Integer> path,List<List<Integer>> ans){
	        if(root==null){
	            return;
	        }
	        path.add(root.val);
	        if(root.left==null && root.right==null && targetSum==root.val){
	            ans.add(new ArrayList<>(path));
	        }
	        solve(root.left,targetSum-root.val,path,ans);
	        solve(root.right,targetSum-root.val,path,ans);
	        path.remove(path.size()-1);
	    }
}
