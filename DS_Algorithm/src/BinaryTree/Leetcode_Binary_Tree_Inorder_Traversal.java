package BinaryTree;
import java.util.*;
public class Leetcode_Binary_Tree_Inorder_Traversal {
	
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
	
	 public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> ans = new ArrayList<>();
	        if (root == null) {
	            return ans;
	        }
	        List<Integer> left = inorderTraversal(root.left);
	        List<Integer> right = inorderTraversal(root.right);
	        
	        ans.addAll(left);
	        ans.add(root.val);
	        ans.addAll(right);
	        return ans;
	    }
}
