package BinarySearchTree;
import java.util.*;
public class Leetcode_Two_Sum_IV_Input_is_a_BST {
	
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
	
	 Set<Integer> set=new HashSet<>();
	  public boolean findTarget(TreeNode root, int k) {
	        return solve(root,k);
	    }
	    
	    private boolean solve(TreeNode root,int k){
	        if(root==null){
	            return false;
	        }
	        if(set.contains(k-root.val)){
	            return true;
	        }
	        set.add(root.val);
	        return solve(root.left,k)||solve(root.right,k);
	    }
}
