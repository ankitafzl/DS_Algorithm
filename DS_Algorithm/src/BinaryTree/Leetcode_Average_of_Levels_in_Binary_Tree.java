package BinaryTree;
import java.util.*;
public class Leetcode_Average_of_Levels_in_Binary_Tree {

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
	
	public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Double> ans=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            long sum=0;
            for(int i=0;i<n;i++){
                TreeNode curr=queue.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            ans.add((double)sum/n);
        }
        return ans;
    }
	
}
