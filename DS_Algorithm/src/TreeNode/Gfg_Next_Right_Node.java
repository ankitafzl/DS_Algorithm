package TreeNode;
import java.util.*;

public class Gfg_Next_Right_Node {
	
	Node root;
	class Node{
		int data;
		Node left,right;
		public Node(int d) {
			data=d;
			left=right=null;
		}
	}
	
	Node nextRight(Node root, int key)
    {
		//Write your code here
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		int x=0;
		while(!q.isEmpty()){
		    int n=q.size();
		    x=0;
		    Node ans=null;
		    for(int i=0;i<n;i++){
		        Node front=q.peek();
		        q.poll();
		        if(front.data==key){
		            x=1;
		            ans=front;
		        }
		        if(x==1 && ans!=front){
		            return front;
		        }
		        if(front.left!=null){
		            q.add(front.left);
		        }
		        if(front.right!=null){
		            q.add(front.right);
		        }
		    }
		}
		Node rNode=new Node(-1);
		return rNode;
    }
}
