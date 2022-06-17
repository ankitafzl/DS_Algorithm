package Arrays;

class TreeNode {
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
public class Binary_Tree_Cameras {

	int camera=0;
    public int minCameraCover(TreeNode root) {
        return dfs(root)==0?camera+1:camera;
    }
    
    public int dfs(TreeNode node){
        if(node==null){
            return 1;
        }
        int left=dfs(node.left);
        int right=dfs(node.right);
        
        if(left==0 || right==0){
            camera++;
            return 2;
        }
        else if(left==2 || right==2){
            return 1;
        }
        else{
            return 0;
        }
    }
}
