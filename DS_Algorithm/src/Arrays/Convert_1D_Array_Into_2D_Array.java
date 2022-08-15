package Arrays;

public class Convert_1D_Array_Into_2D_Array {
	 public int[][] construct2DArray(int[] original, int m, int n) {
	        int n1=original.length;
	        if(n1!=m*n){
	            return new int[0][0];
	        }
	        
	        int ans[][]=new int[m][n];
	        for(int i=0;i<n1;i++){
	            int nr=i/n;
	            int nc=i%n;
	            ans[nr][nc]=original[i];
	        }
	        return ans;
	    }
}
