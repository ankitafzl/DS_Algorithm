package String;
import java.util.*;

public class Binary_Tree_Paths {
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
	
	List<String> list;
    public List<String> binaryTreePaths(TreeNode root) {
        list=new ArrayList<>();
        dfs(root,"");
        return list;
    }
    
    private void dfs(TreeNode node,String str){
        if(node==null){
            return;
        }
        str+=String.valueOf(node.val);
        if(node.left==null && node.right==null){
            list.add(str);
            return;
        }
        dfs(node.left, str + "->");
        dfs(node.right, str + "->");
    }
}
