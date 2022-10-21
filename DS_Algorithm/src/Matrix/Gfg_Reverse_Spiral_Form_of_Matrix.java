package Matrix;
import java.util.*;
public class Gfg_Reverse_Spiral_Form_of_Matrix {
	 public int[] reverseSpiral(int R, int C, int[][] a)
	    {
	        // code here
	        
	        ArrayList<Integer> list=new ArrayList<>();
	        
	        int s_row=0,s_col=0,end_row=R-1,end_col=C-1;
	        while(s_row<=end_row && s_col<=end_col){
	            for(int i=s_col;i<=end_col;i++){
	                list.add(a[s_row][i]);
	            }
	            s_row++;
	            
	            for(int i=s_row;i<=end_row;i++){
	                list.add(a[i][end_col]);
	            }
	            end_col--;
	            if(s_row <= end_row){
	                for(int i=end_col;i>=s_col;i--){
	                    list.add(a[end_row][i]);
	                }
	            }
	            end_row--;
	            
	            if(s_col <= end_col){
	                for(int i=end_row;i>=s_row;i--){
	                   list.add(a[i][s_col]);
	                }
	            }
	            s_col++;
	        }
	         Collections.reverse(list);
	        int ans[]=new int[list.size()];
	        for(int i=0;i<list.size();i++){
	            ans[i]=list.get(i);
	        }
	       
	        return ans;
	    }
}
