package BinaryTree;
import java.util.*;
public class Leetcode_Add_One_Row_to_Tree {
	
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
	
	public TreeNode addOneRow(TreeNode root, int val, int depth) {
		
        if(depth==1){
            TreeNode ans=new TreeNode(val);
            ans.left=root;
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(depth-->2){
            Queue<TreeNode> temp=new LinkedList<>();
            while(q.size()!=0){
                TreeNode top=q.poll();
                if(top.left!=null){
                    temp.add(top.left);
                }
                if(top.right!=null){
                    temp.add(top.right);
                }
            }
            q=temp;
        }
        while(q.size()>0){
            TreeNode top=q.poll();
            TreeNode temp=top.left;
            top.left=new TreeNode(val);
            top.left.left=temp;
            temp=top.right;
            top.right=new TreeNode(val);
            top.right.right=temp;
        }
        return root;
    }
}
