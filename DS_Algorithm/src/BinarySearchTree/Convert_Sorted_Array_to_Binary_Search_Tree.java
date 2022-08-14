package BinarySearchTree;

public class Convert_Sorted_Array_to_Binary_Search_Tree {
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
	public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
             return null;
        }
        TreeNode head = solve(nums, 0, nums.length - 1);
        return head;
    }

    public TreeNode solve(int[] num, int low, int high) {
       if (low > high) { // Done
            return null;
       }
       int mid = (low + high) / 2;
       TreeNode node = new TreeNode(num[mid]);
       node.left = solve(num, low, mid - 1);
       node.right = solve(num, mid + 1, high);
       return node;
    }
}
