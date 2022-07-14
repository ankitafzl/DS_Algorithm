package TreeNode;
import java.util.*;
public class ConstructBinaryTree {
	
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

	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		
        if (preorder.length == 0) {
           return null;
       }
       
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < inorder.length; i++) {
           map.put(inorder[i], i);
       }
       Stack<TreeNode> stack = new Stack<>();
       int val = preorder[0];
       TreeNode root = new TreeNode(val);
       stack.push(root);
       
       for (int i = 1; i < preorder.length; i ++) {
           
           val
               = preorder[i];
           TreeNode node = new TreeNode(val);
           
           if (map.get(val) < map.get(stack.peek().val)) {
              
               stack.peek().left = node;
           } 
           else {
              
               TreeNode parent = null;
               while(!stack.isEmpty() && map.get(val) > map.get(stack.peek().val)) {
                   parent = stack.pop();
               }
               parent.right = node;
           }
           stack.push(node);
       }
       
       return root;
   
   }
}
