package BinarySearchTree;
import java.util.*;
public class Leetcode_level_2_Kth_Smallest_Element_in_a_BST {
	
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
	
	 public int kthSmallest(TreeNode root, int k) {
	        List<Integer> list = new ArrayList<>();
	        inorder(root, list, k);
	        return list.get(k-1);
	    }
	    private void inorder(TreeNode root,List<Integer> list, int k){
	        if(list.size()>=k) {
	            return;
	        }
	        if(root.left!=null) {
	            inorder(root.left, list, k);
	        }
	        list.add(root.val);
	        if(root.right!=null) {
	            inorder(root.right, list, k);
	        }
	    }
}
