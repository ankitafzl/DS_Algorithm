package Binary_Search;

public class Leetcode_level_2_Search_a_2D_Matrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        if(m==0){
            return false;
        }
        int low=0;
        int high=(m*n)-1;
        
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(matrix[mid/n][mid%n]==target){
                return true;
            }
            if(matrix[mid/n][mid%n]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
