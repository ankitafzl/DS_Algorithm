package BinaryTree;
import java.util.*;
public class Leetcode_Pseudo_Palindromic_Paths_in_a_Binary_Tree {

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
	
	public int pseudoPalindromicPaths (TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
         return solve(root, set);
        
    }
    public static int solve(TreeNode node, HashSet<Integer> set){
        if(node == null) {
            return 0;
        }
        if(set.contains(node.val)) {
            set.remove(node.val);
        }
        else {
            set.add(node.val);
        }
        if(node.left==null && node.right == null){
            if(set.size()<=1) {
                return 1;
            }
            else {
                return 0;
            }
        }
        
        return solve(node.left,(HashSet<Integer>)set.clone())+solve(node.right,(HashSet<Integer>)set.clone());
    }
	
}
