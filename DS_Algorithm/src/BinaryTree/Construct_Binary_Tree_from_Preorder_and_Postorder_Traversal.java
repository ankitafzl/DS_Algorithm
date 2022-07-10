package BinaryTree;

public class Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal {
	
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

	public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n=preorder.length;
        return constructFromPrePost(preorder,0,n-1,postorder,0,n-1);
    }
    public TreeNode constructFromPrePost(int []preorder,int psi,int pei,int []postorder,int ppsi,int ppei){
        if(psi>pei){
            return null;
        }
        TreeNode root=new TreeNode(preorder[psi]);
        if(psi==pei){
            return root;
        }
        int index=ppsi;
        while(postorder[index]!=preorder[psi+1]){
            index++;
        }
        int x=index-ppsi+1;
        
        root.left=constructFromPrePost(preorder,psi+1,psi+x,postorder,ppsi,index);
        root.right=constructFromPrePost(preorder,psi+x+1,pei,postorder,index+1,ppei+1);
        return root;
    }
}
