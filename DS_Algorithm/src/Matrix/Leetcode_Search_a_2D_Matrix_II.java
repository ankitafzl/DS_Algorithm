package Matrix;

public class Leetcode_Search_a_2D_Matrix_II {
	 public boolean searchMatrix(int[][] matrix, int target) {
	        int m=matrix.length;
	        int n=matrix[0].length;
	        if(matrix==null || m<1 || n<1){
	            return false;
	        }
	        
	        int i = 0;
	        int j = n-1;
	        while(i<m && j>=0){
	            if(matrix[i][j]==target){
	                return true;
	            } else if(target<matrix[i][j]){
	                j--;
	            } else {
	                i++;
	            }
	        }
	        
	        return false;
	    }
}
