package hashing;
import java.util.*;
public class Lowest_Common_Ancestor_of_Deepest_Leaves {

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
	
	 Map<TreeNode, TreeNode> parent_map = new HashMap<>();
	    Map<Integer, Queue<TreeNode>> depth_map = new HashMap<>();
	    int max = 0;
	    public TreeNode lcaDeepestLeaves(TreeNode root) {
	        if (root == null){
	            return root;
	        } 
	        dfs(root, 0);
	        Queue<TreeNode> queue = depth_map.get(max); 
	        if (queue.size() == 1) {
	            return queue.poll();
	        }
	        
	        while (!queue.isEmpty()) {
	            int len = queue.size();
	            Set<TreeNode> set = new HashSet<>();
	            while (len --> 0) {
	                TreeNode node = queue.poll();
	                set.add(parent_map.get(node));
	            }
	            if (set.size() == 1){
	                return set.iterator().next();
	            } 
	            queue.addAll(set);
	        }
	        
	        return root;
	    }
	    
	    private void dfs(TreeNode node, int depth) {
	        if (node.left == null && node.right == null) {
	            max = Math.max(max, depth);
	            depth_map.putIfAbsent(depth, new LinkedList<>());
	            depth_map.get(depth).offer(node);
	            return;
	        }
	        if (node.left != null) {
	            parent_map.put(node.left, node);
	            dfs(node.left, depth + 1);
	        }
	        if (node.right != null) {
	            parent_map.put(node.right, node);
	            dfs(node.right, depth + 1);    
	        }
	    }
}
