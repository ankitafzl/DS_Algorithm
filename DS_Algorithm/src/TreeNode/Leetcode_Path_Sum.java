package TreeNode;
import java.util.*;
public class Leetcode_Path_Sum {

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
	
	 public boolean hasPathSum(TreeNode root, int targetSum) {
	        if(root==null){
	            return false;
	        }   
	        
	        Stack<TreeNode> stack1=new Stack<>();
	        Stack<Integer> stack2=new Stack<>();
	        
	        stack1.add(root);
	        stack2.add(targetSum-root.val);
	        
	        while(!stack1.isEmpty()){
	            TreeNode curr=stack1.pop();
	            int sum=stack2.pop();
	            
	            if(curr.left==null && curr.right==null && sum==0){
	                return true;
	            }
	            
	            if(curr.left!=null){
	                stack1.add(curr.left);
	                stack2.add(sum-curr.left.val);
	            }
	            
	            if(curr.right!=null){
	                stack1.add(curr.right);
	                stack2.add(sum-curr.right.val);
	            }
	        }
	        return false;
	    }
}
