package BinaryTree;

public class Leetcode_Count_Good_Nodes_in_Binary_Tree {

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
	
	public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        
        int good_nodes=1;
        good_nodes+=solve(root.left,root.val);
        good_nodes+=solve(root.right,root.val);
        return good_nodes;
    }
    
    int solve(TreeNode curr,int max){
        if(curr==null){
            return 0;
        }
        
        int count=0;
        if(curr.val>=max){
            count+=1;
            max=curr.val;
            
        }
        count+=solve(curr.left,max);
        count+=solve(curr.right,max);
        return count;
    }
}
