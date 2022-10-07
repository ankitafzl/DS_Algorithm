package LinkedList;

public class Gfg_flatten_binary_tree_to_linked_list {

	Node root;
	public class Node{
		Node left,right;
		int data;
		public Node(int d) {
			d=data;
			left=right=null;
		}
	}
	
	static Node current;
    public static void flatten(Node root)
    {
        //code here
        //current=new Node(-1);
        dfs(root);
    }
    
    static void dfs(Node root){
        if(root==null){
            return ;
        }
        Node left_subtree=root.left;
        root.left=null;
        
        Node right_subtree=root.right;
        root.right=null;
        
        current.right=root;
        current=current.right;
        
        dfs(left_subtree);
        dfs(right_subtree);
    }
}
