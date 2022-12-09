package BinaryTree;
import java.util.*;
public class Leetcode_Leaf_Similar_Trees {
	
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
	
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        dfs(list1,root1);
        dfs(list2,root2);
        return list1.equals(list2);
    }

    private void dfs(List<Integer> leaf_val,TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            leaf_val.add(root.val);
        }
        dfs(leaf_val,root.left);
        dfs(leaf_val,root.right);
    }
}
