package Dynamic_Programming;
import java.util.*;
public class All_Possible_Full_Binary_Trees {

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
	
	HashMap<Integer,ArrayList<TreeNode>> dp=new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        if(n==1){
            List<TreeNode> list=new ArrayList<TreeNode>();
            list.add(new TreeNode(0));
            return list;
        }
        
        List<TreeNode> left_node,right_node;
        List<TreeNode> all_combination=new ArrayList<TreeNode>();
        
        for(int i=1;i<n;i=i+2){
            left_node=allPossibleFBT(i);
            right_node=allPossibleFBT(n-i-1);
            for(int j=0;j<left_node.size();j++){
                for(int k=0;k<right_node.size();k++){
                    TreeNode root=new TreeNode(0);
                    root.left=left_node.get(j);
                    root.right=right_node.get(k);
                    
                    all_combination.add(root);
                }
            }
        }
        dp.put(n,(ArrayList<TreeNode>)all_combination);
        return all_combination;
    }
}
