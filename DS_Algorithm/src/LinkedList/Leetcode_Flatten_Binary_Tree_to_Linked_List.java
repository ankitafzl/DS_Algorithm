package LinkedList;

public class Leetcode_Flatten_Binary_Tree_to_Linked_List {

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
	
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        while(root!=null){
            if(root.left!=null){
                TreeNode left=root.left;
                TreeNode curr=left;
                while(curr.right!=null){
                    curr=curr.right;
                }
                curr.right=root.right;
                root.left=null;
                root.right=left;
            }
            root=root.right;
        }
    }

}
