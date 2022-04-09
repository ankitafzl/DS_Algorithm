package BinarySearchTree;
public class SearchGivenTreeInBST {
	private TreeNode  root;
	private class TreeNode{
		private int data;
		private TreeNode  left;
		private TreeNode  right;
		public TreeNode(int data){
			this.data=data;
		}
	}
	
	public void insert(int value){
		root=insert(root,value);
	}
	public TreeNode insert(TreeNode root,int value){
		if(root==null){
			root=new TreeNode(value);
			return root;
		}
		if(value<root.data)
			root.left=insert(root.left,value);
		else
			root.right=insert(root.right,value);
		return root;
    }
	
	public TreeNode searchKey(int key){
		return searchKey(root,key);
	}
	
	public TreeNode searchKey(TreeNode root,int key){
		if(root==null){
			root=new TreeNode(key);
			return root;
		}
		if(key<root.data)
			root.left=insert(root.left,key);
		else
			root.right=insert(root.right,key);
		return root;
    }
	
	public void inOrder(){
		inOrder(root);
	}
	
	public void inOrder(TreeNode root){
		 if(root==null)
			 return;
		 inOrder(root.left);
		 System.out.print(root.data+" ");
		 inOrder(root.right);
   }
	
      public static void main(String []args){
    	  SearchGivenTreeInBST bst=new SearchGivenTreeInBST();
    	  bst.insert(5);
    	  bst.insert(3);
    	  bst.insert(7);
    	  bst.insert(1);
    	  bst.insert(9);
    	  
    	  bst.inOrder();
    	  System.out.println();
    	  if(null!=bst.searchKey(3))
    		  System.out.println("key found!!!");
    	  else
    		  System.out.println("key not found!!!");
      }
}
