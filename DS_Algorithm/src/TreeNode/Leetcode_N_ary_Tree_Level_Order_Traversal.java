package TreeNode;
import java.util.*;
public class Leetcode_N_ary_Tree_Level_Order_Traversal {

	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int val) {
	        this.val = val;
	    }

	    public Node(int val, List<Node> children) {
	        this.val = val;
	        this.children = children;
	    }
	}
	
	public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
       
        while(!queue.isEmpty()){
            int n=queue.size();
            List<Integer> list=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                Node temp=queue.peek();
                queue.poll();
                
                for(Node c:temp.children){
                    queue.offer(c);
                }
                list.add(temp.val);
            }
            ans.add(list);
        }
        return ans;
    }
}
