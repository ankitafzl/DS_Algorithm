package TreeNode;
import java.util.*;
public class Leetcode_level_2_Binary_Tree_Right_Side_View {
	
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
	
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        rightSideView(root,ans,0);
        return ans;
    }
    public void rightSideView(TreeNode root, List<Integer> ans, int root_depth){
        if(root == null){
            return;
        }
        if(root_depth == ans.size()){
            ans.add(root.val);
        }
        
        rightSideView(root.right,ans, root_depth + 1);
        rightSideView(root.left, ans, root_depth + 1);
       
    }
}
