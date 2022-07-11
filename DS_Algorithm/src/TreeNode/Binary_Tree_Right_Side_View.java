package TreeNode;
import java.util.*;
public class Binary_Tree_Right_Side_View {

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
	        right_view(root,ans,0);
	        return ans;
	    }
	    public void right_view(TreeNode current, List<Integer> ans, int curr_depth){
	        if(current == null){
	            return;
	        }
	        if(curr_depth == ans.size()){
	            ans.add(current.val);
	        }
	        
	        right_view(current.right,ans, curr_depth + 1);
	        right_view(current.left, ans, curr_depth + 1);
	        
	    }
}
