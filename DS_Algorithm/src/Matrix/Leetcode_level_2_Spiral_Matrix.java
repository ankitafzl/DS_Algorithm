package Matrix;
import java.util.*;
public class Leetcode_level_2_Spiral_Matrix {
	 public List<Integer> spiralOrder(int[][] matrix) {
	        int m=matrix.length;
	        int n=matrix[0].length;
	        List<Integer> list=new ArrayList<>();
	        if(m==0){
	            return list;
	        }
	        int left=0,right=n-1;
	        int top=0,bottom=m-1;
	        int dir=0;
	        
	        while(left<=right && top<=bottom){
	            if(dir==0){
	                for(int i=left;i<=right;i++){
	                    list.add(matrix[top][i]);
	                }
	                dir=1;
	                top++;
	            }
	            else if(dir==1){
	                for(int i=top;i<=bottom;i++){
	                    list.add(matrix[i][right]);
	                }
	                dir=2;
	                right--;
	            }
	            else if(dir==2){
	                for(int i=right;i>=left;i--){
	                    list.add(matrix[bottom][i]);
	                }
	                dir=3;
	                bottom--;
	            }
	            else if(dir==3){
	                for(int i=bottom;i>=top;i--){
	                    list.add(matrix[i][left]);
	                }
	                dir=0;
	                left++;
	            }
	        }
	        return list;
	    }
}
