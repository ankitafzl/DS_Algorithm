package TreeNode;

public class Leetcode_level_2_Invert_Binary_Tree {
	
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
	
	public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
    
    void swap(TreeNode root){
        if(root==null){
            return;
        }
        swap(root.left);
        swap(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
}
