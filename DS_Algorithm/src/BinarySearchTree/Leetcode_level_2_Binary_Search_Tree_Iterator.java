package BinarySearchTree;
import java.util.*;
public class Leetcode_level_2_Binary_Search_Tree_Iterator {
	
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
	
	List<Integer> list=new ArrayList<>();
    int index=0;

    public Leetcode_level_2_Binary_Search_Tree_Iterator(TreeNode root) {
        inorder(root);
    }
    
    void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    
    public int next() {
        return list.get(index++);
    }
    
    public boolean hasNext() {
        return index<list.size();
    }
}
