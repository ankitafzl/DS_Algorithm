package Arrays;

public class Leetcode_Range_Sum_Query_Mutable {

	 public Leetcode_Range_Sum_Query_Mutable(int[] nums) {
	       root=build_Tree(nums,0,nums.length-1);
	    }
	    
	    public void update(int index, int val) {
	       update1(root,index,val);
	    }
	    
	    public int sumRange(int left, int right) {
	        return sumRange1(root,left,right);
	    }
	    
	    
	    
	    class Segment_TreeNode{
	        private int st,end;
	        private Segment_TreeNode left,right;
	        private int sum;
	        
	        public Segment_TreeNode(int st,int end){
	            this.st=st;
	            this.end=end;
	            this.left=null;
	            this.right=null;
	            this.sum=0;
	        }
	    }
	    
	    Segment_TreeNode root=null;
	    
	    private Segment_TreeNode build_Tree(int []nums,int st,int end){
	        if(st>end){
	            return null;
	        }
	        else{
	            Segment_TreeNode seg_t=new Segment_TreeNode(st,end);
	            if(st==end){
	                seg_t.sum=nums[st];
	            }
	            else{
	                int mid=st+(end-st)/2;
	                seg_t.left=build_Tree(nums,st,mid);
	                seg_t.right=build_Tree(nums,mid+1,end);
	                seg_t.sum=seg_t.left.sum+seg_t.right.sum;
	            }
	             return seg_t;
	        }
	       
	    }
	    
	    void update1( Segment_TreeNode root,int index,int val){
	        if(root.st==root.end){
	            root.sum=val;
	        }
	        else{
	            int mid=root.st+(root.end-root.st)/2;
	            if(index<=mid){
	                update1(root.left,index,val);
	            }
	            else{
	                update1(root.right,index,val);
	            }
	            root.sum=root.left.sum+root.right.sum;
	        }
	    }
	    
	    public int sumRange1(Segment_TreeNode root,int st,int end){
	        if(root.end==end && root.st==st){
	            return root.sum;
	        }
	        else{
	            int mid=root.st+(root.end-root.st)/2;
	            if(end<=mid){
	                return sumRange1(root.left,st,end);
	            }
	            else if(st>=mid+1){
	                return sumRange1(root.right,st,end);
	            }
	            else{
	                return sumRange1(root.left,st,mid) + sumRange1(root.right,mid +1,end);
	            }
	        }
	    }
	    
	
}
